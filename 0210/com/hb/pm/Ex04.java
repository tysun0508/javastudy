package com.hb.pm;

public class Ex04 {
		// static : ��ü������ ������� ���� ������, ������ ���� ���� => ����
		//          ������ static �޸𸮿� �������
		//			���������� Ŭ�������� ������ �� ����. (����)����Ŭ�������� ����)
		//			static �޼ҵ�� �Ϲݺ����� ������ �� ����.
	
	
		int a = 0 ;
		static int b = 0 ;
		public Ex04() {
			a++;
			b++;
		
		}
		public void sum(int k1, int k2){
			System.out.println("��� : "+(k1+k2));
			double PI = 3.14 ;
			//���������� static ���Ұ�
			//double static PI2=3.14 ; //����
		}
		
		public static void sub(int k){
			//������� ��� ���� �Ұ�
			//int res = k-a ;
			int res = k-b ;
		}
		
		

}
