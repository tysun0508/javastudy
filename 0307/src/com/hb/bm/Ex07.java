package com.hb.bm;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;

// PrintStream => ��� �ڷ����� ���, 
// PrintWrite => OutputStream�� Writer�� ��� �޾Ƽ� ����� �� �ִ�.
public class Ex07 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		PrintWriter pw = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream("c:/util/ps02.txt");
			bos = new BufferedOutputStream(fos);
			/*ps = new PrintStream(bos);
			ps.println('A');
			ps.println("String");
			ps.println(true);
			ps.flush();*/
			
			// PrintWriter�� OutputStream�� �޾Ƽ� ���
			pw = new PrintWriter(bos);
			pw.write("�ȳ��ϼ���");
			pw.println("�氡 �氡");
			pw.println("Hello~");
			pw.flush();
			
			// PrintWriter�� Writer�� �޾Ƽ� ���
			fw = new FileWriter("c:/util/ps03.txt");
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw);
			pw.println("HELLO");
			pw.println("�����ٰ� �սô�.");
			pw.println();
			pw.println("��§��");
			pw.flush();
		} catch (Exception e) {
		
		} finally {
			try {
				
			} catch (Exception e2) {
			
			}
		}
	}
}
