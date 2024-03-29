package com.cxlapp.website;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 用于退出登录的Servlet
 */
@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
		//删除当前会话信息
		request.getSession().removeAttribute("user");
		request.getSession().removeAttribute("expiresTime");
		response.sendRedirect("/login");
	}
}