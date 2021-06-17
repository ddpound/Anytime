package com.anytime.root.bookshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//일반 컨트롤러는 그냥 일반 컨트롤러
//REST컨트롤러는 따로 API라는 이름을 붙여 사용함
//반듯이 restful 하게 만들것
// bookShop/write/{userName}
// 아니면 익명이니깐 bookShop/write로 갈까
// 꼭 끝의 값은 / 가 아닌 변수값을 넣어줘야한다

import com.anytime.root.bookshop.service.BookShopService;

@RestController
public class BookShopApiController {
	
	@Autowired
	BookShopService bs;
	
	
	@GetMapping(value = "bookShop/search/{SearchCode}")
	public ResponseEntity<String> SearchBook(@PathVariable String SearchCode) {
		System.out.println("SearchCode : " +SearchCode );
		String result = bs.responseBookSearch(SearchCode).getBody();
		System.out.println("responseBody : " +result);
		
		return null;
	}
	
	
	
}
