class Ex02_1
{
     
	   // ����ʵ� : ������ ���
	     int su1 = 10 ;                  //����, instance
		 static int su2 = 20 ;          //����, static
		 static final int SU3 = 30 ;  //���, static
		 final int SU4 = 40 ;          //���, instance (������ ����� ���� ��)

	   public void prn(){
             System.out.println("�޼ҵ� ����");
			su1 = su1 = 10 ;
			su2 = su2 = 10 ;
		 //SU3 = SU3 = 10 ;  //�����߻�
		 //SU4 = SU4 = 10 ;  //�����߻�
			 System.out.println(su1);
			 System.out.println(su2);
             System.out.println("�޼ҵ� ��");
		}

        public String prn2(){
		      System.out.println("�޼ҵ����");
			  String msg="���� ����" ;
			  System.out.println("�޼ҵ峡");
			  
			  return msg ;
		}

}




