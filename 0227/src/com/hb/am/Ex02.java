package com.hb.am;


// ����Ŭ���� : Ŭ���� �ȿ� Ŭ������ ���ǵǾ� �ִ� Ŭ����
// 				�ܺ�Ŭ������ ������ �� ����Ŭ������ ������ �� �ִ�.(static ����)
//				�ܺ�Ŭ������ ������� ������� ��밡��(private��)
//				�������� �� $�� �ٴ´�.
// 		���� : Member, Local, Static, Anonymous
// 1. Member : �ܺ�Ŭ����{..����Ŭ����..}
public class Ex02 {
	int su1 = 10 ;
	final int su2 = 20 ;
	static int su3 = 30 ;
	static final int su4 = 40 ;
	private int su5 = 50 ;

	public Ex02() {
		System.out.println("����� �ܺ�Ŭ���� : " + this);
	}
	// �Ϲݸ޼ҵ�
	public void prn(){
		int num1 = 100 ;
		final int num2 = 200 ;
		
		//���������� static ���Ұ�
		//static int num3 = 300 ;
		//static final int num4 = 400 ;
		
		//private�� �ȵ�
		//private int num5 = 500 ;
		System.out.println("����� �ܺθ޼ҵ�");
	}
	
	// ���� Ŭ����
	class Ex02_1{
		int s1 = 10 ;
		final int s2 = 20 ;
		// ����Ŭ������ static ������.
		// ����� ��� Ŭ�������� static�� �ٿ��� �Ѵ�.
		//static int s3 = 30 ;
		static final int s4 = 40 ;
		private int s5 = 50 ;
		
		// ������
		public Ex02_1() {
			System.out.println("����Ŭ���� ������ : " + this);
			
		}
		// ����Ŭ���� �޼ҵ�
		public void in_prn(){
			int number1 = 10 ;
			final int number2 = 20 ;
			//static int number3 = 30 ;
			//static final int number4 = 40 ;
			//private int number5 = 50 ;
			
			// �ܺ�Ŭ���� ������
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su5);
			// �ܺ�Ŭ���� �޼ҵ�
			prn() ;
		}
		
	}
	

}

