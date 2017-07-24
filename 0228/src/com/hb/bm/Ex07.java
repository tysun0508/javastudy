package com.hb.bm;

import java.util.Iterator;
import java.util.LinkedList;

// ť(Queue) : FIFO(First In First Out) : ���Լ���
//           ���������ڷᰡ ��������
// Queue �������̽��� ������ Ŭ���� => LinkedList;
public class Ex07 {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		// add, addFirst, addLast, offer
		link.add("�ѱ�");
		link.add("�߱�");
		link.offer("�±�");
		link.addFirst("����");
		link.add(2,"�̱�");
		System.out.println(link);
		
		System.out.println("ũ�� : "  + link.size());
		
		if(link.contains("�ѱ�")){
		     System.out.println(link.indexOf("�ѱ�"));	
		     String msg = link.get(link.indexOf("�ѱ�"));
		     System.out.println(msg);
		}
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println("::::::::::::::::::");
		// ���
		for(String k : link){
			System.out.println(k);
		}
		System.out.println("::::::::::::::::::");
		Iterator<String> it = link.iterator();
		while(it.hasNext()){
			String m = it.next();
			System.out.println(m);
		}
		System.out.println("::::::::::::::::::");
	}
}
