package com.hb.pm;

public class Ex01 {
		//��� : Ŭ������ Ŭ�������� ����(is a ����)
		//		  �ڽ�Ŭ������ �θ�Ŭ������ ���(����, ���, �޼ҵ�)���� �ƹ��� ������� ���
		// 		  �� �ڽ�Ŭ������ �ɷ� Ȯ��(extends ����� ���)
	
	String name = "ȫ�浿";
	int age = 12 ;
	private String addr = "����" ;
	static int su = 5 ;
	private static int su2 = 100 ;
	
	// this : Ŭ�����ȿ��� �ڱ��ڽ�(�����ּ�)�� ��Ī�ϴ� �����
	public Ex01(String name) {
		System.out.println("�θ�Ŭ���� ������ : " + this);
		this.name = name ;
	}
	public void prn(){
		System.out.println("�θ�Ŭ���� �޼ҵ�");
	}
	public static void prn2(){
		System.out.println("�θ�Ŭ����static�޼ҵ�");
	}
}
