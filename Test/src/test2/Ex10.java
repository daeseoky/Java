package test2;
/*
 * ��¥ : 2021/1/07
 * �̸� : ��뼮
 * ���� : �ڹ� �ĺ���ġ ���� ��� �޼��� ��������
 */

public class Ex10 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	
	public static int fibo(int n) {
		
		if(n<=1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
}
