package ch07;

// 클래스 생성(정의)
class B{
	boolean m1;    // 필드는 초기화 하지 않아도 강제 초기화됨
	int m2;
	double m3;
	String m4;
	void print() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		print2();
	}
	void print2() {
//		int k;
//		System.out.println(k);  지역 변수(k)를 초기화 하지않아서 오류
	}
}

public class p226 {
	public static void main(String[] args) {
		// 클래스를 활용해 객체 생성
		B b = new B();
		// 객체 활용
		b.print();
	}
	

}
