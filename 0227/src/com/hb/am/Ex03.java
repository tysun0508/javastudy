package com.hb.am;

// 2. Local ���� Ŭ���� : �ܺ�Ŭ���� �޼ҵ� �ȿ� ����Ŭ������ ����
//						  �ܺ�Ŭ������ ��������ó�� ���ȴ�.
//				   Ư¡ : �ܺ�Ŭ������ �޼ҵ尡 ����ɶ� ����Ŭ������ �����ȴ�.
//				   ���� : �ܺ�Ŭ����{�����..., �޼ҵ�(){����Ŭ����{} }
public class Ex03 {
	int su1 = 100 ;
	public Ex03() {
		System.out.println("�ܺ�Ŭ���� ������ : " + this);
	}
	public void prn(){
		int s = 10 ;
		System.out.println("�ܺ�Ŭ���� �żҵ�");
		System.out.println(su1 + s);	
	}
	public void prn2(){
		int num1 = 1000 ;
		int num2 = 2000 ;
		
		// Local����Ŭ���� ������ static ��� �Ұ�
		class Ex03_1{
			int number1 = 1 ;
		//	static int number2 = 2 ;
			static final int number3 = 3 ;
			final int number4 = 4 ;
			
			public void in_prn(){
				//�ܺ�Ŭ��������, �޼ҵ� ��밡��
				System.out.println(su1);
				//�ٸ� �޼ҵ��� ���������� ���Ұ�
				//System.out.println(su1 + s);
				prn();
			}// ���θ޼ҵ� ��
			
		}// ����Ŭ���� ��
		Ex03_1 t = new Ex03_1() ;
		System.out.println("::����Ŭ���� ����::");
		System.out.println(t.number1);
		System.out.println(t.number3);
		System.out.println(t.number4);
		System.out.println("����Ŭ������ �޼ҵ�");
		t.in_prn();
		
		System.out.println("�ܺ�Ŭ������ ����");
		System.out.println(su1);
		System.out.println("�ܺ�Ŭ������ �޼ҵ�");
		prn() ;
		// �ٸ� ������ ���� ��� �Ұ�
		//System.out.println(prn.s);
		// �Ҽӵ� ������ ������ ��� ����
		System.out.println(num1);
		
	}// �ܺ� �޼ҵ� ��
}// �ܺ� Ŭ���� ��
