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
	
	
	@GetMapping("bookshop")
	public String showBookShop(Model model,
			@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum ) {
		System.out.println("페이지 현재 : "+pageNum);
		
		ArrayList<BookShopDTO> ResultList = new ArrayList<BookShopDTO>();
		Map<Integer, BookShopPhotoDTO> AllBookPhotoList =  new HashMap<Integer, BookShopPhotoDTO>();
		
		ResultList = Bs.PageselectBookShop(pageNum);
		AllBookPhotoList = Bs.AllListBookBoardPhoto();
		
		for(int i=0;i <ResultList.size() ;i++) {
			System.out.println("컨트롤단의 북제목확인 : "+ResultList.get(i).getBooktitle());
		}
		
		model.addAttribute("AllBookPhotoList",AllBookPhotoList);
		model.addAttribute("PageboardList",ResultList);
		model.addAttribute("allPageCount",Bs.getBoardListCount());
		
		
		return "bookshop/bookShopMain";
	}
	
	@RequestMapping(value = "bookShop/write")
	public String GoWritePage() {
		
		return "bookshop/bookShopWrite";
	}
	
	// 게시글 보기
	@GetMapping(value = "root/bookshop/{boardId}")
	public String bookShopView(@PathVariable("boardId")int i) {
		
		System.out.println("받은값 확인 "+ i);
		
		return "bookshop/BookShopView";
	}
	
}
