package com.hb.am;


public class Ex02_Main {
	public static void main(String[] args) {
		
		// ����Ŭ������ ������(����Ŭ���� ȥ��) ��ü ������ �ȵ�
		// Ex02_1 test = new Ex02_1() ;
		// �ݵ�� �ܺ�Ŭ������ ���ؼ��� ������
			Ex02 test = new Ex02() ;
			System.out.println(":::::::::::::::::::::::::");
			Ex02.Ex02_1 test1 = new Ex02().new Ex02_1() ;
			System.out.println(":::::::::::::::::::::::::");
			Ex02.Ex02_1 test2 = test.new Ex02_1() ;
			System.out.println("::::::::::�ܺ�Ŭ���� ����:::::::::::::::");
		
		//�ܺ�Ŭ������ �����ϱ�
			System.out.println(test.su1);
			System.out.println(test.su2);
			System.out.println(test.su3);
			System.out.println(test.su4);
		//	System.out.println(test.su5); //private
			test.prn();
			System.out.println(":::::::::::����Ŭ���� ����:::::::::::::::");
		
		//����Ŭ���� ����
			System.out.println(test2.s1);
			System.out.println(test2.s2);
			System.out.println(test2.s4);
			test2.in_prn() ;
			
			
	}
}
