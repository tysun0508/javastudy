package com.hb.bm;

import java.io.FileWriter;

// FileOutputStream : 1byte, write(�ƽ�Ű�ڵ�), write(byte[] b)
// FileWriter : 2byte, write(String s)
public class Ex02 {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/util/fw.txt");
			String str = "�ȳ��ϼ���\r\n�����غ�� �� �ǰ� �ֳ���?";
			fw.write(str);
			fw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
