package com.hb.am;


//�͸� ����Ŭ���� : �̸����� Ŭ����, �ٽ� ȣ�� ����
	//					 �ѹ� ���� �������� ������ Ŭ����
	// 					 ��κ� �������̽��� �߻�޼ҵ忡�� Ȱ��

interface TestInner{
	int data = 100 ;
	public void prnData() ;
}

public class Ex05 implements TestInner {

	@Override
	public void prnData() {
		System.out.println("�������̽� ����1");
		System.out.println(TestInner.data);
	}
	
}

// �͸� ���� Ŭ������ ����ϴ� ���
class Ex05_1{
	// �޼ҵ�ȿ� �������̽� ��ӹ��� Ŭ���� ����
	public void prn(){
		new TestInner() {
			
			@Override
			public void prnData() {
				System.out.println("�������̽� ����2");
				System.out.println(TestInner.data);
				
			}
		};
	}
	// �������̽��� ���ڷ� ������ �ִ� �޼ҵ�
	public void prn2(TestInner ti){
		
	}
}






















