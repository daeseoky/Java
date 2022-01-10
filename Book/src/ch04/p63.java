package ch04;

public class p63 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// &연산
		System.out.println(a==b & test());
		
		// &&연산
		System.out.println(a==b && test());  //좌측이 거짓이라 우측행 test()는 실행하지 않아서 "test()메서드 실행됨"이란 문구는 실행하지 않음
	}
	
	public static boolean test() {	
		System.out.println("test()메서드 실행됨");
		return true;
	}
}
