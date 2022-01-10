package ch07;

public class p158 {
	
	public static void main(String[] args) {
		
		//직접 실행
		Method.printName();
		
		//객체를 생성해서 실행
		
		Method m = new Method();
		m.printEmail();
			
	}

}

class Method{
	
	static void printName() {
		System.out.println("printName() 실행");
	}
	
	void printEmail() {
		System.out.println("printEmail() 실행");
		
		printIn();  //다른 메서드 실행
	}
	void printIn() {
		System.out.println("printIn() 실행");
		
	}
}