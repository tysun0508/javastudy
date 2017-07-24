package com.hb.bm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// List �������̽� ���� : ArrayList, Vector  => �迭����, �迭ó�� ó��
// ArrayList => ����ȭ������ ����, 1:N �ǽð� ó�� �Ұ���
// Vector => ����ȭ ����, 1:N �ǽð� ó�� ���� 
public class Ex06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		list.add("�±Ǻ���");
		list.add("����κ�");
		list.add("����");
		list.add("����");
		list.add(1,"��ڻ�");
		System.out.println(list);
	
		vector.add("�Ѹ�"); 
		vector.add("��浿"); 
		vector.add("�����"); 
		vector.add("��ġ");
		vector.add(2,"�öѱ����");
		vector.add("�Ѹ�"); 
		vector.add("��浿"); 
		vector.add("�����"); 
		vector.add("��ġ");
		vector.add("�Ѹ�"); 
		vector.add("��ġ");
		System.out.println(vector);
		
		// ũ��
		System.out.println("list ũ�� : "+list.size());
		System.out.println("vector ũ�� : "+vector.size());
		
		// �뷮
		// System.out.println(list.capacity());
		System.out.println("vector �뷮 : "+vector.capacity());
		
		// ��������
		if(list.contains("����")){
			System.out.println(list.indexOf("����")+"��° ����");
		}
		
		// get(��ü) => �ش� ��ü ���
		  String msg = list.get(list.indexOf("����"));
		  System.out.println(msg);
		  
		// ���
		for(String k:list){
			System.out.println(k);
		}
		System.out.println("::::::::::::::");
		Iterator<String> it = vector.iterator();
		while(it.hasNext()){
			 String str = it.next();
			 System.out.println(str);
		}
		System.out.println("::::::::::::::");
		for(int i=0; i<list.size(); i++){
			  String m = list.get(i);
			  System.out.println(m);
		}
	}
}
