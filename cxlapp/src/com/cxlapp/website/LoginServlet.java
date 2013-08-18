package com.cxlapp.website;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cxlapp.website.config.AppConfig;
import com.cxlapp.website.dao.UserDAO;
import com.cxlapp.website.model.User;

/**
 * �����վ��¼��Servlet
 */
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
		request.setAttribute("appId", AppConfig.APP_ID);
		request.setAttribute("redirectUri", URLEncoder.encode("http://cxlapp.com/rr_login", "UTF-8"));
		RequestDispatcher welcomeDispatcher = request.getRequestDispatcher("/views/login.jsp");
		welcomeDispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username != null && password != null) {
			User user = UserDAO.getInstance().getUser(username);
			if (user != null) {
				if (password.equals(user.getPassword())) {
					//�û�����������֤ͨ�������û������Ϣ�����ڻỰ��
					request.getSession().setAttribute("user", user);
					//�ѵ�¼����ת��������ҳ
					response.sendRedirect("/profile");
					return;
				}
			}
		}
		//û��¼�ɹ�����ת����¼ҳ
		response.sendRedirect("/login");
	}
}