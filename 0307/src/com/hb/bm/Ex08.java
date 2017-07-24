package com.hb.bm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

// InputStreamReader : ����Ʈ��Ʈ���� ���ڽ�Ʈ������ ����
// 					   InputStream => Reader
// �Ϲ����� ��ġ���� ����Ʈ�Է½�Ʈ���� ����ϴµ�
// ���� ����� ��� �ϴ� �Ϳ� ���� ���� ������ �Ѵ�.
// ��� => BufferedReader(InputStreamReader) => ���
public class Ex08 {
	public static void main(String[] args) {
		System.out.print("���ϴ� ���� : ");
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		PrintStream ps = null;
		PrintWriter pw = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			ps = new PrintStream(System.out);
			ps.println("���� ����(PrintStream) : " + msg);
			ps.flush();
			
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			pw = new PrintWriter(bw);
			pw.println("���� ����(PrintWriter)" + msg);
			pw.flush();
			
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				
			} catch (Exception e2) {
				
			}
		}
	}
}
