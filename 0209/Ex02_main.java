class Ex02_main
{
	public static void main(String[] args) 
	{
		//��ü ���������� static ȣ�� ���� instance�� ȣ�� �� �� ����.
		//static ȣ���� ; Ŭ���� �̸�.�����̸�, Ŭ�����̸�.�޼ҵ��̸� ;
		  System.out.println(Ex02_1.su2);   //static�� ��ü�� �������� �ʾƵ� ȣ�Ⱑ��
		  System.out.println(Ex02_1.SU3);  //static�� ��ü�� �������� �ʾƵ� ȣ�Ⱑ��
		//System.out.println(Ex02_1.SU4);  //static�� �ƴ϶� ȣ���� �� ����.
		  

		//Ŭ������ ��ü ��������
		//Ŭ�����̸� �������� = new ������ ;
		//�ش� Ŭ������ �����ڸ� �������� �ʾ����� �⺻�����ڸ� �̿��ؾߵȴ�.
		//�⺻������ = Ŭ�����̸�() ;
		//Ex02_1 Ŭ���� ��ü ��������.
		Ex02_1 test = new Ex02_1();
		
		int res = test.su1 ;
		int res2= test.su2 ;
		System.out.println(res);
        System.out.println(res2);
		System.out.println(test.SU3);
		System.out.println(test.SU4);
		
		System.out.println("�޼ҵ� ȣ����");
		test.prn();
		String msg = test.prn2();
		System.out.println(msg);
		System.out.println("�޼ҵ� ȣ����");
	}
}
