package com.hb.bm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map<k,v> : key �� value�� 1:1 ��Ī
// key�� ȣ���ϸ� value�� ���´�.
// key�� value  => not null,
// key�� �ߺ���� ����, 
// �߰��� add ��� ����, �ݵ�� put�� ���
// �� ȣ�� get(index) => index�� Ű�� ����
// ���� key�� Set�� ���� => keySet()
public class Ex08 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		// �߰�
		map.put(0, "�ѱ�");
		map.put(1, "����");
		map.put(2, "�߱�");
		map.put(3, "�̱�");
		map.put(4, "�±�");
		map.put(3, "��ȭ��"); // key�� �ߺ� �������� ����
		map.put(5, "�±�"); // value �ߺ��� ��� ����.
		// �ϳ��� ȣ���� ����
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(":::::::::::::::");
		// ���� for�� ��� ����
		// for(Integer k : map){	}
		// Ű���� ���ڶ�� ���� �̿��ؼ� for�� ��밡��
		for(int i=0 ; i < map.size(); i++){
			System.out.println(map.get(i));
		}
		System.out.println(":::::::::::::::");
		Map<String, String> map2 = new HashMap<>();
		map2.put("�̸�", "ȫ�浿");
		map2.put("����", "14");
		map2.put("�ּ�", "����");
		map2.put("����", "����");
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		
		// map2�� key�� Set���� ���� => keySet()
		 for( String k: map2.keySet()){
			 System.out.println(map2.get(k));
		 }
		 System.out.println(":::::::::::::::::::");
		 Iterator<String> it = map2.keySet().iterator();
		 while(it.hasNext()){
			String msg =  it.next();
			System.out.println(map2.get(msg));
		 }
	}
}
