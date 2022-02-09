package ch12;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ��¥ : 2021/1/13
 * �̸� : ��뼮
 * ���� : �ڹ� �����ͺ��̽� ���α׷���(JDBC) �ǽ��ϱ� ���� p556
 */ 

public class sub1_JDBCTest {
	public static void main(String[] args) {
		
		// JDBC ���� �׽�Ʈ
		String host = "jdbc:mysql://54.180.160.240:3306/cesiya3";
		String user = "cesiya3";
		String pass = "1234";
		
		
		try {
		// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
	
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("������ ���̽� ���� ����!!!");
		}
		
		// 3�ܰ� - Statement(SQL ���ఴü) ����
		
		// 4�ܰ� - SQL ����
		// 5�ܰ� - ���ó��(SELECT�� ���)
		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
				
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		System.out.println("JDBC ���α׷�����...");
	}

}
