package com.hb.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("c:/util/exam02.txt");
			bos = new BufferedOutputStream(fos);
			String msg = "hi!!\r\n123456\r\n�����ٶ�\r\nHello~~";
			bos.write(msg.getBytes());
			bos.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
