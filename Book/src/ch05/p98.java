package ch05;

public class p98 {
	
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+" ´Ü" );
			for(int j=1; j<=9; j++) {
				int k = i * j;
				System.out.println(i+"x"+j+"="+k );
			}
		}
	}

}
