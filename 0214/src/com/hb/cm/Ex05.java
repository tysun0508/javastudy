package com.hb.cm;

public class Ex05 extends Ex04 {
		String name = "ȫ�Ѹ�" ;
		
		
		//�������̵� : �θ�Ŭ������ �޼ҵ带 ������ �ͼ�
		//				 �ڱ⸶����� �����ϴ� ��
		
		//�������̵��� �ݴ� : final method
		//�θ�Ŭ������ �޼ҵ带 ������ͼ� ��븸 �� �� �ִ�.
		//��, �θ�Ŭ���� �޼ҵ��� ������ ������ �� ����. 
		public void add(){
			age = age + 10 ;
			System.out.println(age);
		}
		@Override
		public void sub() {
			age = age - 15 ;
			System.out.println(age);
			super.sub();
		}	
}
