class Ex03_main 
{
	public static void main(String[] args) 
	{
		//�ΰ��� �޼ҵ�� static�̹Ƿ� ��ü�������� ȣ�� ����
		//ȣ��� Ŭ����.�޼ҵ� �̸�
		//��ȯ���� �����Ƿ� ��ȯ���� �°� ������ ����� �޾� �ش�.
		double res = Ex03.vat(1000) ;
	    System.out.println("vat : " + res) ;

		// instance �޼ҵ�� Ŭ������ ��ü�� ������ ��밡���ϴ�.
		// �޼ҵ忡�� �����Ǵ� ������ �޼ҵ尡 ������ �������. (��������)
		// �޼ҵ尡 ������� ������ ��������� �ʴ´�. (��������)
		Ex03 test = new Ex03() ;
		// �޼ҵ� ȣ���� �� ����� �Ű������� �ڷ����� ������ ����� �Ѵ�.
		// �ڷ����̳� ������ �ٸ��� �ٸ��޼ҵ�� ����մϴ�.
		int res1 = test.add(10, 20) ;
		System.out.println("add��� : " + res1 ) ;

		res1 = test.add(10, 'a') ;
		System.out.println(res1) ;

		res1 = test.sub(10, 20) ;
		System.out.println("sub��� : " + res1);

		test.mul(10, 20) ;
		test.div(10, 20) ;
	}
}
