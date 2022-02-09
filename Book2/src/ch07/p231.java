package ch07;


// 클래스 정의
class C{
	// 리턴타입 void, 매개변수 없음
	void print() {
		System.out.println("안녕");
	}
	// 리턴 타입 int, 매개변수 없음
	int data() {
		return 3;
	}
	//리턴 타입 double, 매개변수 3개
	double sum(int a, double b) {
		return a + b;
	}
	// 리턴 타입 void, 내부에 리턴 포함(함수를 종료함)
	void printMouth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력");
		}else {
			System.out.println(m+"월 입니다.");
		}
	}
}

public class p231 {
	public static void main(String[] args) {
		// 객체 생성
		C c = new C();
		
		// 메서드 호출(멤버 활용)
		c.print();
		int k = c.data();
//		c.data();
		System.out.println(k);
		double result = c.sum(3,  5.2);
		System.out.println(result);
		c.printMouth(5);
		c.printMouth(15);
	}
	

}
