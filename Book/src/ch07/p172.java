package ch07;

public class p172 {
	
	// �ʵ� 
	String name; // �а���
	int grade; // �г�
	String department; // �а�

	// 1�� ������
		p172(){
			
		}
		
		// 2�� ������
		p172(String n){
			name = n;
		}
		
		// 3�� ������ <-5�� ������ ������ �̰͵� ���� �߻�(5���� ����� ���� �����)
		p172(String n, int g){
			name = n;
			grade = g;
		}
		
		// 4�� ������
		p172(String n, int g, String d){
			name = n;
			grade = g;
			department = d;
		}
		
//		// 5�� ������ �а��� �г��� �Ű������� �޴� ������ (�����߻�)
//		p172(String d, int g){
//			department = d;
//			grade = g;
//		}
	
	
}
