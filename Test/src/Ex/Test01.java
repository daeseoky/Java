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
			
			System.out.println("��ǰ �ֹ� �ý��ۿ� ���Ű��� ȯ���մϴ�");
			
			while(true) {
				System.out.println("0:����, 1:��ǰ��ȸ, 2:��ǰ�ֹ�");
				System.out.print("����: ");
				
				int answer = sc.nextInt();
				
				if(answer == 0) {
					// ����
					break;
				}else if(answer == 1) {
					// ��ǰ ��ȸ
					String sql = "SELECT * FROM `TestProduct`;";
					ResultSet rs = stmt.executeQuery(sql);
					
					System.out.println("---------��ǰ��ȸ----------");
					System.out.println("|��ȣ|��ǰ�̸�|����|");
					
					while(rs.next()) {
						String productid = rs.getString(1);
						String pName = rs.getString(2);
						int price = rs.getInt(4);
						System.out.printf("|%s|%s|%d|\n", productid, pName, price);
					}
					System.out.println("---------��ǰ��ȸ----------");
				}else if(answer == 2) {
					// ��ǰ�ֹ�
					while(true) {
						System.out.println("---------��ǰ�ֹ�----------");
						System.out.print("����ȣ �Է� : ");
						String custid = sc.next();
						
						System.out.print("��ǰ��ȣ �Է� : ");
						String productid = sc.next();
						
						System.out.print("�ֹ����� �Է� : ");
						String orderCount = sc.next();
						
						System.out.print("��ǰ ����� �Է� : ");
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
						   System.out.println("����ȣ �Ǵ� ��ǰ��ȣ�� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�.");
						   continue;
					   }
						break;
					}
					System.out.println("��ǰ �ֹ��� �Ϸ� �Ǿ����ϴ�.");
					System.out.println("--------------------------");
				}
			}// while end
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("���α׷� ����...");
	}

}
