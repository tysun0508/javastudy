package com.hb.em;

// final : ����(��), Ȯ��Ұ�, ����Ұ�
// final Ŭ���� : ��ӺҰ�(�ڽ�Ŭ���� ���� ����)
// final �޼ҵ� : ��Ӱ��迡�� �������̵� �Ұ�, �ش� �޼ҵ� ���� ����Ұ�
// final ���� : ������ ���ȭ(������ ���� �Ұ�)

//�θ� Ŭ����
public class Ex01 {
	int su1 = 10 ;
	static int su2 = 20 ;
	final int su3 = 30 ;
	static final int su4 = 40 ;
	
	public void prn(){
		System.out.println("�θ� prn()");
		su1 = su1 + 2 ;
		su2 = su2 + 2 ;
		//su3 = su3 + 2 ;  //����� �������� �ȵ�
		//su4 = su4 + 2 ;  //����� �������� �ȵ�
	}
	
	public static void prn2(){
		// static �޼ҵ�� static ������ ��밡��
		// ���������� ����� �� �ִ�.
		int k = 10 ;
		System.out.println("�θ� static prn2()");
			//System.out.println(su1);
			System.out.println(su2);
			//System.out.println(su3);
			System.out.println(su4);
			
			System.out.println(k); //��������
	}
	
	public final void prn3(){
		System.out.println("�θ� prn3()");
		su1 = su1 + 2 ;
		su2 = su2 + 2 ;
	}
	
}
