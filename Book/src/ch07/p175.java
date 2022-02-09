package ch07;

public class p175 {
	
	// 생성자
	p175(){
		System.out.println("생성자 호출");
	}
	
	//static 초기화블럭
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	//인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main 메서드시작");
		System.out.println("main p175 객체생성");
		p175 init1 = new p175();
		System.out.println("main p175 객체생성");
		p175 init2 = new p175();
	}

}
