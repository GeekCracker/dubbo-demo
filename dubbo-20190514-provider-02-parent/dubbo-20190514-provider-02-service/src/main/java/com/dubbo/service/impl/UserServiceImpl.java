package com.dubbo.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public Map<String, Object> getById(String id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",id);
		map.put("name","张二");
		map.put("msg","调用服务:02");
		return map;
	}
}
