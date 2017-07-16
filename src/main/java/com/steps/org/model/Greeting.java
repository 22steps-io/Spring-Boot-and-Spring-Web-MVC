package com.steps.org.model;

public class Greeting {
	private String user;
	private String message;

	public Greeting(String user, String message) {
		super();
		this.user = user;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getUser() {
		return user;
	}
}
