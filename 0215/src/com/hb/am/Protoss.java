package com.hb.am;

public class Protoss extends Unit {
	boolean fly ;
	
	//������
	public Protoss() {}
	public Protoss(String name, boolean fly) {
		setName(name);
		this.fly = fly ;
		setEnergy(100) ;
	}
	
	//�θ� ���� �߻�޼ҵ带 ��üȭ �� �޼ҵ�
	@Override
	public void decEnergy() {
		setEnergy(getEnergy()-1) ;
		
	}

}
