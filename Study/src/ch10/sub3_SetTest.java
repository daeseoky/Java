package ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��¥ : 2021/1/11
 * �̸� : ��뼮
 * ���� : �ڹ� �÷��� ����(Set) �ǽ��ϱ� ���� p357(�÷��� = �ڷᱸ��)
 *      Set <- HashSet
 */ 

public class sub3_SetTest {
	public static void main(String[] args) {
		
		//Set ����
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		
		System.out.println("set ���� : "+set);
		System.out.println("set ũ�� : "+set.size());
		
		// Set ���
		for(int n : set) {
			System.out.print(" n : "+n);
		}
		System.out.println();
		
		//�ݺ���(Iterator)�� �̿��� ���
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.print(num+" ");
		}
		
		System.out.println();
		
	}

}
