package ch05;

public class Account {

	
	//�Ӽ�(�ʵ�) : ������ ĸ��ȭ(private) �����Ѵ�
	private String bank;   //�ٸ� ������ �������� ���ϵ��� private�� ����
	private String id;
	private String name;
	private int balance;
	
	//������(Constructor) : ��ü ���� �Ҷ� ��������� �ʱ�ȭ �ϴ� �޼���
	public Account(String bank, String id, String name, int balance) {
		this.bank = "��������";
		this.id = "101-12-123456";
		this.name = "������";
		this.balance = 10000;
	}
	
	//���
	public void deposit(int money) {
		this.balance += money;
		
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("-----------------------");
		System.out.println("����� : "+this.bank);
		System.out.println("���¹�ȣ : "+this.id);
		System.out.println("�Ա��� : "+this.name);
		System.out.println("�����ܾ� : "+this.balance);
		System.out.println("-----------------------");
		
		
	}
	
	
}


