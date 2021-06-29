package com.anytime.root.individual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anytime.root.individual.repository.ScoreRepository;

@Service
public class ScoreServiceImpl implements ScoreService{

	private final ScoreRepository scoreRepository;
	@Autowired
	public ScoreServiceImpl(ScoreRepository scoreRepository) {
		this.scoreRepository = scoreRepository;
	}
	@Override
	public void getScore() {
		System.out.println("test");
	}
	
}
