package ch05;
/*
 * ��¥ : 2021/1/05
 * �̸� : ��뼮
 * ���� : �ڹ� �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 */
public class sub1_ClassTest {

	public static void main(String[] args) {
		
		
		//Car��ü ����
		Car sonata = new Car("�ҳ�Ÿ", "���", 0);

		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		// bmw ��ü ����
		Car bmw = new Car("520d", "����", 0);
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		
//		//Car��ü ����                    private <-> public
//		Account kb = new Account();     Account�� �Ӽ��� private�� ��ż� �̷������� �ҷ��ü� ����
//		kb.bank = "��������";             �Ʒ� �츮����ó�� �ؾ���
//		kb.id = "101-12-123456";
//		kb.name = "������";
//		kb.balance = 10000;
//		
//		kb.deposit(40000);
//		kb.withdraw(5000);
//		
//		// ���������� ��ü�� ������ ���� �����ؼ� �����
//		kb.balance--;
//		
//		kb.show();
		
		Account wr = new Account("�츮����", "101-12-123456", "������", 10000);
		
		
		wr.deposit(10000);
		wr.withdraw(12000);
		wr.show();
		
		
		
	}
}
