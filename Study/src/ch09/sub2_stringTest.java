package ch09;
/*
 * ��¥ : 2021/1/10
 * �̸� : ��뼮
 * ���� : �ڹ� String ����Ŭ���� �ǽ��ϱ� ���� p284
 */ 
public class sub2_stringTest {
	
	public static void main(String[] args) {
		
		//���ڿ� ��
		String str1 = "hello";
		String str2 = new String("hello");  //String�� ��ü�� ������ �̷��� �ҷ�����
			
		if (str1==str2) {   //str1�� str2 ���� ���� �ƴ� �ּҰ����� ���ϹǷ� �ٸ��ٰ� ����
			System.out.println("str1 �������� str2 �������� ����");
		}else {
			System.out.println("str1 �������� str2 �������� �ٸ���");
		}
		
		if (str1.equals(str2)) {   //���� ������ ���Ϸ��� equals ����ؾ���
			System.out.println("str1 ���ڿ��� str2���ڿ��� ����");
		}else {
			System.out.println("str1 ���ڿ��� str2���ڿ��� �ٸ���");
		}
		
		//���ڿ� ����
		String hello = "Hello Korea";
		
		System.out.println("���ڿ� hello ���� : "+hello.length());
		
		//���ڿ� ����
		System.out.println("���ڿ� hello 1��° ���� : "+hello.charAt(0));
		System.out.println("���ڿ� hello 7��° ���� : "+hello.charAt(6));
		
		//���ڿ� �ڸ���
		System.out.println("���ڿ� hello 1~6���� �ڸ��� : "+hello.substring(0, 5));
		System.out.println("���ڿ� hello 7~���������� �ڸ��� : "+hello.substring(6));
		
		//���ڿ� �ε���
		System.out.println("���ڿ� hello �տ������� ���� e�ε��� : "+hello.indexOf("e"));
		System.out.println("���ڿ� hello �տ������� ���� e�ε��� : "+hello.lastIndexOf("e"));
		
		//���ڿ� ��ü
		System.out.println("���ڿ� 'Korea'�� 'Busan'���� ��ü : "+hello.replace("Korea", "Busan"));
		
		//���ڿ� ��ȯ
		int     var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;   //var3+"" �̷��Ե� ����
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
