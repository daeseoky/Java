package ch05;

public class Account {

	
	//�Ӽ�(�ʵ�) : ������ ĸ��ȭ(private) �����Ѵ�
	protected String bank;   //�ٸ� ������ �������� ���ϵ��� private�� ����
	protected String id;     // �ٸ������� �������� �������� �ڽĿ��Ը� �����Ҽ��ֵ���protected�� ����
	protected String name;
	protected int balance;
	
	//������(Constructor) : ��ü ���� �Ҷ� ��������� �ʱ�ȭ �ϴ� �޼���
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
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


