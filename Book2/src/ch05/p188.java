package ch05;

public class p188 {
	public static void main(String[] args) {
		
		// args �迭�� ���� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		// �Է¸Ű����� ��� 1
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
		
		// �Է¸Ű����� ��� 2
		for(String s: args) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
