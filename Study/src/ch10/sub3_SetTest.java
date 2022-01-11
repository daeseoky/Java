package ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2021/1/11
 * 이름 : 양대석
 * 내용 : 자바 컬렉션 집합(Set) 실습하기 교재 p357(컬렉션 = 자료구조)
 *      Set <- HashSet
 */ 

public class sub3_SetTest {
	public static void main(String[] args) {
		
		//Set 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		
		System.out.println("set 원소 : "+set);
		System.out.println("set 크기 : "+set.size());
		
		// Set 출력
		for(int n : set) {
			System.out.print(" n : "+n);
		}
		System.out.println();
		
		//반복자(Iterator)를 이용한 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.print(num+" ");
		}
		
		System.out.println();
		
	}

}
