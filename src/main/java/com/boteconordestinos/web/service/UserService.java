package com.boteconordestinos.web.service;

import org.apache.http.HttpResponse;
import org.springframework.stereotype.Component;

import com.boteconordestinos.web.model.User;

@Component
public class UserService extends BaseHttp {

	public User singIn(String json) {
		HttpResponse response = doPost(API_URL + "/auth/signin", json);
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
			
			User user = objectMapper.readValue(response.getEntity().getContent(), User.class);
			user.setStatus(statusCode);
			user.setMessage("Login bem sucedido.");
			
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String buildErrorMsg(Integer status, String fromRequest) {	
		switch (fromRequest) {
		case "login":
			if (status == 401)
				return "Usuário ou senha incorretos."; 
			
			break;
		}
		return "Erro nao categorizado.";
	}
}
