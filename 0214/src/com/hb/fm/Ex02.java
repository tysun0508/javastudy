package com.hb.fm;

	//�߻�Ŭ������ ��ӹ����� �ڽ�Ŭ������ �ΰ����� ��������.
	//	1. �Ϲ�Ŭ���� : �θ� ������ �߻�޼ҵ带 �������̵��ؼ� �ݵ�� ��üȭ �ض�
	//	2. �߻�Ŭ���� : �������̵��� ���������� �ڵ����� �߻�Ŭ������ �ȴ�.

	//�Ϲ�Ŭ����
class  Ex02 extends Ex01{

		@Override
		public void prn3() {
				
		}
}
	//�߻�Ŭ����
	abstract class Ex03 extends Ex01{
	
	}
	//��ӹް� �� �߻� �޼ҵ带 ������
	abstract class Ex04 extends Ex03{
		public abstract void prn4() ;
	}
	
	class Ex05 extends Ex04{

		@Override
		public void prn4() {
				
		}

		@Override
		public void prn3() {
						
		}
		
	}
	
	
	
	
