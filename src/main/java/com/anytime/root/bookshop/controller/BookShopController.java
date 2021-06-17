package com.anytime.root.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// REST쪽이 아니니깐 view와 ATTRibute를 반환하자

@Controller
public class BookShopController {
	
	@GetMapping("bookshop")
	public String showBookShop(Model model) {
		
		return "bookshop/bookShopMain";
	}
	
	@RequestMapping(value = "bookShop/write")
	public String GoWritePage() {
		
		return "bookshop/bookShopWrite";
	}
	
}
