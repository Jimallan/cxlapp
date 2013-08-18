package com.cxlapp.website.dao;


import java.util.HashMap;
import java.util.Map;

/**
 * ��ȡ�ʺŹ������DAO�ࡣ
 * �ʺŹ��������ڴ洢�������ʺ�ID����վ�ʺŵ�ӳ���ϵ��
 * ��������ʵ���У�������һ����̬Map��ģ���ʺŹ�����
 * ��ʵ���ʺŹ�����Ӧ�ô洢�����ݿ��У����Գ־û���
 * �������ģ��ʵ�ֲ����ܳ־û����������������ʺŹ�������ա�
 */
public class RenrenUserMappingDAO {
	/**
	 * ������Singleton��ģʽ
	 */
	private static RenrenUserMappingDAO instance = new RenrenUserMappingDAO();
	private RenrenUserMappingDAO(){
	}	
	public static RenrenUserMappingDAO getInstance() {
		return instance;
	}
	/**
	 * ����ģ���ʺŹ�����ľ�̬Map�������������UID����վusername��ӳ��
	 */
	private static Map<Integer, String> userMappingTable = new HashMap<Integer, String>();

	public synchronized String getUsername(int rrUid) {
		return userMappingTable.get(rrUid);
	}

	public synchronized void addMapping(int rrUid, String username) {
		userMappingTable.put(rrUid, username);
	}
}
