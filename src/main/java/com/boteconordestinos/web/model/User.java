package com.boteconordestinos.web.model;

import java.util.List;

import com.boteconordestinos.web.payload.UserPayload;

public class User {
	private Long id;
	
	private String username;
	private String password;
	
	private Boolean active;
	
	private List<String> roles;
	
	public User() {
	}
	public User(UserPayload userPayload) {
		this.id = userPayload.getId();
		this.username = userPayload.getUsername();
		this.password = userPayload.getPassword();
		this.active = userPayload.getActive();
		this.roles = userPayload.getRoles();
	}
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
}
