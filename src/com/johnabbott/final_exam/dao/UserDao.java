package com.johnabbott.final_exam.dao;

import com.johnabbott.final_exam.model.UserEntity;

public interface UserDao {
	boolean validate(UserEntity usr);
	
	public int addUser(UserEntity usr);
}
