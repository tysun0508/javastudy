package com.hb.pm;

//자식클래스
public class Ex02 extends Ex01 {		
	String name ="마루치";
	public Ex02(){
	//상속관계가 되는 순간 자식클래스의 생성자 첫 줄에는
	//부모클래스의 생성자가 숨어있다. (super()) ;
		super("둘리") ;
		System.out.println("자식클래스 기본생성자 : " +this);
	}
	
	public void namePrn(){
		String name = "태권브이" ;
		System.out.println("이름 : "+name);
		//우선순위 : 지역변수>전역변수
	}
	public void addrPrn(){
		System.out.println("나이 : " + age);
		// 상속관계이어도 private는 참조 불가능	
		//System.out.println("주소 : "+ addr);
		
		
	}		

}
