package com.johnabbott.final_exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.final_exam.dao.UserDao;
import com.johnabbott.final_exam.model.UserEntity;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public String validate(UserEntity usr) {
		if(userDao.validate(usr)) {
			return "redirect:/home";
		} else {
			return "redirect:/register";
		}
	}

	@Override
	public boolean addUser(UserEntity usr) {
		return userDao.addUser(usr) >0;

	}

}
