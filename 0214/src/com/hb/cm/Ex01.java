package com.hb.cm;

import java.util.Random;

public class Ex01 extends Random {
	
	public Ex01(){
		super();
	}
	
	public static void main(String[] args) {
		//Random ran = new Random() ;
		//int su = ran.nextInt(44)+1;
		//System.out.println(su);
		
		//�ڱ⸦ ��ü�� ����� ���� �θ�Ŭ������ ����� �� �ִ�.
		Ex01 test = new Ex01();
		int su = test.nextInt(44)+1 ;
		System.out.println(su);
	}
}
