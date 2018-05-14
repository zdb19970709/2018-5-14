package com.zdb.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zdb.ssm.dao.IUserDAO;
import com.zdb.ssm.domain.User;
import com.zdb.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	//持久层对象
	private IUserDAO dao;
	
	@Override
	public User findUserById(String uid) {
	 
		return null;
	}

	@Override
	public List<User> findAllUser() {
		System.out.println("查询所有");
		return null;
	}

	@Override
	public void saveUser(User user) {
		

	}

	@Override
	public void updateUser(User user) {
		

	}

	@Override
	public void deleteUser(String uid) {
		

	}

}
