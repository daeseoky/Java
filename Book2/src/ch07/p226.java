package ch07;

// Ŭ���� ����(����)
class B{
	boolean m1;    // �ʵ�� �ʱ�ȭ ���� �ʾƵ� ���� �ʱ�ȭ��
	int m2;
	double m3;
	String m4;
	void print() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		print2();
	}
	void print2() {
//		int k;
//		System.out.println(k);  ���� ����(k)�� �ʱ�ȭ �����ʾƼ� ����
	}
}

public class p226 {
	public static void main(String[] args) {
		// Ŭ������ Ȱ���� ��ü ����
		B b = new B();
		// ��ü Ȱ��
		b.print();
	}
	

}
