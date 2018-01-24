package com.webservice.client;

import javax.jws.WebParam;
import javax.jws.WebService;

//targetNamespace对应服务端wsdl里的namespace，默认为服务端所对应的服务类所在包名倒写
//比如服务端HelloService所在包路径为com.webservice.server
//@WebService(targetNamespace = "http://server.webservice.com/") 
@WebService(targetNamespace = "http://webservice.server/") 
public interface HelloClient {
	//方法名与server端一样
	public String hello(@WebParam(name = "name")String name);
}
