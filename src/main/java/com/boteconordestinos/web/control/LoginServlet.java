package com.boteconordestinos.web.control;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.boteconordestinos.web.model.User;
import com.boteconordestinos.web.payload.LoginPayload;
import com.boteconordestinos.web.payload.Payload;
import com.boteconordestinos.web.service.UserService;
import com.google.gson.Gson;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	UserService service;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		response.sendRedirect("index.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new Gson();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginPayload loginPayload = new LoginPayload(username, password);
        
        String requestJson = gson.toJson(loginPayload);
        User user = service.singIn(requestJson);
        
        if (user.getAccessToken() != null)
        	request.getSession().setAttribute("loggedUser", user);
        
        String responseJson = gson.toJson(new Payload(user.getStatus(), user.getMessage()));
        
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(responseJson);
	}

}
