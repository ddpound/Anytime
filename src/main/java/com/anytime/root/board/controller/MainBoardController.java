package com.anytime.root.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anytime.root.board.service.MainBoardService;
import com.anytime.root.bookshop.service.BookShopService;
import com.anytime.root.common.session.SessionName;

@Controller
public class MainBoardController {

	private final MainBoardService boardService;
	
	@Autowired
	public MainBoardController(MainBoardService boardService) {
		this.boardService = boardService;
	}
	
	@Autowired
	public BookShopService BShopService;
	
	@RequestMapping("rule/servicerule")
	public String servicerule() {
		return "rule/servicerule";
	}
	
	@RequestMapping("rule/servicerule2")
	public String servicerule2() {
		return "rule/servicerule2";
	}
	
	@RequestMapping("rule/servicerule3")
	public String servicerule3() {
		return "rule/servicerule3";
	}
	
	@RequestMapping("board/index")
	public String main(Model model, HttpSession session) {
		String id = (String)session.getAttribute(SessionName.ID);
		String schoolName = (String)session.getAttribute(SessionName.SCHOOL_NAME);
		String school = (String)session.getAttribute(SessionName.SCHOOL);
		boardService.getMain(id, schoolName, school);
		
		//추가(사진 미리보기 부분)		
		model.addAttribute("previewBookShop", BShopService.preViewBookShop());
		model.addAttribute("previewBookShopPhoto", BShopService.preViewBookShopPhoto());
		
		return "board/index";
	}
	
	@RequestMapping("board/admin/common")
	public String adminCommon(Model model) {
		return "board/index";
	}
	
	@RequestMapping("board/admin/school")
	public String adminSchool(Model model) {
		return "board/index";
	}
}
