package com.boteconordestinos.web.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseHttp {
	@Autowired
	protected ObjectMapper objectMapper;
	
	@Value("${btn.api.url}")
	protected String API_URL;
	
	protected HttpResponse doPost(String api_rul, String json) {
		try {
			HttpClient httpclient = HttpClients.createDefault();
			HttpPost httpPost  = new HttpPost(api_rul);
			HttpEntity stringEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
		    httpPost.setEntity(stringEntity);
			HttpResponse response = httpclient.execute(httpPost);
			
			return response;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
