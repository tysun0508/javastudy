package com.hb.am;

public class TestMain {
	public static void main(String[] args) {
		Zerg z = new Zerg("��Ʈ�󸮽�ũ", false) ;
		Protoss p = new Protoss("ĳ����", true) ;
		Terran t = new Terran("��Ʈ", false) ;
		
		z.decEnergy();
		z.decEnergy();
		z.decEnergy();
		System.out.println("���׿����� : " + z.getEnergy());
		System.out.println("�̸� : " + z.getName());
		if(z.fly){
			System.out.println("�ϴ��� ����.");
		}else{
			System.out.println("�پ�ٴѴ�.");
		}
	}
}
