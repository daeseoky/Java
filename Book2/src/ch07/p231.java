package ch07;


// Ŭ���� ����
class C{
	// ����Ÿ�� void, �Ű����� ����
	void print() {
		System.out.println("�ȳ�");
	}
	// ���� Ÿ�� int, �Ű����� ����
	int data() {
		return 3;
	}
	//���� Ÿ�� double, �Ű����� 3��
	double sum(int a, double b) {
		return a + b;
	}
	// ���� Ÿ�� void, ���ο� ���� ����(�Լ��� ������)
	void printMouth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("�߸��� �Է�");
		}else {
			System.out.println(m+"�� �Դϴ�.");
		}
	}
}

public class p231 {
	public static void main(String[] args) {
		// ��ü ����
		C c = new C();
		
		// �޼��� ȣ��(��� Ȱ��)
		c.print();
		int k = c.data();
//		c.data();
		System.out.println(k);
		double result = c.sum(3,  5.2);
		System.out.println(result);
		c.printMouth(5);
		c.printMouth(15);
	}
	

}
