package com.hb.am;
class Ex01 
{
	private boolean live = true ;
	private int age = 3 ;
	private String name  = "ū�Լ�" ;
	// get (��������) : ������ �ڷ����� ��ȯ��

	public String getName(){
		return name ; 
	}
	public boolean getLive(){
		return live ;
	}
	public int getAge(){
		return age ;
	}



	// set (�����޾Ƽ� ����)  ��ȯ���� ����.
	public void setName(String a){
		name = a ;
	}
	public void setAge(int a){
		age = a ;
	}
	public void setLive(boolean a){
		live = a ;
	}



}
