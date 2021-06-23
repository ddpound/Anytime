package com.anytime.root.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anytime.root.bookshop.dao.BookShopDAO;
import com.anytime.root.bookshop.dto.BookShopDTO;
import com.anytime.root.bookshop.service.BookShopService;

// REST쪽이 아니니깐 view와 ATTRibute를 반환하자

@Controller
public class BookShopController {
	@Autowired
	BookShopService Bs;
	
	
	@GetMapping("bookshop")
	public String showBookShop(Model model) {
		// 임시로 넣어놓은 이미지 값을 확인을 위해서 넣어놓음
		BookShopDTO dto = new BookShopDTO();
		System.out.println("select하기전");
		dto = Bs.SelectBook(null);
		String src = dto.getPhoto();
		System.out.println(dto.getBookisbn());
		System.out.println("select하기후");
		
		model.addAttribute("Imgsrc", src);
		
		return "bookshop/bookShopMain";
	}
	
	@RequestMapping(value = "bookShop/write")
	public String GoWritePage() {
		
		return "bookshop/bookShopWrite";
	}
	
}
