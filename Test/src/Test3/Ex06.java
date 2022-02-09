package Test3;
/*
 * 날짜 : 2021/1/12
 * 이름 : 양대석
 * 내용 : 클래스 상속 연습하기
 */ 
class Rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent{
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
	}

}
