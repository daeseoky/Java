package ch05;

/*
 * ��¥ : 2021/1/04
 * �̸� : ��뼮
 * ���� : �ڹ� �޼��� �迭 �ǽ��ϱ� ���� p152
 * 
 * 
 * ��������(Ŭ���� ����)
 * - Ŭ�������� static ������ �������
 * - �޸𸮿��� �ϳ��� ������ ����
 * - Ŭ���� Ÿ��(��ü���� x)���� ���� ���� �� �� �ִ�
 * 
 * �����޼���(Ŭ���� �޼���)
 * - Ŭ�������� static ������ ����޼���
 * - �޸𸮿��� �ϳ��� �޼���� ����
 * - Ŭ���� Ÿ������ ���� ȣ�� �� �� �ִ�
 */
public class sub2_StaticTest {
	
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//�������� �����޼���� Ŭ���� �̸����� ���� ���� �Ҽ� �ִ�
		Increment.num2 = 0;
		Increment.add();

	}

}
