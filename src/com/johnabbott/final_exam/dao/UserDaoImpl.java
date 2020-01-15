package com.johnabbott.final_exam.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.johnabbott.final_exam.model.UserEntity;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public boolean validate(UserEntity usr) {

        UserEntity userEntity = null;
        String email = usr.getEmail();
        String password = usr.getPassword();
      
        userEntity = (UserEntity) getSession().createQuery("FROM UserEntity WHERE email = :email").setParameter("email", email).uniqueResult();

            if (userEntity != null && userEntity.getPassword().equals(password)) {

    			return true;
            }
        return false;
    }
	
	
	

	
	@Override
	public int addUser(UserEntity usr) {
		sessionFactory.getCurrentSession().save(usr);
		return 0;
	}

	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
}
