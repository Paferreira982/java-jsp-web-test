package com.boteconordestinos.web.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boteconordestinos.web.model.User;
import com.boteconordestinos.web.payload.LoginPayload;
import com.boteconordestinos.web.payload.UserPayload;
import com.boteconordestinos.web.service.UserService;
import com.google.gson.Gson;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		response.sendRedirect("index.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service = new UserService();
		Gson gson = new Gson();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginPayload loginPayload = new LoginPayload(username, password);
        
        String requestJson = gson.toJson(loginPayload);
        UserPayload userPayload = service.singIn(requestJson);
        
        String responseJson;
        if (userPayload.getAccessToken() != null) {
        	responseJson = gson.toJson(new User(userPayload));
        	request.getSession().setAttribute("accessToken", userPayload.getAccessToken());
        } else {
        	responseJson = gson.toJson(userPayload);
        }
        
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(responseJson);
	}

}
