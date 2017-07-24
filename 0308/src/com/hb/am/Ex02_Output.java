package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex02_Output {
	public static void main(String[] args) {
		// VO 기준 객체 생성
		Ex02_VO t1 = new Ex02_VO("홍길동", 12, "서울", true);
		Ex02_VO t2 = new Ex02_VO("일지매", 13, "제주", true);
		Ex02_VO t3 = new Ex02_VO("마루치", 14, "율도", true);
		Ex02_VO t4 = new Ex02_VO("아라치", 15, "증도", true);
		Ex02_VO t5 = new Ex02_VO("대원군", 16, "지도", true);
		
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
