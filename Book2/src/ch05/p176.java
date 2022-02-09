package ch05;

public class p176 {
	public static void main(String[] args) {
		// 배열 객체의 생성및 원소 값 대입 1
		int[][] array1 = new int[2][3]; 
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		// 배열 객체의 생성및 원소 값 대입 2
		int[][] array2 = new int[][] {{1, 2, 3},{4, 5, 6}};
		
		// 배열 객체의 생성및 원소 값 대입 3
		int[][] array3 = {{1, 2, 3},{4, 5, 6}};
		
		// 배열 객체의 출력
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array3[i].length; j++) {
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		
		}

	}
}
