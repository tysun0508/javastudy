class Ex05{
  
       //�հ� �޼ҵ� (����, ����, ����) ��ȯ�� ����
	   
	   public int sum1(int kor, int eng, int math){
       int sum = kor+eng+math ;
	   return sum ;
	   }

	   //��� �޼ҵ� (�հ�) ��ȯ�� ����

	   public double avg1(int sum){
       double avg = (int)((sum/3.0)*10)/10.0 ;
	   return avg ;
	   }

	   //���� ���ϴ� �޼ҵ� (���) ��ȯ�� ����
	    
	   public String hak1(double avg){
       String hak = "" ;
	   if(avg>=90){
          hak="A ����";
       }else if(avg>=80){
          hak="B ����";
       }else if(avg>=70){
          hak="C ����";
       }else{
          hak="F ����";
       }
	   return hak ;

	   }

	   //����� ����ϴ� �޼ҵ�(�̸�, �հ�, ���, ����)

	   public void print1(String name, int sum, double avg, String hak){
       System.out.println(name+"\t" + sum+"\t" + avg+"\t" + hak) ;
	   
        
       }
}
