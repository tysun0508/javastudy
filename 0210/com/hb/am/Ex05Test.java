package com.hb.am;

public class Ex05Test {
	public static void main(String[] args) {
		Ex05 test = new Ex05() ;
		
		String name = test.getName() ;
		System.out.println(name);
		
		Ex05 test2 = new Ex05("�±Ǻ���") ;
		name = test2.getName() ;
		System.out.println(name) ;
	}
}
