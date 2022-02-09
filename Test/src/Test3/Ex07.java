package Test3;
/*
 * 날짜 : 2021/1/12
 * 이름 : 양대석
 * 내용 : 클래스 상속 연습하기
 */ 
class Customer{
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	public Costomer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		point += price*pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("======================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재 포인트 : "+point);
		System.out.println("포인트 적립을 : "+pointRatio);
		System.out.println("---------------------");
		
	}
	
}

class VipCustomer extends Customer{
	
	private double saleRate;
	
	public VipCustomer(int id, String name) {
		super.Costomer;
		super.grade = :"VIP";
		super.point = :1000;
		super.pointRatio = :0.05;
		super.saleRatio = :0.1;
	}
	public int calcPrice(int price) {
		point += price*pointRatio;
		return price - (int)(price*saleRatio);
}

public class Ex07 {
	public static void main(String[] args) {
		Customer  kim = new Customer(1001, "김춘추");
		VipCustomer  lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액 : "+kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액 : "+lee.calcPrice(10000));
		
	}

}
