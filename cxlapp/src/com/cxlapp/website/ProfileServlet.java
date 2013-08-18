package com.cxlapp.website;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cxlapp.website.model.User;

/**
 * ��¼��ĸ�����ҳ
 */
@SuppressWarnings("serial")
public class ProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
		//��֤�Ự�Ƿ��ǵ�¼״̬�������û�е�¼������ת����¼ҳ��ȥ������ȡ���û���Ϣ����չʾ
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			//δ��¼����ת����¼ҳ��ȥ
			response.sendRedirect("/login");
			return;
		}
		Long expiresTime = (Long)request.getSession().getAttribute("expiresTime");
		if (expiresTime != null) {
			long currentTime = System.currentTimeMillis() / 1000;
			System.out.println("expiresTime = " + expiresTime + "; currentTime = " + currentTime);
			if (currentTime > expiresTime) {
				//�û��Ự�����ˣ���ת����¼ҳ��ȥ
				response.sendRedirect("/login");
				return;
			}
		}
		RequestDispatcher welcomeDispatcher = request.getRequestDispatcher("/views/profile.jsp");
		welcomeDispatcher.forward(request, response);
	}
}
