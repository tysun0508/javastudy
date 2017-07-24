package com.hb.cm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ��Ʈ�� : �����͸� ���������� ������ϴ� ���                          
// ����Ʈ ��Ʈ�� : 1byte�� �Է�, ����ϴ� ���
// ��� : ����Ʈ�� �̷���� ����, ����, �Ҹ�, �׸�,, �� ��� ���� ����� ����

// �Է� ��Ʈ�� : InputStream => 
//				 FileInputStream : ������ �д� ��Ʈ��

public class Ex04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		// �����ڸ� �б����� �迭ó��
		// ���� : �迭ũ�⸸ŭ�� ���� �� �ִ� ����� x
		byte[] b = new byte[1024];
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			
			fis.read(b);
			//System.out.println(b); ��ġ���� ���´�.
			// �迭�̶� for�� ���
			// �ϳ��� ����ϱ� ������ �ѱ�, Ư������ ������.
			/*for(byte k : b){
				System.out.println((char)k);
			}*/
			String msg = new String(b).trim();
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (Exception e) {
				
			}
		}
	}
}
