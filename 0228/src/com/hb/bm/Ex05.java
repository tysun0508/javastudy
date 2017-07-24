package com.hb.bm;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// List �������̽� :  �迭�� ����� ����, ���� �����Ӱ�, �̸� �������� 
//                   �ʾƵ� �ȴ�.
// ����Ŭ���� : Vector, ArrayList, Stack;
// Stack : LIFO(Last In First Out) : �������� ���� �ڷᰡ ���� ����
// add, push => �߰� 
// pop => �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �������� 
// peek => �� ���� �����ϴ� ��ü ��ȯ, ������ ���� �ʴ´�.
// search => �˻�(�����ʺ��� ã��(1����)
// indexOf => ��ġ ��ȯ(���ʺ��� ã��(0����)

public class Ex05 {
	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		list.add("�����");
		list.add("�⼺��");
		list.add("��û��");
		list.add(2, "���θ�");
		list.push("������");
		System.out.println(list);
		
		if(list.contains("������")){
			// ã��
			int res = list.indexOf("������");
			System.out.println(res+"��° ������"); // �迭���
			res = list.search("������");
			System.out.println(res+"��° ������"); // ���ù��
		}else{
			System.out.println("�������� ����");
		}
		
		// ���
		for(String k : list){
			System.out.println(k);
		}
		System.out.println(":::::::::::::::::::");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String m = it.next();
			System.out.println(m);
		}
		System.out.println(":::::::::::::::::::");
		while(! list.isEmpty()){
			  String msg =   list.pop();
			  System.out.println(msg);
		}
		System.out.println(":::::::::::::::::::");
		System.out.println(list);
		
	}
}
