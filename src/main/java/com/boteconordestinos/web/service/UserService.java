package com.boteconordestinos.web.service;

import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Value;

import com.boteconordestinos.web.payload.UserPayload;

public class UserService extends BaseHttp {
	@Value("${btn.api.url}")
	private String API_URL;

	public UserPayload singIn(String json) {
		try {
			HttpResponse response = doPost("http://localhost:5559/auth/signin", json);
			
			Integer statusCode = response.getStatusLine().getStatusCode();
			
			if (statusCode == 401) 
				 return new UserPayload(statusCode, "Usuário ou senha incorreto.");
			 
			if (statusCode != 200 && statusCode != 202)
				return new UserPayload(statusCode, "Erro nao categorizado.");
			
			UserPayload tratedResponse = objectMapper.readValue(response.getEntity().getContent(), UserPayload.class);
			tratedResponse.setMessage("Login bem sucedido.");
			return tratedResponse;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
