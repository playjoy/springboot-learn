package com.comsys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comsys.pojo.User;
import com.comsys.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="hello")
    @ResponseBody
	public Map getData(){
		
		Map map = new HashMap();
		map.put("12", "你好!");
		List list =userService.getUserList();
		System.out.println(list.size());
		return map;
	}
	@RequestMapping(value="/ok")
	public String getData1(Model model){
		
		List<User> list =userService.getUserList();
		model.addAttribute("ok", "sdf");
		model.addAttribute("list", list);
		
		return "index";
	}

}
