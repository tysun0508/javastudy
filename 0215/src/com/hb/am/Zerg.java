package com.hb.am;

public class Zerg extends Unit {
	boolean fly ;
	
	//������
	public Zerg() {}
	public Zerg(String name, boolean fly) {
		setName(name);
		this.fly = fly ;
		setEnergy(300);
	}
	
	//�θ� ���� �߻�޼ҵ带 ��üȭ �� �޼ҵ�
	@Override
	public void decEnergy() {
		setEnergy(getEnergy()-5) ;
		
	}
}
