package com.hb.am;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream�� DataOutputStream
// �⺻�ڷ����� �����͸� �ְ� ���� �� ���
// �ݵ�� �Է¼����� ��¼����� ���ƾ� �Ѵ�.(�ٸ��� ���ڱ���)
public class Ex04 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream("c:/util/data01.txt");
			dos = new DataOutputStream(fos);
			
			// ��� => wtiteXXX, XXX => �⺻�ڷ���(byte,long, int, boolean, double)
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeChar('A');
			dos.writeBoolean(true);
			dos.flush();
			
			fis = new FileInputStream("c:/util/data01.txt");
			dis = new DataInputStream(fis);
			// �Է� => readXXX
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			
		} catch (Exception e) {
		
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
			
			}
		}
	}
}
