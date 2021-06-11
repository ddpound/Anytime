package com.anytime.root.join.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anytime.root.user.dao.UserDAO;
import com.anytime.root.user.dto.UserDTO;

@Service
public class JoinServiceImpl implements JoinService{

	@Autowired
	UserDAO mapper;
	
	
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
		dto.setAgeGroup("");
		
		
		dto.setAuth("kakao");
		dto.setPassWord("1234");
		dto.setRule("user");
		
		
		
		mapper.insertUser(dto);
		
		return 1;
	}
	
}
