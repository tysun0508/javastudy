class Ex03
{
	   //�������, ��ȯ�� ����
       public int add(int a, int b){
		     int result = a+b ;
			 return result ;
	   }
       //�������, ��ȯ�� ����
	   public int sub(int a, int b){
	         return a-b ;
	   }

       public void mul(int a, int b){
             System.out.println("��� : " + (a*b)) ;
	   }
       public void div(int a, int b){
             int result = a/b ;
			 System.out.println("��� : " + result) ;
	   }
       // �ΰ��� 10%
	   public static double vat(int a){
             return a+(a*0.1) ;
	   }


}
