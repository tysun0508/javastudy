package com.hb.bm;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		String[] str = {"java", "jsp", "spring", "android"};
		
		// �迭�� ������ Set������ �־��
		Set<String> set1 = new HashSet<>();
		for(String k : str){
			set1.add(k);
		}
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("html");
		set2.add("css");
		set2.add("jsp");
		set2.add("jquery");
		set2.add("ajax");
		set2.add("spring");
		System.out.println(set2);
		
		// �ߺ��˻�
		Set<String> set3 = new HashSet<>();
		for(int i=0; i<str.length; i++){
			if(! set2.add(str[i])){
				set3.add(str[i]);
			}
		}
		System.out.println(set2);
		System.out.println(set3);
		
	}
}




























