package ch08;
/*
 * ��¥ : 2021/1/10
 * �̸� : ��뼮
 * ���� : �ڹ� ����ó�� �ǽ��ϱ� ���� p264
 */ 

public class sub1_ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			//������ �߻��� ���ɼ��� �ִ� �ڵ���� �ۼ�
			r4 = num1 / num2;
		}catch(Exception e) {
			//������ �߻����� �� ó�� ���� �ۼ�
			e.printStackTrace();  //printStackTrace();�� �������� ǥ��
		}finally {
			//�����߻� ���ο� ������� ������ ������ ����Ǵ� ó����
			System.out.println("����ó�� �Ϸ�...");
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("���α׷� ����...");
		
	}

}
