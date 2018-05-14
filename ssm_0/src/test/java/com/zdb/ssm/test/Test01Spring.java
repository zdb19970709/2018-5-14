package com.zdb.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zdb.ssm.service.IUserService;

public class Test01Spring {
	public static void main(String[] args) {
		//测试spring框架的IoC独立运行
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		IUserService service = ac.getBean("userService",IUserService.class);
		service.findUserById("1");
	}
}
