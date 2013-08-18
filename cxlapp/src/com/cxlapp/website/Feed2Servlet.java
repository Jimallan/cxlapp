package com.cxlapp.website;

import java.net.URLEncoder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cxlapp.website.config.AppConfig;

@SuppressWarnings("serial")
public class Feed2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
	   request.setAttribute("appId", AppConfig.APP_ID);
	   request.setAttribute("display", "page");
	   request.setAttribute("url", URLEncoder.encode("http://cxlapp.com/feed2", "UTF-8"));
	   request.setAttribute("name", URLEncoder.encode("�����²��ԣ������Ǳ���", "UTF-8"));
	   request.setAttribute("description", URLEncoder.encode("���������ڲ��������������¹��ܣ���Ҫ����", "UTF-8"));
	   request.setAttribute("image", URLEncoder.encode("http://at-img4.tdimg.com/board/2011/5/46465.jpg", "UTF-8"));
	   request.setAttribute("actionName", URLEncoder.encode("����һ����", "UTF-8"));
	   request.setAttribute("actionLink", URLEncoder.encode("http://cxlapp.com/feed2", "UTF-8"));
	   request.setAttribute("redirectUri", URLEncoder.encode("http://cxlapp.com/redirect.html", "UTF-8"));
	   RequestDispatcher welcomeDispatcher = request.getRequestDispatcher("/views/feed2.jsp");
	   welcomeDispatcher.forward(request, response);
	}
}