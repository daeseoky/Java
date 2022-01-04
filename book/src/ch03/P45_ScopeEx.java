package ch03;

public class P45_ScopeEx {  // 1. 클래스 블럭
	
	int no;  // 1-1. 클래스 블럭내에서 사용 가능한 변수
	
	public static void main(String[] args) {  // 2. main 메서드 블럭
		
		String name;  // 2-1. main 메서드 블럭내에서 사용 가능한 변수 
		
		if (true) {
			// 메서드 블럭 안에서 선언한 변수 사용 가능
			name = "홍길동";
			
			// if문 불럭안에서 변수 선언
			String email = "Hong@test.com";
		}
		// if 문 블럭밖에서 email 변수를 사용하면 에러 발생
		email = "Hong@test.com";
	}
}
