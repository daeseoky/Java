package ch06;
/*
 * 날짜 : 2021/1/05
 * 이름 : 양대석
 * 내용 : 자바 클래스 상속 실습하기 교재 p196
 */

public class sub1_InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb증권", "101-11-123456", "홍길도", 10000, "삼성전자", 100, 70000);
		
		kb.deposit(1000000);
		kb.withdraw(20000);
		kb.show();
		
		kb.buy(10, 65000);
		kb.show();
		
		kb.sell(10, 70000);
		kb.show();
		
		
		
		
	}
	
}
