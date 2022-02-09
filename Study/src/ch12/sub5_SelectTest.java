package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sub5_SelectTest {
	public static void main(String[] args) {
		
		//DB정보
		final String HOST = "jdbc:mysql://chhak.or.kr:3306/cesiya3";
		final String USER = "cesiya3";
		final String PASS = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 3단계 - SQL실행 객체 생성(Statement)
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL실행
			String sql = "SELECT*FROM `User1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5단계 - 결과처리(SELECT일 경우)
			while(rs.next()) {
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println("=================");
				System.out.println("아이디 : "+uid );
				System.out.println("이름 : "+name);
				System.out.println("휴대폰 : "+hp);
				System.out.println("나이 : "+age);
				System.out.println("-----------------");
			}
			
			// 6단계 - 데이터베이스 종료
			
			
			
			
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
