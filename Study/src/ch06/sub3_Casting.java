package ch06;
/*
 * 날짜 : 2021/1/05
 * 이름 : 양대석
 * 내용 : 자바 캐스팅 실습하기 교재 p205
 */ 

public class sub3_Casting {
	
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		int num1 = 1;
		double num2 = num1;
		int num3 = (int)num2;  //큰형태에서 작은 형태로 변환할려면 강제로 해야함
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
		// 업 캐스팅
		Animal a1 = new Eagle();
		Animal a2 = new Lion();
		Animal a3 = new Shark();
		
		
		// 다운 캐스팅
		Eagle eagle = (Eagle) a1;
		Lion lion = (Lion) a2;
		Shark shark = (Shark) a3;
		
		eagle.move();
		lion.move();
		shark.move();
		
	}

}
