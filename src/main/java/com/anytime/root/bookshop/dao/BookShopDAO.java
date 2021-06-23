package com.anytime.root.bookshop.dao;

import com.anytime.root.bookshop.dto.BookShopDTO;

public interface BookShopDAO {
	
	public void SaveBookShop(BookShopDTO dto);
	
	// 게시판 검색
	public BookShopDTO selectBook(String bookisbn);

}
