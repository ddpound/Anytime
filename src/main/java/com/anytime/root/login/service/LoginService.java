package com.anytime.root.login.service;

import javax.servlet.http.HttpSession;

import com.anytime.root.user.dto.UserDTO;

public interface LoginService {
	//login단계에서쓰고싶으면 login 아니면join
	public int loginCheckIdDto(String email, HttpSession session,String loginjoin); 
}
