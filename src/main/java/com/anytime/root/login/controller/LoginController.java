package com.anytime.root.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anytime.root.kakaoLogin.service.KaKaoLoginService;
import com.anytime.root.kakaoLogin.service.KakaoLoginInfo;
import com.anytime.root.login.service.LoginService;
import com.anytime.root.user.dto.KakaoProfile;

@Controller
public class LoginController {
	@Autowired
	KaKaoLoginService kkls;
	
	@Autowired
	LoginService ls;
	
	@GetMapping(value = "auth/kakao/login/callback")
	public String kakaoJoin(@RequestParam("code") String code, Model model , HttpSession session) {
		
		// 카카오 프로파일 정보랑 DB랑 이메일 비교를 해야함
		KakaoProfile kakaoProfile =kkls.intergration(code, KakaoLoginInfo.Loginredirect_uri);
		String email = kakaoProfile.getKakao_account().getEmail();
		String nickName = kakaoProfile.getProperties().getNickname();
		
		System.out.println("로그인한 아이디 : " + email);
		
		int resultNum = ls.loginCheckIdDto(email,session,"login");
		
		
		if(resultNum ==1) {
			session.setAttribute("userId", email);
			session.setAttribute("userNickname", nickName);
			
			return "redirect:/";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "loginView")
	public String LoginView() {
		return "login/loginView";
	}
	

}
