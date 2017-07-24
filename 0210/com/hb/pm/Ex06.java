package com.hb.pm;

public class Ex06 {
	// static 초기화
	// 형식) static {초기화}
	
	int a = 10 ;
	static int b = 20 ;	//초기값 전에 있으면 초기화되서 이후값이 100이 출력
	static {
		b=100;
		c=1000;
	}
	static int c = 2000; //초기값 이후에 있으면 값이 변경되서 2000이 출력
	
	public void add(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		int k1 = 10;
		//main도 static 이기 때문에 멤버변수는 사용 할 수 없다.
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(k1);
		
	}
}
