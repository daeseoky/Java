package Test3;
/*
 * 날짜 : 2021/1/12
 * 이름 : 양대석
 * 내용 : 추상 클래스, 다형성 연습하기
 */ 
class Shape{
	public abstract void draw();
}

class Triangle extends{
	public void draw() {
		System.out.println("draw Triangle!");
	}
	
}

class Circle extends{
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Ex09 {
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle;
		Triangle triangle = new Triangle;
		
		here.draw(Circle);
		here.draw(Triangle);
	}
	
	public void draw(obj) {
		obj.draw();
	}

}
