package ch04;

/*
 * ��¥ : 2021/1/04
 * �̸� : ��뼮
 * ���� : �ڹ� �޼��� ��������� ���� �ǽ��ϱ� ���� p159
 */
public class sub5_MethodStackTest {
	
	//��������(�������) : Ŭ�������� ������ ����
	int num = 1;
	
	public static void main(String[] args) {
		
		//�������� : �޼��忡�� ������ ����
		int result = 0;
		int n1 = 1;
		int n2 = 10;
		
		result = sum(n1, n2);
		
		System.out.println("��� : "+result);
	}
	
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k= start; k<=end; k++) {
			total += k;
		}
		return total;
	}

}
