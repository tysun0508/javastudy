package com.hb.am;
class Ex01Test
{
	public static void main(String[] args) 
	{
		//��ü����
		Ex01 test = new Ex01() ;	
		// �̸�, ����, ���翩�� ���
		String name = test.getName() ;
		int age = test.getAge() ;
		boolean live = test.getLive() ;

		System.out.println("�̸� : " + name) ;
		System.out.println("����: " + age) ;
		System.out.println("���翩��:" + live) ;
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::") ;
		// �̸� => ���, ���� => 2�� ����
		test.setName("���") ;
		test.setAge(2) ;

		name = test.getName() ;
		age = test.getAge() ;

		System.out.println("�̸� : " +name) ;
		System.out.println("���� : " +age);


	}
}
