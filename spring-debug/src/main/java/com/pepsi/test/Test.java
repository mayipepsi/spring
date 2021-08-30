package com.pepsi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		User user = ctx.getBean(User.class);
		System.out.println(user.getName());

	}
}
