package com.anytime.root.join.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anytime.root.login.service.LoginService;
import com.anytime.root.user.dao.UserDAO;
import com.anytime.root.user.dto.UserDTO;

@Service
public class JoinServiceImpl implements JoinService{
	@Autowired
	LoginService ls;
	
	
	@Autowired
	UserDAO mapper;
	
	//http 클래스를 이용해서 요청하기
	// 먼저 json값을 담을 클래스를 작성 -> 카카오로그인처럼 데이터를 담아낸다
	
	
	
	@Override
	public int insertUser(Map<String, Object> user) {
		UserDTO dto = new UserDTO();

		System.out.println("입학년도 : "+ user.get("enterYear"));
		System.out.println("현재학년 : "+user.get("grade"));

		dto.setEmail((String)user.get("email"));
		dto.setUsername((String)user.get("nickname")); // 닉네임
		dto.setAge((String)user.get("age"));
		dto.setEnterYear((String)user.get("enterYear"));
		dto.setGrade(Integer.parseInt((String)user.get("grade"))); 
		dto.setSchool((String)user.get("parSchoolName")+" : "+ (String)user.get("parSchooladd")); // 여기 주소값이랑 다담겨있음 . 을 구분으로 split하면될듯
		dto.setAgeGroup((String)user.get("ageGroup"));
		
		System.out.println("잘 받아와지는지 확인"+(String)user.get("joinauth"));
		
		dto.setAuth("kakao");
		dto.setPassWord("1234");
		dto.setRule("user");
		
		// 1이면 아이디가 있는거니깐 0이여야함
		int resultNum = ls.loginCheckIdDto(dto.getEmail(), null, "join");
		
		if (resultNum ==1) {
			return 0;
		}
		
		// 가입일로부터 일단 무조건 3년 후
		mapper.insertUser(dto);
		
		return 1;
	}
	
}
