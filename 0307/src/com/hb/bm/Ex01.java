package com.hb.bm;

import java.io.FileReader;

// FileInputStream => 1byte, read() => �ƽ�Ű�ڵ�(int), read(byte[] b)
// FileReader => 2byte, read() => �����ڵ�(int), read(char[] c)
public class Ex01 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		int k = 0;
		try {
			fr = new FileReader("c:/util/test01.txt");
			/*k = fr.read();
			System.out.println(k);
			System.out.println((char)k);*/
			while((k=fr.read()) != -1){
				System.out.println((char)k);
			}
		} catch (Exception e) {
		
		} finally {
			try {
				
			} catch (Exception e2) {
			
			}
		}
	}
}
