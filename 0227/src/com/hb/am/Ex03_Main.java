package com.hb.am;

public class Ex03_Main {
	public static void main(String[] args) {
		// ����Ŭ������ ȥ�ڼ� ��ü ���� �ȵ�
		// Ex03_1 test = new Ex03_1() ;
		
		// Member ó�� �ܺ�Ŭ������ ���ؼ� ��ü ���� �ȵ�
		// Ex03.Ex03_1 test = new Ex03().new Ex03_1() ;
		
		// �ܺ�Ŭ���� ����
		Ex03 test = new Ex03() ;
		// Ex03.Ex03_1 = test.new Ex03_1() ;
		// ����Ŭ������ ���� �ܺ�Ŭ���� �޼ҵ带 ������ ��
		// ����Ŭ���� ������ ������ �ܺ�Ŭ���� ������ ���� ���̿��� Local ����Ŭ������ �����ؾ� �ȴ�.
		
		test.prn2();
	}
}
