package ch03;

/*
 * ��¥ : 2021/1/04
 * �̸� : ��뼮
 * ���� : �ڹ� ���ǹ� �ǽ��ϱ� ���� p92
 */
public class sub3_WhileTest {

	public static void main(String[] args) {
		
		//1���� 10���� ��
		int sum = 0;
		int k = 1;
		
		while(k<=10) {
			sum += k;
			k += 1;
		}
		
		System.out.println("1���� 10���� �� :"+sum);
		//do ~ while��
		int total = 0;
		int i = 1;
		do {
			if(i % 2 == 0) {
				total += i;
			}
			i++;	
		}while(i <=10);
		System.out.println("1���� 10���� ¦���� : "+total);
		
		//break
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5�� 7�� �ּ� ����� : "+num);
		
		//continue
		int tot = 0;
		int j = 0;
		
		while(j<=10) {
			
			j++;
			
			if(j%2 == 1) {
				continue;
			}
			tot += j;
		}
		System.out.println("1���� 10���� ¦���� : "+tot);
	}
}
