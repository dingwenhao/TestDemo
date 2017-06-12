package com.hy.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.hy.entity.User;
import com.hy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class RegAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private List<User> list=new ArrayList<User>();
	private String userName;
	private String pwd;
	private String name;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute(){
		User user=new User();
	//	user.setId(id);
		user.setName(name);
		user.setUserName(userName);
		user.setPwd(pwd);
		userService.add(user);
		if(StringUtils.isBlank(name))
		return INPUT;
		else
		return list();
		
	}
	public String list(){
		List<User> list=userService.findUsers();
		this.list.addAll(list);
		return SUCCESS;
		
	}

}
