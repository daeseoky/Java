package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2021/1/13
 * 이름 : 양대석
 * 내용 : 자바 JDBC Insert 실습하기 교재 p557
 */ 

public class sub2_InsertTest {
	public static void main(String[] args) {
		
		//DB정보
		final String HOST = "jdbc:mysql://54.180.160.240:3306/cesiya3";
		final String USER = "cesiya3";
		final String PASS = "1234";
		
		try {
		// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
		// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
		// 3단계 - SQL 실행 객체생성(Statement)
			Statement stmt = conn.createStatement();
			
		// 4단계 - SQL 실행
			String sql = "INSERT INTO `User1` VALUES('p101', '안중근', '010-1010-1234', 31);";
			int count = stmt. executeUpdate(sql);
			
			System.out.println(count+"개의 데이터가 추가되었습니다.");
			
		// 5단계 - 결과처리(SELECT일 경우)
		// 6단계 - 데이터베이스 종료
		
			}catch(Exception e) {
		e.printStackTrace();
		}
		System.out.println("Insert 완료...");
}
}