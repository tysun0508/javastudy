package com.hb.am;


// 내부클래스 : 클래스 안에 클래스가 정의되어 있는 클래스
// 				외부클래스를 생성한 후 내부클래스를 생성할 수 있다.(static 예외)
//				외부클래스의 멤버들을 마음대로 사용가능(private도)
//				컴파일한 후 $가 붙는다.
// 		종류 : Member, Local, Static, Anonymous
// 1. Member : 외부클래스{..내부클래스..}
public class Ex02 {
	int su1 = 10 ;
	final int su2 = 20 ;
	static int su3 = 30 ;
	static final int su4 = 40 ;
	private int su5 = 50 ;

	public Ex02() {
		System.out.println("여기는 외부클래스 : " + this);
	}
	// 일반메소드
	public void prn(){
		int num1 = 100 ;
		final int num2 = 200 ;
		
		//지역변수는 static 사용불가
		//static int num3 = 300 ;
		//static final int num4 = 400 ;
		
		//private도 안됨
		//private int num5 = 500 ;
		System.out.println("여기는 외부메소드");
	}
	
	// 내부 클래스
	class Ex02_1{
		int s1 = 10 ;
		final int s2 = 20 ;
		// 내부클래스는 static 사용못함.
		// 사용할 경우 클래스에도 static을 붙여야 한다.
		//static int s3 = 30 ;
		static final int s4 = 40 ;
		private int s5 = 50 ;
		
		// 생성자
		public Ex02_1() {
			System.out.println("내부클래스 생성자 : " + this);
			
		}
		// 내부클래스 메소드
		public void in_prn(){
			int number1 = 10 ;
			final int number2 = 20 ;
			//static int number3 = 30 ;
			//static final int number4 = 40 ;
			//private int number5 = 50 ;
			
			// 외부클래스 변수들
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su5);
			// 외부클래스 메소드
			prn() ;
		}
		
	}
	

}

