package com.zdb.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zdb.ssm.domain.User;
import com.zdb.ssm.service.IUserService;

/**
 * 账户的控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private IUserService service;
	
	@RequestMapping("findAll")
	public ModelAndView findAll() {
		//查询所有用户列表
		List<User> list = service.findAllUser();
		//创建返回对象
		ModelAndView mv = new ModelAndView();
		//设置响应带有的数据
		mv.addObject("list", list);
		//设置返回结果的视图
		mv.setViewName("userlist");
		return mv;
	}
}
