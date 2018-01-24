package com.webservice.server;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService{

	@Override
	public String hello(String name) {
		System.out.println("hello," + name);
		return "hello," + name;
	}
	
}
