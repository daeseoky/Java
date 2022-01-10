package ch08;
/*
 * 날짜 : 2021/1/10
 * 이름 : 양대석
 * 내용 : 자바 예외 던지기 실습하기 교재 p273
 */ 

public class sub2_ThrowsTest {
	public static void main(String[] args) {
		
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1,  4); 
		int r2 = c.minus(1,  4); 
		int r3 = c.multi(2,  4); 
		
		int r4 = 0;
		try {
			//throw 메서드를 호출할때 예외처리
			r4 = c.div(1, 4);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
