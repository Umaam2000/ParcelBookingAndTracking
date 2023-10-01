package com.ust.util;

import com.ust.actors.User;

public class Token {
	private String jwt;
	private User user;
	
	public Token() {}

	public Token(String jwt, User user) {
		super();
		this.jwt = jwt;
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
