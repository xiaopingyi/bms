package com.iss.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iss.dao.UserDao;
import com.iss.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao<User> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User save(User o) {
		Session session = sessionFactory.getCurrentSession();
		session.save(o);
		return o;
	}

}
