package ch07;

public class p174 {
	public static void main(String[] args) {
		
		p173 c1 = new p173();
		p173 c2 = new p173("중형차");
		p173 c3 = new p173("현대", "대형차");
		p173 c4 = new p173("black", "기아", "화물차");
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);
	}

}
