package com.anytime.root.login.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
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
import com.anytime.root.script.ScriptUtils;
import com.anytime.root.user.dto.KakaoProfile;

@Controller
public class LoginController {
	@Autowired
	KaKaoLoginService kkls;
	
	@Autowired
	LoginService ls;
	
	@GetMapping(value = "auth/kakao/login/callback")
	public void kakaoJoin(@RequestParam("code") String code, Model model , HttpSession session,
			HttpServletResponse response) throws Exception {
		
		// 카카오 프로파일 정보랑 DB랑 이메일 비교를 해야함
		KakaoProfile kakaoProfile =kkls.intergration(code, KakaoLoginInfo.Loginredirect_uri);
		String email = kakaoProfile.getKakao_account().getEmail();
		String nickName = kakaoProfile.getProperties().getNickname();
		
		System.out.println("로그인한 아이디 : " + email);
		
		int resultNum = ls.loginCheckIdDto(email,session,"login");
		
		
		if(resultNum ==1) {
			session.setAttribute("userId", email);
			session.setAttribute("userNickname", nickName);
			 
			// 로그인 성공, 메인으로 보내는것은 똑같음
			ScriptUtils.alertAndMovePage(response, "로그인 완료했습니다.", "/root");
		}
		
		
		//로그인 안됐을때 (alret 창 나중에 띄어주기) 
		ScriptUtils.alertAndMovePage(response, "없는 아이디입니다 회원가입시도해주세요.", "/root");
	}
	
	@RequestMapping(value = "loginView")
	public String LoginView() {
		return "login/loginView";
	}
	
	@GetMapping("auth/kakao/logout")
	public String Logout(HttpSession session) {
		session.removeAttribute("userId");
		session.removeAttribute("userSchool");
		session.removeAttribute("userNickname");
		
		return "redirect:/";
	}

}
