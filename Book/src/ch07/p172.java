package ch07;

public class p172 {
	
	// 필드 
	String name; // 학과명
	int grade; // 학년
	String department; // 학과

	// 1번 생성자
		p172(){
			
		}
		
		// 2번 생성자
		p172(String n){
			name = n;
		}
		
		// 3번 생성자 <-5번 생성자 때문에 이것도 에러 발생(5번을 지우면 에러 사라짐)
		p172(String n, int g){
			name = n;
			grade = g;
		}
		
		// 4번 생성자
		p172(String n, int g, String d){
			name = n;
			grade = g;
			department = d;
		}
		
//		// 5번 생성자 학과와 학년을 매개변수로 받는 생성자 (에러발생)
//		p172(String d, int g){
//			department = d;
//			grade = g;
//		}
	
	
}
