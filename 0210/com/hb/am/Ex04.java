package com.hb.am;
class Ex04
 
{
		// this ; 클래스 안에서 객체 자기 자신을 지칭하는 예약어
		//         클래스를 객체로 만들때 생성된 주소값을 의미한다.
		// 지역변수와 멤버변수의 이름이 같을때 멤버변수에 this.를 붙인다.
		
		private String name = "둘리" ;
		private int age = 10 ;

		//기본생성자
		public Ex04(){
			//this("한빛") ;
			System.out.println("기본 : " + this) ;
		}

		public Ex04(String n){
				this() ;
				name = n ;
			System.out.println("기본x : " + this) ;
		}
		
		// getter
		public String getName(){
				return name ;
		}
		// setter
		public void setName(String name){   // 이 줄 name은 지역변수,   지역변수가 우선순위
				this.name = name ;				   // this. 붙이면 전역변수
		
		}

}
