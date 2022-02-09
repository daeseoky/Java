package ch07;

public class p176 {
	
	//static 변수
	static int sVar;
	// static 메서드
	static void sMethod() {
		
	}
	
	//인스턴스 변수
	int var;
	//인그턴스 메서드
	void method() {
		
	}
	
	//static 초기화블럭
	static {
		sVar = 0;  // static 변수
		sMethod(); // static 메서드
	}
	
//	// static 메서드
//	static void sMethod() {
//		
//		// 에러(static 메서드에서 this 키워드 사용불가)
//		this.sVar = 0;  // static 변수
//		this.sMethod(); // static 메서드
//	}

}
