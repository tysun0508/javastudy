package com.hb.am;

import java.util.concurrent.SynchronousQueue;

public class Ex02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer() ;
		System.out.println("���� : "+ sb.length());
		System.out.println("�뷮 :" + sb.capacity());
		
		//���� �߰��ϱ�(append())
		sb.append(true);
		System.out.println("���� : "+ sb.length());
		System.out.println("�뷮 :" + sb.capacity());
		
		sb.append("korea") ;
		System.out.println("���� : "+ sb.length());
		System.out.println("�뷮 :" + sb.capacity());
		sb.append(1234567) ;
		System.out.println("���� : "+ sb.length());
		System.out.println("�뷮 :" + sb.capacity());
		sb.append('a') ;
		System.out.println("���� : "+ sb.length());
		System.out.println("�뷮 :" + sb.capacity());
		System.out.println(sb);
		
		//���� �����ϱ� (insert(������ �ڸ��� ��ġ, ������ ����))
		sb.insert(4, "��") ;
		System.out.println(sb);
	}
}
