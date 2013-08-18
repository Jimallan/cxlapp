package com.cxlapp.website;


import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cxlapp.website.config.AppConfig;

@SuppressWarnings("serial")
public class Request2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
	    request.setAttribute("appId", AppConfig.APP_ID);
	    request.setAttribute("display", "page");
	    request.setAttribute("acceptUrl", "http://cxlapp.com/request2");
	    request.setAttribute("acceptLabel", URLEncoder.encode("接受", "UTF-8"));
	    request.setAttribute("actionText", URLEncoder.encode("邀请好友一起来玩", "UTF-8"));
	    request.setAttribute("redirectUri", "http://cxlapp.com/redirect.html");
	    RequestDispatcher welcomeDispatcher = request.getRequestDispatcher("/views/request2.jsp");
	    welcomeDispatcher.forward(request, response);
	}
}
