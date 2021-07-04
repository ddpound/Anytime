package com.anytime.root.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anytime.root.board.repository.MainBoardRepository;

@Service
public class MainBoardServiceImpl implements MainBoardService{
	
	private final MainBoardRepository boardRepository;
	@Autowired
	public MainBoardServiceImpl(MainBoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	@Override
	public void getMain(String id, String schoolName, String school) {
		System.out.println("getMain");
	}
}
