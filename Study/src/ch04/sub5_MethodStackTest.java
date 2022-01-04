package ch04;

/*
 * 날짜 : 2021/1/04
 * 이름 : 양대석
 * 내용 : 자바 메서드 실행순서와 스택 실습하기 교재 p159
 */
public class sub5_MethodStackTest {
	
	//전역변수(멤버변수) : 클래스에서 선언한 변수
	int num = 1;
	
	public static void main(String[] args) {
		
		//지역변수 : 메서드에서 선언한 변수
		int result = 0;
		int n1 = 1;
		int n2 = 10;
		
		result = sum(n1, n2);
		
		System.out.println("결과 : "+result);
	}
	
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k= start; k<=end; k++) {
			total += k;
		}
		return total;
	}

}
