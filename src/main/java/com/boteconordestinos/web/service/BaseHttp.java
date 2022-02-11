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

import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseHttp {
	
	protected ObjectMapper objectMapper = new ObjectMapper();
	
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
