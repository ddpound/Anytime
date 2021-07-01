package com.anytime.root.bookshop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anytime.root.bookshop.dao.BookShopDAO;
import com.anytime.root.bookshop.dto.BookShopDTO;
import com.anytime.root.bookshop.dto.BookShopPhotoDTO;
import com.anytime.root.bookshop.service.BookShopService;

// REST쪽이 아니니깐 view와 ATTRibute를 반환하자

@Controller
public class BookShopController {
	@Autowired
	BookShopService Bs;
	int nowPage;
	
	
	
	@GetMapping(value = {"bookshop/{pageNum}" , "bookshop"})
	public String showBookShop(Model model,
			@PathVariable(value = "pageNum",required = false)Integer pageNum ) {
		//  default 값이 1로 하게 만들기위해서
		if(pageNum==null) {
			pageNum =1;
		}
		System.out.println("페이지 현재 : "+pageNum);
		nowPage = pageNum;
		
		ArrayList<BookShopDTO> ResultList = new ArrayList<BookShopDTO>();
		Map<Integer, BookShopPhotoDTO> AllBookPhotoList =  new HashMap<Integer, BookShopPhotoDTO>();
		
		ResultList = Bs.PageselectBookShop(nowPage);
		AllBookPhotoList = Bs.AllListBookBoardPhoto();
		
		for(int i=0;i <ResultList.size() ;i++) {
			System.out.println("컨트롤단의 북제목확인 : "+ResultList.get(i).getBooktitle());
		}
		
		model.addAttribute("AllBookPhotoList",AllBookPhotoList);
		model.addAttribute("PageboardList",ResultList);
		
		model.addAttribute("allPageCount",Bs.getBoardListCount());
		model.addAttribute("nowPage",nowPage);
		
		return "bookshop/bookShopMain";
	}
	
	@RequestMapping(value = "bookShop/write")
	public String GoWritePage() {
		
		return "bookshop/bookShopWrite";
	}
	
	// 게시글 보기
	@GetMapping(value =  "bookshop/{nowPage}/{boardId}")
	public String bookShopView(@PathVariable("boardId")int id, Model model) {
		
		System.out.println("받은값 확인 "+ id);
		// 여기다가 model 값을 추가해주면됨
		model.addAttribute("BookShop",Bs.SearchbookshopId(id));
		
		return "bookshop/BookShopView";
	}
	
}
