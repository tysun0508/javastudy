package com.hb.am;

import java.net.InetAddress;

// InetAddress : IP �ּҸ� ǥ���ϴ� Ŭ����
// �����ڴ� ���������� new �����ڷ� �������� ����
// 5���� static �޼ҵ带 ������ �����Ѵ�.
// localhost => ���� ���� ����ϰ� �ִ� ��ǻ�͸� ����
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("ȣ��Ʈ�̸� : "+ addr.getHostName());
			System.out.println("ȣ��ƮIP : "+ addr.getHostAddress());
			
			InetAddress addr1 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹��̸� : "+ addr1.getHostName());
			System.out.println("���̹�IP : "+ addr1.getHostAddress());
			
			InetAddress[] addr2 = InetAddress.getAllByName("www.daum.net");
			for(InetAddress k : addr2){
				System.out.println("�����̸� : "+ k.getHostName());
				System.out.println("����IP : "+ k.getHostAddress());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
