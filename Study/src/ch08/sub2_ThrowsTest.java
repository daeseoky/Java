package ch08;
/*
 * ��¥ : 2021/1/10
 * �̸� : ��뼮
 * ���� : �ڹ� ���� ������ �ǽ��ϱ� ���� p273
 */ 

public class sub2_ThrowsTest {
	public static void main(String[] args) {
		
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1,  4); 
		int r2 = c.minus(1,  4); 
		int r3 = c.multi(2,  4); 
		
		int r4 = 0;
		try {
			//throw �޼��带 ȣ���Ҷ� ����ó��
			r4 = c.div(1, 4);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
