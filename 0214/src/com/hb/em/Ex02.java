package com.hb.em;


//�ڽ� Ŭ����
public class Ex02 extends Ex01 {
		
	@Override
	public void prn() {
			System.out.println("�ڽ� prn()");
			
	}
	
	//static �޼ҵ��  �θ�Ŭ������ �����͵� �������̵��̶�� ����
	public static void prn2(){
		// static �޼ҵ�� static ������ ��밡��
		// ���������� ����� �� �ִ�.
		int k = 10 ;
		System.out.println("�ڽ� static prn2()");
			//System.out.println(su1);
			System.out.println(su2);
			//System.out.println(su3);
			System.out.println(su4);
			
			System.out.println(k); //��������
	}
	
	//�θ�Ŭ������ prn3() �޼ҵ尡 final�̹Ƿ� �������̵� ����
		/*public final void prn3(){
		System.out.println("�θ� prn3()");
		}*/
}

