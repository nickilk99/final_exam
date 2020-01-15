package com.johnabbott.final_exam.service;

import com.johnabbott.final_exam.model.UserEntity;

public interface UserService {
	
	public boolean addUser(UserEntity usr);

	public String validate(UserEntity usr);

	
}
