package ch07;

public class p176 {
	
	//static ����
	static int sVar;
	// static �޼���
	static void sMethod() {
		
	}
	
	//�ν��Ͻ� ����
	int var;
	//�α��Ͻ� �޼���
	void method() {
		
	}
	
	//static �ʱ�ȭ��
	static {
		sVar = 0;  // static ����
		sMethod(); // static �޼���
	}
	
//	// static �޼���
//	static void sMethod() {
//		
//		// ����(static �޼��忡�� this Ű���� ���Ұ�)
//		this.sVar = 0;  // static ����
//		this.sMethod(); // static �޼���
//	}

}
