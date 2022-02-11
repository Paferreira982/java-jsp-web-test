package com.boteconordestinos.web.service;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Value;

import com.boteconordestinos.web.model.User;

public class UserService extends BaseHttp {
	@Value("${btn.api.url}")
	private String API_URL;

	public User singIn(String json) {
		System.out.println(API_URL);
		HttpResponse response = doPost("http://localhost:5559/auth/signin", json);
		return organizeUser(response);
	}
	
	  /////////////////////////
	 /// CONTROL FUNCTIONS ///
	/////////////////////////
	
	private User organizeUser(HttpResponse response) {
		try {
			Integer statusCode = response.getStatusLine().getStatusCode();
			 
			if (statusCode != 200 && statusCode != 202)
				return new User(statusCode, buildErrorMsg(statusCode, "login"));
			
			return objectMapper.readValue(response.getEntity().getContent(), User.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String buildErrorMsg(Integer status, String fromRequest) {	
		switch (fromRequest) {
		case "login":
			if (status == 401)
				return "Usuário ou senha incorreto."; 
			
			break;
		}
		return "Erro nao categorizado.";
	}
}
