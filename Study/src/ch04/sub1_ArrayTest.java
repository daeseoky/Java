package ch04;

/*
 * ��¥ : 2021/1/04
 * �̸� : ��뼮
 * ���� : �ڹ� �迭 �ǽ��ϱ� ���� p108
 * 
 * �迭(Array)
 *  - �����͸� �Ϸķ� �����ؼ� �����ϴ� �ڷᱸ��
 *  - ���̽� List �ڷᱸ���� ���
 */

public class sub1_ArrayTest {

	public static void main(String[] args) {
		
		// �迭(Array)
		int nums[] = {1, 2, 3, 4, 5};
		String[] cities= {"����", "����", "�뱸", "�λ�", "����"};   //[]�� ��ġ�� ������
		char [] alpha = {'a', 'b', 'c'};
		
		// �迭 ����
		System.out.println("�迭 nums ���� : "+nums.length);
		System.out.println("�迭 cities ���� : "+cities.length);
		System.out.println("�迭 alpha ���� : "+alpha.length);
		
		// �迭 ���� ���
		System.out.println("nums[0] : "+nums[0]);
		System.out.println("nums[2] : "+nums[2]);
		System.out.println("nums[4] : "+nums[4]);
		System.out.println("cities[3] : "+cities[3]);
		System.out.println("cities[4] : "+cities[4]);
		System.out.println("alpha[1] : "+alpha[1]);
		
		// �迭 �ݺ���
		for(int num : nums) {
			System.out.println("num : "+num);
		}
		
		for(String city : cities) {
			System.out.println("city : "+city);
			
		}
		
	}
}
