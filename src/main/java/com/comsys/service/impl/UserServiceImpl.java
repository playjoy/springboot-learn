package com.comsys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comsys.dao.UserDao;
import com.comsys.pojo.User;
import com.comsys.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	//@Autowired
    //private UserDao userDao;
	
	public List getUserList() {
		/*User user = new User();
		user.setName("123");
		List<User> list=userDao.select(user);
		for(User u:list){
			System.out.println(u.getName());
		}
		return list;*/

		return null;
	}

}
