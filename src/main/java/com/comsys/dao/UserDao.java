package com.comsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.comsys.pojo.User;
import com.github.abel533.mapper.Mapper;

/**
 * mybatis的dao层
 * @author wyd
 *
 */
public  interface UserDao{

	@Select("select id,name,desc1 from user where name=#{name}")
	public List<User> select(User user);
}
