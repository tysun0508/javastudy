package com.hb.am;

// 예외처리 : try~catch~
// try{
//		예외 발생 가능한 문장;
//	}catch(예외객체e){
//		예외발생시 처리문장 ;
//	}
// 목적 : 예외가 발생되면 비정상적인 종류가 된다.
//		  예외처리는 비정상적인 종료를 정상적인 종료로 유도하고
//		  예외발생시 예외를 처리한다.
//		  예외발생시점 아래에 존재하는 명령어들을 무시하고
//		  바로 catch문으로 이동된다.

public class Ex01 {
	public static void main(String[] args) {
		try{
			int[] var = {10,200,30};
			for(int i=0 ; i<=3; i++)
				System.out.println("var["+i+"]:"+var[i]);
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열을 넘었습니다.");
		}	
		System.out.println("프로그램 끝!");
		
	}
}
