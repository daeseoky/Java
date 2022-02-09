package Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://chhak.or.kr:3306/cesiya3";
		final String USER = "cesiya3";
		final String PASS = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			
			System.out.println("상품 주문 시스템에 오신것을 환영합니다");
			
			while(true) {
				System.out.println("0:종료, 1:상품조회, 2:상품주문");
				System.out.print("선택: ");
				
				int answer = sc.nextInt();
				
				if(answer == 0) {
					// 종료
					break;
				}else if(answer == 1) {
					// 상품 조회
					String sql = "SELECT * FROM `TestProduct`;";
					ResultSet rs = stmt.executeQuery(sql);
					
					System.out.println("---------상품조회----------");
					System.out.println("|번호|상품이름|가격|");
					
					while(rs.next()) {
						String productid = rs.getString(1);
						String pName = rs.getString(2);
						int price = rs.getInt(4);
						System.out.printf("|%s|%s|%d|\n", productid, pName, price);
					}
					System.out.println("---------상품조회----------");
				}else if(answer == 2) {
					// 상품주문
					while(true) {
						System.out.println("---------상품주문----------");
						System.out.print("고객번호 입력 : ");
						String custid = sc.next();
						
						System.out.print("상품번호 입력 : ");
						String productid = sc.next();
						
						System.out.print("주문수량 입력 : ");
						String orderCount = sc.next();
						
						System.out.print("상품 배송지 입력 : ");
						String orderAddress = sc.next();
						
						String sql = "INSERT INTO `TestOrder` SET";
							   sql += "`orderer`='"+custid+"', ";
							   sql += "`orderProduct`='"+productid+"', ";
							   sql += "`orderCount`="+orderCount+", ";
							   sql += "`orderAddress`='"+orderAddress+"', ";
							   sql += "`orderDate`=NOW();";
							   
					   try {
						   stmt.executeQuery(sql);
					   }catch (Exception e) {
						   System.out.println("고객번호 또는 상품번호를 다시 확인하시기 바랍니다.");
						   continue;
					   }
						break;
					}
					System.out.println("상품 주문이 완료 되었습니다.");
					System.out.println("--------------------------");
				}
			}// while end
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("프로그램 종료...");
	}

}
