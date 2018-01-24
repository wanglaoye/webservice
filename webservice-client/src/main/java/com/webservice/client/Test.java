package com.webservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
		HelloClient helloClient = context.getBean(HelloClient.class);
		String s = helloClient.hello("wz");
		System.out.println(s);
		context.close();
	}
}
