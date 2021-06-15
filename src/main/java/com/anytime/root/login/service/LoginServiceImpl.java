package com.anytime.root.login.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anytime.root.user.dao.UserDAO;
import com.anytime.root.user.dto.UserDTO;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	UserDAO mapper;

	@Override
	public int loginCheckIdDto(String email, HttpSession session,String loginjoin) {
		UserDTO dto = new UserDTO();

		dto = mapper.loginUser(email);
		if (dto != null) {
			if(loginjoin.equals("login")) {
				session.setAttribute("userSchool", dto.getSchool());
			}
			return 1;
		}
		return 0;
	}

}
