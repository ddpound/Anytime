package com.anytime.root.board.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.anytime.root.board.dto.CommonLikeBoard;
import com.anytime.root.board.dto.Reply;
import com.anytime.root.board.dto.SchoolLikeBoard;

public interface MainBoardRepository {
	public ArrayList<CommonLikeBoard> getCmnBoardByDate();
	public ArrayList<SchoolLikeBoard> getSchoolBoardByDate(@Param("section")String section, @Param("school")String school);
	public ArrayList<CommonLikeBoard> getCmnBoardByLike();
	public ArrayList<SchoolLikeBoard> getSchoolBoardByLike(@Param("section")String section, @Param("school")String school);
	public ArrayList<CommonLikeBoard> getMyCmnBoard(String id);
	public ArrayList<SchoolLikeBoard> getMySchoolBoard(String id);
	public ArrayList<Reply> getMyreplyList(String id);
	public ArrayList<CommonLikeBoard> getCmnBoardForAdmin();
	public ArrayList<SchoolLikeBoard> getSchoolBoardForAdmin(String section);
}
