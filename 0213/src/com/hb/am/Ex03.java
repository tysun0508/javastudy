package com.hb.am;

import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
			//StringTokenizer : ���ڿ��� ������.(String.split())
			//������ : ������� ���� �� ����. �ʿ���� ������ �������ش�.
			//			��ȯ���� String[] �ƴ϶� for���� ��� �Ҽ� ����.
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
