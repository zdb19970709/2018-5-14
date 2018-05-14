package com.zdb.ssm.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zdb.ssm.dao.IUserDAO;
import com.zdb.ssm.domain.User;



public class Test02Mybatis {
	public static void main(String[] args) throws IOException {
		//测试mybatis独立运行
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		IUserDAO dao = session.getMapper(IUserDAO.class);
		List<User> list = dao.findAllUser();
		for(User u : list) {
			System.out.println(u);
		}
		
		session.close();
		inputStream.close();
	}
}
