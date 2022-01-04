package ch03;

/*
 * 날짜 : 2021/1/04
 * 이름 : 양대석
 * 내용 : 자바 조건문 실습하기 교재 p92
 */
public class sub3_WhileTest {

	public static void main(String[] args) {
		
		//1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k<=10) {
			sum += k;
			k += 1;
		}
		
		System.out.println("1부터 10까지 합 :"+sum);
		//do ~ while문
		int total = 0;
		int i = 1;
		do {
			if(i % 2 == 0) {
				total += i;
			}
			i++;	
		}while(i <=10);
		System.out.println("1부터 10까지 짝수합 : "+total);
		
		//break
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소 공배수 : "+num);
		
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
		System.out.println("1부터 10까지 짝수합 : "+tot);
	}
}
