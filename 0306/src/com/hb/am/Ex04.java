package com.hb.am;

// wait(), notify()�� ����ȭ ���϶��� ����
// ����ȭ ���϶� ������ ���߰� �ϴ� �� : wait(),
// wait()�� �����带 notify()�� ���� ������ ���̻� �������� �ʴ´�
public class Ex04 implements Runnable {
	int x;
	@Override
	public synchronized void run() {
		for(int i = 0; i<100; i++){
			++x ;
			System.out.println(Thread.currentThread().getName()+ ":" +x);
			if(x==50 || x==100 || x==150){
				try {
					// ���� ������� �����·� ������.(wait())
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}else{
				// �����¿� ���� �����带 �غ���·� �����.
				notify();
			}
		}
		
	}

}
