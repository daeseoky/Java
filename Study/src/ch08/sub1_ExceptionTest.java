package ch08;
/*
 * 날짜 : 2021/1/10
 * 이름 : 양대석
 * 내용 : 자바 예외처리 실습하기 교재 p264
 */ 

public class sub1_ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			//에러가 발생할 가능성이 있는 코드로직 작성
			r4 = num1 / num2;
		}catch(Exception e) {
			//에러가 발생했을 때 처리 로직 작성
			e.printStackTrace();  //printStackTrace();는 에러내용 표기
		}finally {
			//에러발생 여부와 상관없이 마지막 무조건 실행되는 처리블럭
			System.out.println("예외처리 완료...");
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("프로그램 종료...");
		
	}

}
