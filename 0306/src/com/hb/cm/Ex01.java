package com.hb.cm;

import java.io.File;

// File Ŭ���� : Ư����ġ�� �����ϴ� �����̳� ���丮�� ó���ϴ� Ŭ����
public class Ex01 {
	public static void main(String[] args) {
		String pathName = "c:/util";
		File file = new File(pathName);
		
		// list()�� �̿��Ͽ�, �ش� ��ġ�� ��� ������ �迭�� �ֱ�
		String[] list = file.list();
		for(String k : list){
			//System.out.println(k);
			File file2 = new File(pathName, k);
			if(file2.isDirectory()){
				System.out.println("���丮 : "+ k);
			}else{
				System.out.println("���� : " + k+", "+k.length()/1024+"KB");
			}
		}
	}
}
