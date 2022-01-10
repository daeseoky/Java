package ch05;

public class Car {

	//�ڵ��� �Ӽ�
	private String name;
	private String color;
	private int speed; 
	
	//private ���� �ʱ�ȭ �ڵ����� : ��Ŭ��->source->...using fields...
	public Car(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	//�ڵ��� ���
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("===================");
		System.out.println("�ڵ��� �̸� : "+this.name);
		System.out.println("�ڵ��� ���� : "+this.color);
		System.out.println("�ڵ��� �ӵ� : "+this.speed);
	}
}
