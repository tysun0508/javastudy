package com.hb.pm;

public class Ex05 {
	private String point ;	//������ġ
	static float interest ;	//��������
	
	public Ex05(String point) {
		this.point = point ;
	}
	
	public void getInfo(){
		System.out.println("���� : "+ point);
		System.out.println("������ : "+ interest);
	}
}
