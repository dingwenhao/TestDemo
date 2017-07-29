package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@RequestMapping(value="register")
	public String register(){
		return "register";
	}
	@RequestMapping(value="login")
	public String login(){
		return "login";
	}

}
