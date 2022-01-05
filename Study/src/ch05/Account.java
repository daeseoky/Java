package ch05;

public class Account {

	
	//속성(필드) : 무조건 캡슐화(private) 적용한다
	protected String bank;   //다른 곳에서 참조하지 못하도록 private을 쒸움
	protected String id;     // 다른데서는 참조하지 못하지만 자식에게만 참조할수있도록protected를 쒸움
	protected String name;
	protected int balance;
	
	//생성자(Constructor) : 객체 생성 할때 멤버변수를 초기화 하는 메서드
	public Account(String bank, String id, String name, int balance) {
		this.bank = "국민은행";
		this.id = "101-12-123456";
		this.name = "김유신";
		this.balance = 10000;
	}
	
	//기능
	public void deposit(int money) {
		this.balance += money;
		
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("-----------------------");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
		System.out.println("-----------------------");
		
		
	}
	
	
}


