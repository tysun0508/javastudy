class Ex05_2{
      
	  int sum = 0 ;
	  double avg = 0.0 ;
	  String res = "" ;
	   
	   
	   //�հ� �޼ҵ� (����, ����, ����) ��ȯ�� x
	   
	   public void sum1(int kor, int eng, int math){
       sum = kor+eng+math ;
	     avg1(sum) ;
	   }

	   //��� �޼ҵ� (�հ�) ��ȯ�� x

	   public void avg1(int sum){
       avg = (int)((sum/3.0)*10)/10.0 ;
	    hak1(avg) ;
	   }

	   //���� ���ϴ� �޼ҵ� (���) ��ȯ�� x
	    
	   public void hak1(double avg){
       
	   if(avg>=90){
          res="A ����";
       }else if(avg>=80){
          res="B ����";
       }else if(avg>=70){
          res="C ����";
       }else{
          res="F ����";
       }
	   

	   }

	   //����� ����ϴ� �޼ҵ�(�̸�, �հ�, ���, ����)

	   public void print1(String name, int sum, double avg, String hak){
       System.out.println(name+"\t" + sum+"\t" + avg+"\t" + hak) ;
	   }

}
