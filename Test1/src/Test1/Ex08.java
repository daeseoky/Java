package Test1;

/*
 * ��¥ : 2021/1/06
 * �̸� : ��뼮
 * ���� : �ڹ� �ݺ��� ��������
 */
public class Ex08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j= n-1;j>i ;j--) {
				System.out.print(" ");
				
			}
			for(int j=0; j<=2*i;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
