package ch06;

public class p120 {
	
	public static void main(String[] args) {
		
		// ù��°
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		// �ι�°
		int[][] matrix2 = {{11,12,13},{14,15,16},{17,18,19}};
		
		// ����°
		int[][] matrix3 = {
				{21,22,23},
				{24,25,26},
				{27,28,29}
		};
		
		System.out.println("[ù��°]");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("[�ι�°]");
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("[����°]");
		for(int i=0; i<matrix3.length; i++) {
			for(int j=0; j<matrix3[i].length; j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
