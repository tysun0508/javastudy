package com.hb.am;

import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
			//StringTokenizer : 문자열을 나눈다.(String.split())
			//차이점 : 마음대로 나눌 수 없다. 필요없는 공간은 삭제해준다.
			//			반환형이 String[] 아니라서 for문을 사용 할수 없다.
			StringTokenizer st = new StringTokenizer("this is a test");
			String [] arr =new String[st.countTokens()] ;
			int i = 0 ;
			while (st.hasMoreTokens()) {
				arr[i] = st.nextToken() ;
				i++ ;
			}
			for(String k : arr){
				System.out.println(k);
			}
			StringTokenizer st2 = new StringTokenizer("2017/02/13", "/") ;
			while (st2.hasMoreTokens()) { 
			System.out.println(st2.nextToken());
			}
			
	}
}
