package com.cxlapp.website.model;

/**
 * User�����ڱ�ʾ��վ���û���Ϣ
 */
public class User {
	/**
	 * ��¼�û�����������ĸ�����֣�������վ�û���Ψһ��ʶ
	 */
	private String username;
	private String password;
	private String email;
	/**
	 * �û�������������վ��ʾ
	 */
	private String name;
	/**
	 * �û�ͷ���ַ
	 */
	private String headurl;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadurl() {
		return headurl;
	}
	public void setHeadurl(String headurl) {
		this.headurl = headurl;
	}

}