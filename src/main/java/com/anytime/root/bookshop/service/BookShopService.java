package com.anytime.root.bookshop.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;

import com.anytime.root.bookshop.dto.BookShopDTO;



public interface BookShopService {
	public ResponseEntity<String> responseBookSearch(String searchCode);
	
	public int SaveBookShop(Map<String, Object>map,HttpSession session);
	
	public BookShopDTO SelectBook(String isbn);

}
