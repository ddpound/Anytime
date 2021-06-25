package com.anytime.root.user.dao;

import com.anytime.root.user.dto.UserDTO;

public interface UserDAO {
	public void insertUser(UserDTO dto);
	public UserDTO loginUser(String email);
	
	
}
