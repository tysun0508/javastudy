package com.hb.pm;

public class Ex06 {
	// static �ʱ�ȭ
	// ����) static {�ʱ�ȭ}
	
	int a = 10 ;
	static int b = 20 ;	//�ʱⰪ ���� ������ �ʱ�ȭ�Ǽ� ���İ��� 100�� ���
	static {
		b=100;
		c=1000;
	}
	static int c = 2000; //�ʱⰪ ���Ŀ� ������ ���� ����Ǽ� 2000�� ���
	
	public void add(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		int k1 = 10;
		//main�� static �̱� ������ ��������� ��� �� �� ����.
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(k1);
		
	}
}
