package ch05;
/*
 * 날짜 : 2021/1/05
 * 이름 : 양대석
 * 내용 : 자바 자바 클래스 실습하기 교재 p140
 */
public class sub1_ClassTest {

	public static void main(String[] args) {
		
		
		//Car객체 생성
		Car sonata = new Car("소나타", "흰색", 0);

		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		// bmw 객체 생성
		Car bmw = new Car("520d", "남색", 0);
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		
//		//Car객체 생성                    private <-> public
//		Account kb = new Account();     Account의 속성을 private로 잠궈서 이런식으로 불러올수 없음
//		kb.bank = "국민은행";             아래 우리은행처럼 해야함
//		kb.id = "101-12-123456";
//		kb.name = "김유신";
//		kb.balance = 10000;
//		
//		kb.deposit(40000);
//		kb.withdraw(5000);
//		
//		// 참조변수로 객체의 변수를 직접 참조해서 취약점
//		kb.balance--;
//		
//		kb.show();
		
		Account wr = new Account("우리은행", "101-12-123456", "김춘추", 10000);
		
		
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
		
		
		
	}
}
