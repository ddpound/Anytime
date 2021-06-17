package com.anytime.root.bookshop.service;

import org.springframework.http.ResponseEntity;



public interface BookShopService {
	public ResponseEntity<String> responseBookSearch(String searchCode);
	

}
