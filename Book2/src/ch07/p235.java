package ch07;

import java.util.Arrays;

public class p235 {
	public static void main(String[] args) {
		// �迭�� �Է¸Ű������� �ϴ� �޼��� ȣ��
		int[] a =  {1, 2, 3};
		printArray(a);
		int[] b = new int[] {1, 2, 3};
		printArray(b);
		printArray(new int[] {1, 2, 3});
//		printArray({1, 2, 3});         // ���� �߻�
		
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
		
	}

}
