package ch07;

public class p175 {
	
	// ������
	p175(){
		System.out.println("������ ȣ��");
	}
	
	//static �ʱ�ȭ��
	static {
		System.out.println("Ŭ���� �ʱ�ȭ �� ����");
	}
	
	//�ν��Ͻ� �ʱ�ȭ ��
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ����");
	}
	
	public static void main(String[] args) {
		System.out.println("main �޼������");
		System.out.println("main p175 ��ü����");
		p175 init1 = new p175();
		System.out.println("main p175 ��ü����");
		p175 init2 = new p175();
	}

}
