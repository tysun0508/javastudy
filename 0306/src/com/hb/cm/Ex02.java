package com.hb.cm;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String path = "c:\\util\\test01.txt";
		File file = new File(path);
		try {
			boolean res = file.createNewFile();
			if(res){
				System.out.println("���ϻ��� ����");
			}else{
				// ���ϸ��� ������ ����
				System.out.println("������ ���ϸ��� �����մϴ� ���ϻ��� ����");

			}
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("������ : " + file.getAbsolutePath());
			System.out.println("����� : " + file.getPath());
			System.out.println("����ȭ��� : " + file.getCanonicalPath());
			System.out.println("�����̸� : " + file.getName());
			System.out.println("���� ���丮 : " + file.getParent());
			
			res = file.delete();
			if(res){
				System.out.println("��������");
			}else{
				System.out.println("��������");
			}
			File file2 = new File("c:/util/exam");
			file2.mkdirs();
			file2.delete();
			
			
			
		} catch (Exception e) {
			System.out.println("��ΰ� Ʋ���ϴ� ���ϻ��� ����");

		}
	}
}
