package com.anytime.root.kakaoLogin.service;

import org.springframework.stereotype.Component;

// 반듯이 component 어노테이션을 붙여줘야한다
@Component
public  final class KakaoLoginInfo {
	// 코드 그대로 쏘는것도 문제니깐 이렇게 클래스에 담아서 jsp에 보내주자
	public static final String LoginRequestURI = "https://kauth.kakao.com/oauth/authorize?"
			+ "client_id=a924c282a86092b8472e6c2885aafe4a&"
			+ "redirect_uri=http://localhost:8080/auth/kakao/callback&response_type=code HTTP/1.1";
	
	public static final String grant_type ="authorization_code";
	public static final String client_id = "a924c282a86092b8472e6c2885aafe4a";
	public static final String redirect_uri = "http://localhost:8080/root/auth/kakao/callback";
	public static final String OauthToken_request = "https://kauth.kakao.com/oauth/token"; // 인증토큰주소
	public static final String UserInfoSelect = "https://kapi.kakao.com/v2/user/me"; // 사용자 정보조회에 필요함
	
	public static final String ContentType = "application/x-www-form-urlencoded;charset=utf-8";
	
}
