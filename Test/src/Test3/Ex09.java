package Test3;
/*
 * ��¥ : 2021/1/12
 * �̸� : ��뼮
 * ���� : �߻� Ŭ����, ������ �����ϱ�
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
