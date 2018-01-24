package com.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice.server/") //targetNamespace默认为所在包名倒写
public interface HelloService {
	
	@WebMethod
	public String hello(@WebParam(name = "name")String name);
}
