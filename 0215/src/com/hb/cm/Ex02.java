package com.hb.cm;

// �������̽��� ��ӹ���

// �Ϲ�Ŭ����
class Ex02 implements Ex01{

	@Override
	public void sub() {
		
	}

	@Override
	public void mul() {
		
	}

}

// �߻�Ŭ���� : Ŭ���� �տ� abstract �ٿ��� �߻� Ŭ������ �����.
abstract class Ex03 implements Ex01{
	public abstract void div() ;
}

// �������̽�
interface Ex04 extends Ex01{
	public void add() ;
}

// Ex04�� ��üȭ�� ���� ���� �� ���� ��� ��üȭ�� �ؾ� �ȴ�.
class Ex05 implements Ex04{

	@Override
	public void sub() {
		
		
	}

	@Override
	public void mul() {
		
		
	}

	@Override
	public void add() {
		
		
	}
	
}
