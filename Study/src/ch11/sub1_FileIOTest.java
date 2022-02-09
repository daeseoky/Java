package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2021/1/12
 * �̸� : ��뼮
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p496
 * 
 * input stream, output stream
 */ 

public class sub1_FileIOTest {
	
	public static void main(String[] args) {
		String path1 = "C:\\Users\\bigdata\\Desktop\\text1.txt";
		String path2 ="C:\\Users\\bigdata\\Desktop\\Text2.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value =0;
			while(true) {
				
				//�Է½�Ʈ������ ������ �б�
				value =  fis.read();
				
				if(value==-1) {
					break;  //  ���̻� ���� �����Ͱ� ���� ���
				}
				
				//��� ��Ʈ������ ������ ����
				fos.write(value);
			}
			
			// ��Ʈ�� ���� ����
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
