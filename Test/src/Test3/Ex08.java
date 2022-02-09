package Test3;
/*
 * 날짜 : 2021/1/12
 * 이름 : 양대석
 * 내용 : 클래스 상속 연습하기
 */ 

class Product{
	
	String category;
	int price;
	
	public product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void() {}
}

class Television extends{
	
	public Television(String category, int price) {
		super(category, price);
	}
	
	public void info() {
		System.out.println("제품 분류 : "+category);
		System.out.println("제품 가격 : "+price);
	}
}

class Computer extends{
	
	public static void main(String[] args) {
		
		p1 = new Television("가전", 100);
		p2 = new Computer("컴퓨터", 100);
		
		p1.info();
		p2.info();
	}
}















public class Ex08 {

}
