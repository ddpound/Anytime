package com.anytime.root.join.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	@RequestMapping("joinView")
	public String joinView() {
		return "join/joinView";
	}
	
	
	
}
