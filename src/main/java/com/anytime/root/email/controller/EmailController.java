package com.anytime.root.email.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anytime.root.email.service.MailSendService;

@Controller
public class EmailController {
	 @Autowired
	    private MailSendService mss;
	
	
	@RequestMapping("/member/signUp")
    public String signUp(HttpServletRequest requ){
       // DB에 기본정보 insert
       

       //임의의 authKey 생성 & 이메일 발송
       String authKey = mss.sendAuthMail(requ.getParameter("generalEmail"));
       

       Map<String, String> map = new HashMap<String, String>();
       map.put("email",requ.getParameter("generalEmail"));
       map.put("authKey",authKey);
       System.out.println(map);

     //DB에 authKey 업데이트
     return "join/joinView";

 	}
	
	
	
	
	@GetMapping("/member/signUpConfirm")
	 public String signUpConfirm(@RequestParam Map<String, String> map, ModelAndView mav){
	    //email, authKey 가 일치할경우 authStatus 업데이트
	    
	    
	    mav.addObject("display", "/view/member/signUp_confirm.jsp");
	    mav.setViewName("/join/index");
	    return "join/joinView";
	}
	
}
