package com.hb.cm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ��Ʈ�� : �����͸� ���������� ������ϴ� ���                          
// ����Ʈ ��Ʈ�� : 1byte�� �Է�, ����ϴ� ���
// ��� : ����Ʈ�� �̷���� ����, ����, �Ҹ�, �׸�,, �� ��� ���� ����� ����

// �Է� ��Ʈ�� : InputStream => 
//				 FileInputStream : ������ �о�帮�� ��Ʈ��

public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int k = 0 ;
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			
			// read()�� 1byte��(�ѱ���) �о k�� �����.
			//k = fis.read();
			
			// �ƽ�Ű�ڵ尪(����) => ���ڷ� ����
			//System.out.println(k);
			//System.out.println((char)(k));
			
			// ��ü���� �о����
			/*while(true){
				k = fis.read();
				// ���̻� �������� ������ -1�� ���´�.
				if(k==-1) break;
				System.out.println(k);
			}*/
			
			// -1�� �ƴҶ� ����, -1������ �������� ����
			while((k=fis.read())!= -1){
				System.out.println((char)k);
			}
			
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
