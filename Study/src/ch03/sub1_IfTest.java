package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2021/12/31
 * 이름 : 양대석
 * 내용 : 자바 조건문 실습하기 교재 p79
 */

public class sub1_IfTest {

	public static void main(String[] args) {
		
		//if문
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2){
		   // 조건이 참일때 실행
			System.out.println("num1은 num2보다 작다");
		}			
		
		if(num1 > 1) {
			System.out.println("nom1은 1보다 크다");
		}
		
		if(num1 > 0) {
			
			if(num2 > 1) {
				
				System.out.println("num1은 0보다 크고, num2는 1보다 크다");
			}
		}
		
		if(num1>0 && num2>1) {
			System.out.println("num1은 0보다 크고, num2는 1보다 크다");
		}
		//if ~ else
		int num3 = 3, num4 = 4;
		
		if(num3>num4) {
			// 조건이 참일때
			System.out.println("num3이 num4보다 크다");
		}else {
			// 조건이 거짓일때
			System.out.println("num3은 num4보다 작거나 같다");
		}
		
		
		//if ~ else if ~ else
		
		if(num1 > num2) {
			System.out.println("num1은 num2보다 크다");
		}else if(num2 > num3) {
			System.out.println("num2은 num3보다 크다");
		}else if(num3 > num4) {
			System.out.println("num3은 num4보다 크다");
		}else {
			System.out.println("num4가 가장 크다");   //println 프린터하고나서 줄바꿈
		}
		
		//확인문제
		Scanner sc = new Scanner(System.in);   //키보드 객체
		
		System.out.print("점수입력 : ");         
		int score = sc.nextInt();
		
		System.out.println("입력점수 : "+score);
		
		if(score>=90 && score<=100) {
			System.out.println("A입니다");
		}else if(score>=80 && score<90) {
			System.out.println("B입니다");
		}else if(score>=70 && score<80) {
			System.out.println("C입니다");
		}else if(score>=60 && score<70) {
			System.out.println("D입니다");
		}else {
			System.out.println("F입니다");
		}
		
		
	}
	
}
		
	
