package com.hb.am;

import java.util.Formatter;

public class Ex05 {
	public static void main(String[] args) {
		Formatter f = new Formatter();
		// %b=>boolean , %d=>int , %f=>�Ǽ�(float) , %c=>char , %s=>���ڿ�
		f.format("%b,%d,%f,%.1f,%c,%s",true, 120, 3.14, 3.15, 'A', "Hello~~") ;
		System.out.println(f);
		
		//�����
		int su = 10 ;
		int su2 = 10 ;
		su = su + 5 ;
		
		su2 = su + su2 ;
		
		
	}
}
