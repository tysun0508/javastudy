package com.hb.am;
class Ex03Test
{
	public static void main(String[] args) 
	{
		//��ü����
		Ex03 test = new Ex03("�Ӳ���") ; //������ ȣ��
	
		//��������� Ȯ�� 
		String name = test.getName() ;
		int age = test.getAge() ;
		String addr = test.getAddr() ;

		System.out.println(name) ;
		System.out.println(age) ;
		System.out.println(addr) ;
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::") ;
		
		Ex03 test2 = new Ex03("�Ѹ�", 1000) ;
		name = test2.getName() ;
		age = test2.getAge() ;
		addr = test2.getAddr() ;

		System.out.println(name) ;
		System.out.println(age) ;
		System.out.println(addr) ;
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::") ;

		Ex03 test3 = new Ex03(1970, "�±Ǻ���", "���ǵ�") ;
		name = test3.getName() ;
		age = test3.getAge() ;
		addr = test3.getAddr() ;

		System.out.println(name) ;
		System.out.println(age) ;
		System.out.println(addr) ;
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::") ;



	}
}
