package com.hb.am;

public class Terran extends Unit {
	boolean fly ;
	
	//������
	public Terran() {}
	public Terran(String name, boolean fly) {
		setName(name);
		this.fly = fly ;
		setEnergy(150);
	}
	
	//�θ� ���� �߻�޼ҵ带 ��üȭ �� �޼ҵ�
	@Override
	public void decEnergy() {
		setEnergy(getEnergy()-3) ;
		
	}
}
