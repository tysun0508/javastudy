package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex02_Output {
	public static void main(String[] args) {
		// VO ���� ��ü ����
		Ex02_VO t1 = new Ex02_VO("ȫ�浿", 12, "����", true);
		Ex02_VO t2 = new Ex02_VO("������", 13, "����", true);
		Ex02_VO t3 = new Ex02_VO("����ġ", 14, "����", true);
		Ex02_VO t4 = new Ex02_VO("�ƶ�ġ", 15, "����", true);
		Ex02_VO t5 = new Ex02_VO("�����", 16, "����", true);
		
		ArrayList<Ex02_VO> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("c:/util/objectdata2.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
