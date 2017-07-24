class Ex05{
  
       //합계 메소드 (국어, 영어, 수학) 반환형 존재
	   
	   public int sum1(int kor, int eng, int math){
       int sum = kor+eng+math ;
	   return sum ;
	   }

	   //평균 메소드 (합계) 반환형 존재

	   public double avg1(int sum){
       double avg = (int)((sum/3.0)*10)/10.0 ;
	   return avg ;
	   }

	   //학점 구하는 메소드 (평균) 반환형 존재
	    
	   public String hak1(double avg){
       String hak = "" ;
	   if(avg>=90){
          hak="A 학점";
       }else if(avg>=80){
          hak="B 학점";
       }else if(avg>=70){
          hak="C 학점";
       }else{
          hak="F 학점";
       }
	   return hak ;

	   }

	   //결과를 출력하는 메소드(이름, 합계, 평균, 학점)

	   public void print1(String name, int sum, double avg, String hak){
       System.out.println(name+"\t" + sum+"\t" + avg+"\t" + hak) ;
	   
        
       }
}
