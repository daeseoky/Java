package ch03;

public class P40_CharType {

	public static void main(String[] args) {
		/*
		 * A는 65 a는 97 다음문자들은 이정수값에서 1씩 더함
		 * char은 겉보기엔 문자지만 정수값으로 저장
		 * 
		 * 
		 */
		char a = 'A';
		System.out.println("a:"+a);
		
		int b = a;
		System.out.println("b:"+b);
		
		char c = 66;
		System.out.println("c:"+c);
		
		int d = a+b; //65+65
		System.out.println("d:"+d);
		
	}
}




