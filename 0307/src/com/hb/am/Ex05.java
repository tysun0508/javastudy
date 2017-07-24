package com.hb.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream�� ��� �ڷ����� ����� �� �ִ�.
// ȥ�ڼ� ��� ����
// ü�� ������ε� ��밡��
public class Ex05 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream("c:/util/ps.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.println('a');
			ps.println("Hello");
			ps.println(false);
			ps.println(3.14);
			ps.println(10000);
			ps.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			
			}
		}
	}
}
