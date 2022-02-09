package Test2;
/*
 * 날짜 : 2021/1/06
 * 이름 : 양대석
 * 내용 : 자바 배열 문자 출력 연습문제
 */
public class Ex01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		for(row=1; row<10; row++) {
			
			for(col=0; col<=row; col++) {
				
				System.out.print(str[col]);
			}
			System.out.println();
		}
		
	}

}
