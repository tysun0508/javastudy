package com.hb.pm;

//�ڽ�Ŭ����
public class Ex02 extends Ex01 {		
	String name ="����ġ";
	public Ex02(){
	//��Ӱ��谡 �Ǵ� ���� �ڽ�Ŭ������ ������ ù �ٿ���
	//�θ�Ŭ������ �����ڰ� �����ִ�. (super()) ;
		super("�Ѹ�") ;
		System.out.println("�ڽ�Ŭ���� �⺻������ : " +this);
	}
	
	public void namePrn(){
		String name = "�±Ǻ���" ;
		System.out.println("�̸� : "+name);
		//�켱���� : ��������>��������
	}
	public void addrPrn(){
		System.out.println("���� : " + age);
		// ��Ӱ����̾ private�� ���� �Ұ���	
		//System.out.println("�ּ� : "+ addr);
		
		
	}		

}
