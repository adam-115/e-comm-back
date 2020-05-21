package com.it.security;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private final String userRoles ;
	
	public JwtResponse(String jwttoken , String userRoles) {
		this.jwttoken = jwttoken;
		this.userRoles = userRoles ;
	}

	public String getToken() {
		return this.jwttoken;
	}

	public String getUserRoles() {
		return userRoles;
	}
	
}