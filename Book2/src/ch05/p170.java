package ch05;

public class p170 {
	public static void main(String[] args) {
		
		// 배열의 선언 방법 1
		int[][] array1 = new int[3][4];
		int[][] array2;
		array2 = new int[3][4];
		
		// 배열의 선언 방법 2
		int array3[][] = new int[3][4];
		int array4[][];
		array4 = new int[3][4];
		
		// 배열의 선언 방법 3
		int[] array5[] = new int[3][4];
		int[] array6[]; 
		array6 =new int[3][4];
		
		// 다양한 배열의 선언(기본 자료형 배열, 참조 자료형 배열) 
		boolean[][] array7 = new boolean[3][4];
		double[][] array8 = new double[3][4];
		String[][] array9 = new String[3][4];  // 참조 자료형 배열
		
		
		// 배열 출력하기 1
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 배열 출력하기 2
		for(int[] array : array2) {
			for(int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] array : array3) {
			for(int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] array : array4) {
			for(int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] array : array5) {
			for(int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] array : array6) {
			for(int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(boolean[] array : array7) {
			for(boolean k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(double[] array : array8) {
			for(double k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(String[] array : array9) {
			for(String k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
