package ch04;

public class p64 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		//& 연산
		System.out.println(b>0&&(a/b>0)); //&를 하나만 쓰면 에러가 뜸 이걸 방지하기 위하여 &&를사용(0을 나누면 에러가 발생하므로)
		
	}
}
