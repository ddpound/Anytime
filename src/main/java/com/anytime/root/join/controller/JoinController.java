package com.anytime.root.join.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.anytime.root.join.service.JoinService;
import com.anytime.root.kakaoLogin.service.KaKaoLoginService;
import com.anytime.root.kakaoLogin.service.KakaoLoginInfo;
import com.anytime.root.school.service.SchoolService;
import com.anytime.root.user.dto.KakaoProfile;
import com.anytime.root.user.dto.OAuthToken;
import com.anytime.root.user.dto.School;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class JoinController {
	
	@Autowired
	KaKaoLoginService kkls;
	
	@Autowired
	SchoolService schs;
	
	@Autowired
	JoinService js;

	@RequestMapping("selectJoin")
	public String joinView() {
		return "join/selectJoin";
	}

	@GetMapping(value = "auth/kakao/callback")
	public String kakaoJoin(@RequestParam("code") String code, Model model) {
		
		KakaoProfile kakaoProfile =kkls.intergration(code);
		
		model.addAttribute("email", kakaoProfile.getKakao_account().getEmail());
		model.addAttribute("ageGroup", kakaoProfile.getKakao_account().getAge_range());
		model.addAttribute("nickname", kakaoProfile.getProperties().getNickname());
		
		
		// response.getBody(); // body형식의 데이터 타입으로 편하게 리턴할수 있다 
		return "join/joinView";
	}
	
	@PostMapping(value = "saveUser", produces = "appication/json;charset=utf-8" )
	@ResponseBody
	public String saveUser(@RequestBody Map<String, Object> user ) {
		
		int resultNum = js.insertUser(user);
		
		
		
		
		
		
		
		
		return "{\"test\" : true}";
	}
	
	@RequestMapping("SearchSchool")
	public String ShowSearchSchool() {
		
		
		ResponseEntity<String> response = schs.responeSchoolEntity("가좌고");
		System.out.println("리스폰 겟 바디 : " + response.getBody());
		
		School schoolObject = schs.getSchool(response);
		
		System.out.println("검색결과 길이"+ schoolObject.getDataSearch().getContent().size() );
		System.out.println("학교이름 : "+ schoolObject.getDataSearch().getContent().get(0).getSchoolName());
		
		//System.out.println("리스트 첫번째 결과 : " + schoolObject.getDataSearch().getContent().get(0).getSchoolName());
		
		return "join/SearchSchool";
	}

}
