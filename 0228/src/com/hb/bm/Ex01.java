package com.hb.bm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator ;


// �÷��� : ��ü���� ��Ƽ� �������� �ϴ� �������̽���
// ���׸� : �÷����� � ��ü��� �̷�������� ǥ���ϴ� ��ü Ÿ��
// ���� : <��ü�ڷ���>
// API : <T> => ��ü Ÿ��, <E> => �÷��Ǿȿ� �����ϴ� ��ü �ϳ��� ����
//       Map ����; <k,v> => key, value�� ����, key�� value�� 1��1 ����
//				   Ű�� ȣ���ϸ� value�� ���´�.

// �ֻ��� Ŭ������ : Collection<E> => Set<E>, List<E>, Queue<E>, Map<K,V>

// �ֿ�޼ҵ�
// add(E e) : boolean => �ش簴ü�� �߰��Ѵ�. �����ϸ� true
// addAll(Collection<? extends E> c) => Ư�� �÷��ǿ� �ִ� ��� ��Ҹ� �ٸ� �÷��ǿ� �߰�
// clear() : ��� ��� ����
// contains(Object o) : �ش� ��ü�� �÷��ǿ� �����ϸ� true
// isEmpty() : �ش� �÷����� ��������� true
// remove(Object o) : �ش� ��ü�� ����
// size() : �ش� �÷��Ǿȿ� �����ϴ� ��ü�� ��
// toArray() : �ش� �÷����� �迭�� �����
// iterator() : �ش� �÷��Ǿȿ� �����ϴ� ��ü�� ���ʴ�� �����ϱ� ���� Iterator��ü ��ȯ
public class Ex01 {
	public static void main(String[] args) {
		// Set �������̽��� ������ Ŭ���� : HashSet, TreeSet
		// Ư¡ : �ߺ��ȵ�, Ư���������� ���ľȵ�
		// 		  TreeSet�� �������� �����̴�.
		
		Set<String> test1 = new HashSet<>();
		Set<Integer> test2 = new TreeSet<>();
		
		// ��ü ����
		String name = "����" ;
		// ������ ��ü �߰�
		test1.add(name);		
		test1.add("�Ѹ�");
		test1.add("������");
		
		Integer k1 = new Integer(100);
		test2.add(k1);
		
		test2.add(new Integer(200));
		
		//�ڵ����� ��ü�� ������� ����.(����ڽ� => �⺻�ڷ����� ��ü�� ����)
		test2.add(300);
		
		//test2.add(true); // ���׸� Ÿ���� Integer�� ����
		//test2.add('A');  // ���׸� Ÿ���� Integer�� ����
		//test2.add(3.14); // ���׸� Ÿ���� Integer�� ����
		//test2.add("10"); // ���׸� Ÿ���� Integer�� ����
		
		// ��ü ���뺸��
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1.size());
		System.out.println(test2.size());
		
		// �ϳ��� ����
		// 1. �迭 ����ؼ� for�� ���
		for(String k : test1){
			System.out.println(k);
		}
		
		// 2. Iterator() ���
		Iterator<Integer> it = test2.iterator();
		while(it.hasNext()){
			int k = it.next(); // ��ڽ� : ��ü�� �ٽ� �ڷ�������
			System.out.println(k+10);
		}
	
	}
}



















