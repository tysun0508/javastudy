package com.hb.am;

public class Ex01_Main {
	public static void main(String[] args) {
		System.out.println("���� ���� : " + Thread.currentThread().getName());
		Ex01 test = new Ex01();
		test.start();
		// join() : ���� ������� join()�� ȣ���� �����尡 ���������� 
		//			������ �����¿� ������. join()�� ȣ���� �����尡 
		//			������ �ٽ� ���� �� �� �ִ�.
		try {
			test.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("���� �� : " + Thread.currentThread().getName());
	}
}
