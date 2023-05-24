package com.spring.rest.webservices.restfulwebservices.demo;

public class DemoBean {

	private String message;

	public DemoBean(String message) {
		this.message=message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
