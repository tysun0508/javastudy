class Test04{
     public static void main(String[] args){
	// �Է°�
        int su = 3781;
       
       // ó�� 
       int c, b, s, i ; //õ, ��, ��, ���� ���� ����
       int r ; // ������
	
       c = su / 1000 ;  // 3
       r = su % 1000 ;  // 781
 
       b = r / 100 ; // 7
       r = r % 100 ; // 81

       s = r / 10 ; // 8
       i = r % 10 ; // 1

       System.out.println("õ�� �ڸ� : " + c);
       System.out.println("���� �ڸ� : " + b);
       System.out.println("���� �ڸ� : " + s);
       System.out.println("���� �ڸ� : " + i);
       
    }
}
