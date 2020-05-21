package com.it.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.UserRepository;
import com.it.model.User;

@Service
public class UserServiceImpl implements UserService {

	private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository userDao;

	public UserServiceImpl() {

	}

	@Override
	public User addUser(User newUser) {
		LOGGER.debug("create new user :  {} ",newUser);
		if(null == newUser) {
			throw new NullPointerException("not valid user : null ") ;
		}
		return userDao.save(newUser) ;
		
	}

}
