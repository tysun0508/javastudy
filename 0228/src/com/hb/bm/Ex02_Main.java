package com.hb.bm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02_Main {
	public static void main(String[] args) {
		Ex02 t1 = new Ex02("����", 17, "����");
		Ex02 t2 = new Ex02("�Ѹ�", 1017, "����");
		Ex02 t3 = new Ex02("������", 27, "����");
		Ex02 t4 = new Ex02("��ġ", 317, "������ī");
		Ex02 t5 = new Ex02("�����", 17, "����");
		
		// �迭�� ���� �� : ũ������ �Ұ�, �߰� ���� ����
		Ex02[] arr = new Ex02[5];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		arr[3] = t4;
		arr[4] = t5;
		
		for(Ex02 k : arr){
			System.out.print(k.getName()+"\t");
			System.out.println(k.getAge());
		}
		System.out.println("�� : " + arr.length);
		System.out.println(":::::::::::::::::::::::::");
		
		// �÷����� �߰�, ������ �����Ӵ�.
		Set<Ex02> test = new HashSet<>();
		test.add(t1);
		test.add(t2);
		test.add(t3);
		test.add(t4);
		test.add(t5);
		test.add(new Ex02("������", 1016, "�ϱ�"));
		for (Ex02 k : test) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getAge()+"\n");
		}
		
		System.out.println("�� : "+test.size());
		
		Iterator<Ex02> it = test.iterator();
		while(it.hasNext()){
			Ex02 member = it.next();
			System.out.print(member.getName()+"\t");
			System.out.print(member.getAge()+"\n");
		}
		
		
	}
}

































