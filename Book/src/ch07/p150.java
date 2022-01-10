package ch07;

public class p150 {

	public static void main(String[] args) {
		Local local = new Local();
		System.out.println(local.name);
		
		local.process();
		System.out.println(local.name);
		
		local.printAge1();
		local.printAge2();
		
		// for문 블록 내에서의 변수 선언
		for(int i=0; i<10; i++) {
			int temp = 0;
			temp += 1;
			
			
		}
		
//		System.out.println(temp); for문의 범위 밖에선 에러
	}
	
}

class Local{
	String name;
	
	void process() {
		name = "홍길동";
	}
	
	void printAge1() {
		int age = 20; //지역 변수
		System.out.println(age);
	}
	
	void printAge2() {
		int age = 30; //지역 변수
		System.out.println(age);
	}
}