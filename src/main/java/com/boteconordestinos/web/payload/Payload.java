package com.boteconordestinos.web.payload;

public class Payload {
	private String message;
	private Integer status;
	
	public Payload() {
	}
	public Payload(Integer status, String message) {
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
}
