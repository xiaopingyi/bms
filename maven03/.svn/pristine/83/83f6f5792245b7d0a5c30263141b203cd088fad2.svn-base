package com.iss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iss.model.User;
import com.iss.service.UserService;

@Controller("userController")
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/reg")
	public String saveUser(User user) {
		System.out.println(userService);
		userService.save(user);
		return "success";
	}

}
