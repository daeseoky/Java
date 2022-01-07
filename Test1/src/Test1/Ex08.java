package Test1;

/*
 * 날짜 : 2021/1/06
 * 이름 : 양대석
 * 내용 : 자바 반복문 연습문제
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
