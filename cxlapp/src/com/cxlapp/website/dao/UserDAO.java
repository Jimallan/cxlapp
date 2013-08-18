package com.cxlapp.website.dao;

import java.util.ArrayList;
import java.util.List;

import com.cxlapp.website.model.User;

/**
 * ��ȡ�û����DAO�ࡣ��ʼ�û�������3�������ʺš�
 * ��������ʵ���У�������һ����̬�б���ģ���û���
 * ��ʵ���û���Ӧ�ô洢�����ݿ��У����Գ־û���
 * �������ģ��ʵ�ֲ����ܳ־û����������������û�����ֻʣ��ԭ����3�������ʺš�
 */
public class UserDAO {
	/**
	 * ������Singleton��ģʽ
	 */
	private static UserDAO instance = new UserDAO();
	private UserDAO(){
	}	
	public static UserDAO getInstance() {
		return instance;
	}

	/**
	 * ����ģ���û���ľ�̬�б�
	 */
	private static List<User> userTable = new ArrayList<User>();
	/**
	 * ��ʼ���û�������3�������ʺ�
	 */
	static {
		User user1 = new User();
		user1.setUsername("test1");
		user1.setPassword("123456");
		user1.setEmail("test1@cxlapp.com");
		user1.setName("������");
		user1.setHeadurl("http://fmn.rrimg.com/fmn049/20110703/0105/p_large_DXGG_50e80000b3225c73.jpg");
		userTable.add(user1);
		User user2 = new User();
		user2.setUsername("test2");
		user2.setPassword("123456");
		user2.setEmail("test2@cxlapp.com");
		user2.setName("�쾲��");
		user2.setHeadurl("http://fmn.rrimg.com/fmn054/20110703/0105/p_large_QWui_51250000b3105c73.jpg");
		userTable.add(user2);
		User user3 = new User();
		user3.setUsername("test3");
		user3.setPassword("123456");
		user3.setEmail("test3@cxlapp.com");
		user3.setName("�ܽ���");
		user3.setHeadurl("http://fmn.rrimg.com/fmn051/20110703/0105/p_large_NW41_098a0000b0215c44.jpg");
		userTable.add(user3);
	}

	public synchronized User getUser(String username) {
		for (User user : userTable) {
			if (username.equals(user.getUsername())) {
				return user;
			}
		}
		return null;
	}

	public synchronized void addUser(User user) {
		userTable.add(user);
	}
}