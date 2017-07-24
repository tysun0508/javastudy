package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex02_Input {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("c:/util/objectdata2.txt");
			ois = new ObjectInputStream(fis);
			
			ArrayList<Ex02_VO> list = (ArrayList<Ex02_VO>)ois.readObject();
			
			System.out.println("�̸�\t����\t�ּ�\t����");
			for(Ex02_VO k : list){
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getAddr()+"\t");
				if(k.isGender()){
					System.out.println("����"+"\n");
				}else{
					System.out.println("����"+"\n");
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
