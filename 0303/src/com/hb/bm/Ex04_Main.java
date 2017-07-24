package com.hb.bm;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex01 test1 = new Ex01();
		Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
		// Thread�� ��ӹ��� Ŭ������ �ٷ� start()�� ������ �� �ִ�.
		// test1.start();
		
		// interface�� ��ӹ��� test1�� Ÿ������ ����
		// start()�� �����ϸ� Ÿ���� test1�� run()�� �����
		Thread t1 = new Thread(test1);
		t1.start();
		
		// �͸� ������
		new Thread(new Ex02()).start();
		new Thread(new Ex03()).start();
		
		// �͸� ����Ŭ���� 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("�ڡڡڡڡڡڡ�");
	
				}
				
			}
		}).start();
		
	}
}
