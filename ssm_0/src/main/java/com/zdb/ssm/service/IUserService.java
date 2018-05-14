package com.zdb.ssm.service;

import java.util.List;

import com.zdb.ssm.domain.User;

public interface IUserService {
	/**
	 * 根据id查询用户
	 */
	User findUserById(String uid);
	/**
	 * 查询所有用户
	 */
	List<User> findAllUser();
	/**
	 * 保存用户
	 */
	void saveUser(User user);
	/**
	 * 更新用户
	 */
	void updateUser(User user);
	/**
	 * 删除用户
	 */
	void deleteUser(String uid);
}
