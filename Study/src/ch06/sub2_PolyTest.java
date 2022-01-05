package ch06;

/*
 * ��¥ : 2021/1/05
 * �̸� : ��뼮
 * ���� : �ڹ� ������ �ǽ��ϱ� ���� p196
 * 
 * ������(Polymorphism)
 * - �ϳ��� ����� ���� ������� ���ϴ� ����
 * - ��� ���迡�� �θ�Ŭ������ ����� �ڽ� Ŭ�������� �ٽ� �������ϴ� ���
 * - ��ü�� Ÿ���� �θ�Ŭ���� Ÿ�� ���� -> ���α׷��� �������� ���δ�.
 * 
 */
public class sub2_PolyTest {
	
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		Animal lion = new Lion();
		Animal shark = new Shark();
		
		eagle.move();
		lion.move();
		shark.move();
		
		eagle.hunt();
		lion.hunt();
		shark.hunt();
	}
}
