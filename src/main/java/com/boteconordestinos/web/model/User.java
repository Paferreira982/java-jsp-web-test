package com.boteconordestinos.web.model;

import java.util.List;

import com.boteconordestinos.web.payload.Payload;

public class User extends Payload {
	private Long id;
	
	private String username;
	private String password;
	private String accessToken;
	private String tokenType;
	
	private Boolean active;
	
	private List<String> roles;
	
	
	// CONSTRUTORES //
	public User() {
	}
	public User(Integer status, String message) {
		super(status, message);
	}
	public User(Long id, String username, String password, String accessToken, String tokenType, Boolean active,
			List<String> roles) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.accessToken = accessToken;
		this.tokenType = tokenType;
		this.active = active;
		this.roles = roles;
	}
	
	// METODOS //
	public Boolean isAdmin() {
		return roles.contains("ROLE_ADMIN");
	}
	
	// GET E SET //
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
}
