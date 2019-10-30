package com.yangjie.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.Page;
import com.yangjie.entity.User;
import com.yangjie.service.UserService;

public class Test2 {

	public static void main(String[] args) {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
		context.start();
		UserService user = (UserService) context.getBean(UserService.class);
		User u1 = new User();
		u1.setId(48);
		Page page = user.getUserlist(null, (2 - 1) * 10, 10);
		List<User> u = page.getResult();
		for (User uu :u) {
			System.out.println(uu.getId());
		}
		
		System.out.println("测试代码11111111");
	}

}
