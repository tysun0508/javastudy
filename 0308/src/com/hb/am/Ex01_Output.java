package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ��ü����ȭ : ��ü�� ������ �ִ� ������ ���Ϸ� �����ϴµ�
// 				���ķ� ���� �����(�˾� ���� ����).
public class Ex01_Output {
	public static void main(String[] args) {
		// vo�������� ��ü ����
		Ex01_vo t1 = new Ex01_vo("����", 8, "�Ͽ콺", true);
		Ex01_vo t2 = new Ex01_vo("�浿��", 48, "�Ͽ콺", true);
		Ex01_vo t3 = new Ex01_vo("�����", 158, "����", true);
		Ex01_vo t4 = new Ex01_vo("����", 1004, "����", true);
		Ex01_vo t5 = new Ex01_vo("�Ѹ���", 1583, "����", true);
		
		// ������� ��ü�� ������(�÷���)
		ArrayList<Ex01_vo> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		// ���� ��ü���� ����ȭ ���� => file�� ����� ��
		// ��ü ����ȭ�� (objectOutputStream.writeObject())
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:/util/objectdata.txt");
			oos = new ObjectOutputStream(fos);
			
			// ��ü ����ȭ
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}	finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}






























