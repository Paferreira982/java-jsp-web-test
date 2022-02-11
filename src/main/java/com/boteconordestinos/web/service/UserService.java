package com.boteconordestinos.web.service;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Value;

import com.boteconordestinos.web.model.User;

public class UserService extends BaseHttp {
	@Value("${btn.api.url}")
	private String API_URL;

	public User singIn(String json) {
		try {
			HttpResponse response = doPost("http://localhost:5559/auth/signin", json);
			
			Integer statusCode = response.getStatusLine().getStatusCode();
			
			if (statusCode == 401) 
				 return new User(statusCode, "Usuário ou senha incorreto.");
			 
			if (statusCode != 200 && statusCode != 202)
				return new User(statusCode, "Erro nao categorizado.");
			
			return objectMapper.readValue(response.getEntity().getContent(), User.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
