package ch07;

public class p171 {

	// 필드
	String name;
	int grade;
	String department;
	
	// 1번 생성자
	p171(){
		
	}
	
	// 2번 생성자
	p171(String n){
		name = n;
	}
	
	// 3번 생성자
	p171(String n, int g){
		name = n;
		grade = g;
	}
	// 4번 생성자
	p171(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
	
}

