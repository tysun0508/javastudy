import java.util.* ;

class Ex05_main

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		Ex05 test = new Ex05() ;
		Ex05_2 test2 = new Ex05_2() ;
		
		//�̸�, ����, ����, ���� �ޱ�
		System.out.print("�̸� : ") ;
		String name = scan.next() ;
		System.out.print("���� : ") ;
		int kor = scan.nextInt() ;
		System.out.print("���� : ") ;
		int eng = scan.nextInt() ;
		System.out.print("���� : ") ;
		int math = scan.nextInt() ;

		//�հ豸�ϴ� �޼ҵ� ȣ��
		int sum = test.sum1(kor, eng, math) ;

		//��ձ��ϴ� �޼ҵ� ȣ��
		double avg = test.avg1(sum) ;

		//�������ϴ� �޼ҵ� ȣ��
        String hak = test.hak1(avg) ;

		//����ϴ� �޼ҵ� ȣ��
		test.print1(name, sum, avg, hak) ;
		System.out.println(":::::::::::::::::::::::::");
         test2.sum1(kor, eng, math);
		 test2.print1(name, sum, avg, hak);
	}
}
