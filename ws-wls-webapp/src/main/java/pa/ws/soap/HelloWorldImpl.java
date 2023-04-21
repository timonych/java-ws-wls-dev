package ru.alfabank.pc.uoks.pa.ws.soap;

import javax.jws.WebService;

//Service Implementation
@WebService(serviceName="soap/HelloWorld", endpointInterface = "ru.alfabank.pc.uoks.pa.ws.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getMessage(String msg) {
		return "WS-WLS-DEV SOAP " + msg;
	}

}