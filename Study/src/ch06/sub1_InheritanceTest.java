package ch06;
/*
 * ��¥ : 2021/1/05
 * �̸� : ��뼮
 * ���� : �ڹ� Ŭ���� ��� �ǽ��ϱ� ���� p196
 */

public class sub1_InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb����", "101-11-123456", "ȫ�浵", 10000, "�Ｚ����", 100, 70000);
		
		kb.deposit(1000000);
		kb.withdraw(20000);
		kb.show();
		
		kb.buy(10, 65000);
		kb.show();
		
		kb.sell(10, 70000);
		kb.show();
		
		
		
		
	}
	
}
