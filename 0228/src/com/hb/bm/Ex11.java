package com.hb.bm;

interface Ex11 {
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
}
// �������̽��� ��ӹ��� Ŭ���� => ��Ϳ� �ش�
// �����ʸ� ��ӹ޾Ƽ� �� �޼ҵ�� ����
class Ex12 implements Ex11{

	@Override
	public void add(int a, int b) {}

	@Override
	public void sub(int a, int b) {}

	@Override
	public void mul(int a, int b) {}

	@Override
	public void div(int a, int b) {}
	
}

class Ex13 extends Ex12{
	@Override
	public void add(int a, int b) {			
	}
	@Override
	public void mul(int a, int b) {	
	}
}