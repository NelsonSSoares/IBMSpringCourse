package com.nelson.spring.springmvcorm.user.dao;

import java.util.List;

import com.nelson.spring.springmvcorm.user.entity.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> findUsers();
	
}
