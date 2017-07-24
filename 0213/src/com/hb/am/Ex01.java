package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		//암시적 객체 생성
		String s1 = "korea" ;
		String s2 = "korea" ;
		//명시적 객체 생성
		String s3 = new String("korea") ;
		String s4 = new String("korea") ;
		
		//객체 == 객체 : 내용이 같냐고 묻는게 아니고 참조주소가 같냐고 묻는것이다.
		//자료형 == 자료형 : 내용이 같냐고 묻는것이다.
		if(s1==s2){	
			//상수풀이라는 곳에서 s2를 생성할때 s1이 이미 등록되어 있으므로
			//s1의 주소를 참조하게 된다.
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		if(s3==s4){
			System.out.println("같다");
		}else{
			//new라는 예약어를 사용하면 항상 heap 메로리에 새로운 영역을 차지하고 객체를 생성
			System.out.println("다르다");
	    }
		// format() => 형식을 지정하고 형식에 맞춰 생성
		
		//printf를 쓰면 소수점 출력가능
		String s5 = "hanbit" ;
		String s6 = "hanbit" ;
		String s7 = String.format("%20s, %s", s5, s6);
		System.out.println("s7 : " + s7);
		//s=> 문자열, d=>정수 , f=>실수
		int su = 314 ;
		float su2 = 3.445f ;
		double su3 = 3.5455 ;
		double su4 = 125.124 ;
		System.out.printf("%s, %3d, %.0f, %.0f,", s5,su,su2,su3);
		System.out.println();
		
		// split("구분자") => 문자열을 배열로 나눈다.
		// split("구분자", 숫자)=>숫자는 배열의 크기를 말함.
		String s8 = "Happy day 2017 02 13" ;
		String[ ] s9 = s8.split(" ") ; //띄어쓰기를 기준을 split
		
		//배열은 무조건 for문  //특히 개선된 for문을 사용하자
		for (int i = 0; i < s9.length; i++) {
			System.out.println(i + " : " +s9[i]);
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		//개선된 for문 형식
		//for (배열의 자료형 사용할변수 : 배열) {   }
		for (String k : s9) {
			System.out.println(k);
		}
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		String[] s10 = s8.split(" ", 4) ;
		for (int i = 0; i < s10.length; i++) {
			System.out.println(i + ": "+s10[i]);
		}
	
	
	}
}
