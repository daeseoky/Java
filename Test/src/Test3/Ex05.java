package Test3;
/*
 * 날짜 : 2021/1/12
 * 이름 : 양대석
 * 내용 : 싱글톤 객체 연습하기
 */ 
class Vehicle{
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("=============");
		System.out.println("차량명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("-------------");
	}
}

class CarFactory{
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getIntance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	}
	
}


public class Ex05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getIntance();
				
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 2500);
		
		avante.info();
		sonata.info();
	}
}
