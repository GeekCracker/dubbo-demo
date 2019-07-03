package com.dubbo.admin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.service.UserService;

@RestController("AdminUserController")
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("getById.action")
	public Map<String,Object> getById(String id){
		return userService.getById(id);
	}
}
