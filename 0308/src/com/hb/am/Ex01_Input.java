package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ������ȭ 
public class Ex01_Input {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("c:/util/objectdata.txt");
			ois = new ObjectInputStream(fis);			
			
			// �������� �ϸ� object�� ����
			// object�� ���� ��ü��
			// ����ȭ �Ҷ� ����� list�� �״�� ����ȯ
			
			ArrayList<Ex01_vo> list = (ArrayList<Ex01_vo>)ois.readObject();
			
			System.out.println("�̸�\t ����\t�ּ�\t ����");
			for(Ex01_vo k : list){
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getAddr()+"\t");
				if(k.isGender()){
					System.out.println("����");
				}else{
					System.out.println("����");
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
