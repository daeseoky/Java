package Test1;
/*
 * 날짜 : 2021/1/06
 * 이름 : 양대석
 * 내용 : 1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */

public class Ex07 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1; k<=10; k++) {
			
			if(k%2==0 || k%3==0) {
				
				total += k;
			}
		}
		
		System.out.println("1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합: "+total);
	}

}
