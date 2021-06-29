package com.anytime.root.individual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anytime.root.individual.service.ScoreService;

@Controller
public class ScoreController {
	
	private final ScoreService scoreService;
	@Autowired
	public ScoreController(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	@RequestMapping("score")
	public String getScore() {
		scoreService.getScore();
		return "score/score";
	}
}
