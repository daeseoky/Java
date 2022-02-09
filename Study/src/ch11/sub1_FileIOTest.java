package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2021/1/12
 * 이름 : 양대석
 * 내용 : 자바 파일 입출력 실습하기 교재 p496
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
				
				//입력스트림으로 데이터 읽기
				value =  fis.read();
				
				if(value==-1) {
					break;  //  더이상 읽을 데이터가 없을 경우
				}
				
				//출력 스트림으로 데이터 쓰기
				fos.write(value);
			}
			
			// 스트림 연결 해제
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
