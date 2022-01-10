package ch05;

public class Car {

	//자동차 속성
	private String name;
	private String color;
	private int speed; 
	
	//private 내용 초기화 자동생성 : 우클릭->source->...using fields...
	public Car(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	//자동차 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("===================");
		System.out.println("자동차 이름 : "+this.name);
		System.out.println("자동차 색상 : "+this.color);
		System.out.println("자동차 속도 : "+this.speed);
	}
}
