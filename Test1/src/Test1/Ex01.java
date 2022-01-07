package Test1;
/*
 * 날짜 : 2021/1/06
 * 이름 : 양대석
 * 내용 : 자바 자료형 연습문제
 */

public class Ex01 {
	public static void main(String[] args) {
		
		char var1 = 'A';
		int var2 = 100;
		long var3 = 2147483648L;
		float var4 = 3.14f;
		double var5 = 3.14159;
		boolean var6 = true;
		boolean var7 = false;
		String var8 = "Hello";
		Object var9 = null;
		
		
		
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		System.out.println("var9 : "+var9);
				
		int x=5, y=0, z=0;
		y=x++;
		z=--x;
		System.out.println(x+","+y+","+z);
				
	}

}
