package com.zdb.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zdb.ssm.dao.IUserDAO;
import com.zdb.ssm.domain.User;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test03myBatisAndSpring {
	@Autowired
	private IUserDAO dao;
	
	@Test
	public  void testFindAll() {
		List<User> list = dao.findAllUser();
		for(User u:list) {
			System.out.println(u);
		}
		
	}
	

}
