package com.hb.am;

// �Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
// ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ����� ���ѱ��.
// �̷��� ��� �ǽð� ó�������� ������ �߻��� ���� �ִ�.
// �̸� �ذ��� ����� ����ȭó���̴�.
// ����ȭ ó���� synchronized ���� ����Ͽ� ���� ���� ���� �����尡 
// Ư���� ������ ���������� �ٸ� ������� ������ ����ؾ� �ȴ�.
public class Ex02 implements Runnable{
	
	int x ;
	
	// �Ӱ迵��
	@Override
	public synchronized void run() {
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName()+ " : " + x);
			++x ;
		}
		
	}
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
	}
}
