package com.anytime.root.board.service;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.anytime.root.board.dto.CommonBoard;
import com.anytime.root.board.dto.LikePost;
import com.anytime.root.board.dto.Reply;
import com.anytime.root.board.repository.CommonBoardRepository;

@Service
public class CommonBoardServiceImpl implements CommonBoardService{
	
	private StringTokenizer st;
	private final CommonBoardRepository boardRepository;
	private final int pageSize = 10;

	@Autowired
	public CommonBoardServiceImpl(CommonBoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@Override
	public void getListAndLike(Model model, int page, String searchType, String keyword) {
		int allCount = 1;
		if(keyword == null) {
			allCount = boardRepository.listCount();
		}else if(keyword.equals("tag")){
			allCount = boardRepository.tagListCount(keyword);	//아직 안함
		}else {
			allCount = boardRepository.searchListCount(searchType, keyword);
		}
		int pageCount = (allCount%pageSize != 0) ? (allCount/pageSize)+1: (allCount/pageSize);
		int end = page * pageSize;
		int start = end + 1 - pageSize;
		model.addAttribute("pageCount", pageCount);
		if(keyword == null) {
			model.addAttribute("commonBoardList", boardRepository.getListLike(start, end));
		}else if(keyword.equals("tag")){
			model.addAttribute("commonBoardList", boardRepository.getTagListLike(start, end, keyword));	//아직 안함
		}else {
			model.addAttribute("commonBoardList", boardRepository.getSearchListLike(start, end, searchType, keyword));
		}
	}

	@Override
	public int writePost(CommonBoard board, String tag, String unknown) {
		if(unknown.equals("on")){
			board.setNickname("익명이");
		}
		boardRepository.writePost(board);
		int postNo = boardRepository.viewPostNo();
		if(tag != null) {
			String str = tag.replaceAll("[`~!@$%&*+:;]", "").replace(" ", "");	
			st = new StringTokenizer(str, "#");
			while(st.hasMoreTokens()) {
				boardRepository.addTag(postNo, st.nextToken());
			}
		}
		return postNo;
	}
	
	@Override
	public void viewPost(Model model, int postNo) {
		model.addAttribute("board", boardRepository.viewPost(postNo));
		model.addAttribute("replyList", boardRepository.replyList(postNo));
		ArrayList<String> tagList = boardRepository.tagList(postNo);
		if(tagList.size() != 0) {
			String tags = "";
			for (String str : tagList) {
				tags += "#"+str+" ";
			}
			model.addAttribute("tagList", tags);
		}
	}
	
	@Override
	public void viewPost(Model model, int postNo, String login) {
		CommonBoard board = boardRepository.viewPost(postNo);
		if(!board.getWriterId().equals(login)) {
			boardRepository.viewsUp(postNo);
		}
		model.addAttribute("board", boardRepository.viewPost(postNo));
		model.addAttribute("replyList", boardRepository.replyList(postNo));
		model.addAttribute("tagList", boardRepository.tagList(postNo));
	}
	
	@Override
	public void modifyPost(CommonBoard board, String tag, String unknown) {
		if(unknown.equals("on")){
			board.setNickname("익명이");
		}
		boardRepository.modifyPost(board);		
		int postNo = board.getPostNo();
		if(tag != null) {
			boardRepository.deleteAllTag(postNo);
			String str = tag.replaceAll("[`~!@$%&*+:;]", "").replace(" ", "");	
			st = new StringTokenizer(str, "#");
			while(st.hasMoreTokens()) {
				boardRepository.addTag(postNo, st.nextToken());
			}
		}
	}
	
	@Override
	public void deletePost(int postNo) {
		boardRepository.likeDeleteByPostNo(postNo);
		boardRepository.deleteReplyByPostNo(postNo);
		boardRepository.deleteAllTag(postNo);
		boardRepository.deletePost(postNo);
	}

	@Override
	public void likeUpdate(int postNo, String id) {
		LikePost like = new LikePost();
		like.setPostNo(postNo);
		like.setId(id);
		int result = boardRepository.likeCheck(like);
		if(result == 0) {
			boardRepository.likeUpdate(like);
		}else {
			boardRepository.likeDelete(like);
		}
	}

	@Override
	public int likeCount(int postNo) {
		return boardRepository.likeCount(postNo);
	}

	@Override
	public void reply(Reply reply) {
		boardRepository.reply(reply);
	}
	
	@Override
	public void reReply(Reply reply) {
		reply.setParentNo(reply.getReplyNo());
		boardRepository.reReply(reply);
	}

	@Override
	public ArrayList<Reply> getReplyList(int postNo) {
		return boardRepository.replyList(postNo);
	}

	@Override
	public void modifyReply(Reply reply) {
		boardRepository.modifyReply(reply);		
	}

	@Override
	public void deleteReply(int replyNo) {
		boardRepository.deleteReply(replyNo);
	}

}
