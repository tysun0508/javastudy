package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 객체직렬화 : 객체가 가지고 있는 내용을 파일로 저장하는데
// 				직렬로 만들어서 저장됨(알아 볼수 없다).
public class Ex01_Output {
	public static void main(String[] args) {
		// vo기준으로 객체 생성
		Ex01_vo t1 = new Ex01_vo("희동이", 8, "하우스", true);
		Ex01_vo t2 = new Ex01_vo("길동이", 48, "하우스", true);
		Ex01_vo t3 = new Ex01_vo("도우너", 158, "우주", true);
		Ex01_vo t4 = new Ex01_vo("해적", 1004, "우주", true);
		Ex01_vo t5 = new Ex01_vo("둘리맘", 1583, "쥬라기", true);
		
		// 만들어진 객체를 모으자(컬렉션)
		ArrayList<Ex01_vo> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		// 모은 객체들을 직렬화 하자 => file로 만드는 것
		// 객체 직렬화는 (objectOutputStream.writeObject())
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:/util/objectdata.txt");
			oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화
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






























