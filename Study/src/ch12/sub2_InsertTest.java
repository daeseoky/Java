package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2021/1/13
 * �̸� : ��뼮
 * ���� : �ڹ� JDBC Insert �ǽ��ϱ� ���� p557
 */ 

public class sub2_InsertTest {
	public static void main(String[] args) {
		
		//DB����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/cesiya3";
		final String USER = "cesiya3";
		final String PASS = "1234";
		
		try {
		// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
		// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
		// 3�ܰ� - SQL ���� ��ü����(Statement)
			Statement stmt = conn.createStatement();
			
		// 4�ܰ� - SQL ����
			String sql = "INSERT INTO `User1` VALUES('p101', '���߱�', '010-1010-1234', 31);";
			int count = stmt. executeUpdate(sql);
			
			System.out.println(count+"���� �����Ͱ� �߰��Ǿ����ϴ�.");
			
		// 5�ܰ� - ���ó��(SELECT�� ���)
		// 6�ܰ� - �����ͺ��̽� ����
		
			}catch(Exception e) {
		e.printStackTrace();
		}
		System.out.println("Insert �Ϸ�...");
}
}