package com.it.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.User;
import com.it.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/user")
	public ResponseEntity<String> getUser() {
		logger.debug("add new user Controller ");

		User user = new User("laftimi", "adam", "adam", "adam");
		user = userService.addUser(user);
		return new ResponseEntity<String>("start ok " + user, HttpStatus.OK);
	}

}
