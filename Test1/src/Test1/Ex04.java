package Test1;

/*
 * ��¥ : 2021/1/06
 * �̸� : ��뼮
 * ���� : �ڹ� ������ ��������
 */

public class Ex04 {
	public static void main(String[] args) {
		int num = 1;
		int result;
		
		result = num++;
		System.out.println("result : "+result);
		result = ++num;
		System.out.println("result : "+result);
		result = num--;
		System.out.println("result : "+result);
		result = --num;
		System.out.println("result : "+result);
	}

}
