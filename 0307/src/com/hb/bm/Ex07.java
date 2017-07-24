package com.hb.bm;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;

// PrintStream => 모든 자료형을 출력, 
// PrintWrite => OutputStream과 Writer를 모두 받아서 사용할 수 있다.
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
			
			// PrintWriter가 OutputStream을 받아서 사용
			pw = new PrintWriter(bos);
			pw.write("안녕하세요");
			pw.println("방가 방가");
			pw.println("Hello~");
			pw.flush();
			
			// PrintWriter가 Writer를 받아서 사용
			fw = new FileWriter("c:/util/ps03.txt");
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw);
			pw.println("HELLO");
			pw.println("쉬었다가 합시다.");
			pw.println();
			pw.println("진짠데");
			pw.flush();
		} catch (Exception e) {
		
		} finally {
			try {
				
			} catch (Exception e2) {
			
			}
		}
	}
}
