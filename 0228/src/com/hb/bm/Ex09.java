package com.hb.bm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("���ѹα�", "����");
		map.put("�ѱ�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");
		map.put("ȣ��", "ĵ����");
		
		Set<String> keys = map.keySet();
		
		chk:
		while(true){
			System.out.print("���� �Է� >> ");
			String str = scan.next();
			if(keys.contains(str)){
				String res = map.get(str);
				System.out.println(str+"�� ������ "+res+" �Դϴ�.");
			}else{
				System.out.println("�����Ϳ� ���� ���� �Դϴ�.");
			}
			
			while(true){
				System.out.print("����ұ��?(y/n)");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")){
					continue chk ; // break;
				}else if(msg.equalsIgnoreCase("n")){
					break chk;
				}else{
					continue;
				}
			}
		}
		System.out.println("����");
	}
}
