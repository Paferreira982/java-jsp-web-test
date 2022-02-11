package com.boteconordestinos.web.payload;

import com.boteconordestinos.web.model.User;

public class UserPayload extends User {
	private String message;
	private Integer status;
	private String accessToken;
	private String tokenType;
	
	public UserPayload() {
	}
	public UserPayload(Integer status, String message) {
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
