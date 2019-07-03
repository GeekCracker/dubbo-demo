package com.dubbo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Reference
	private UserService userService;
	@Override
	public Map<String, Object> getById(String id) {
		return userService.getById(id);
	}
}
