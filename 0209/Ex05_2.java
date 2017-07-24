class Ex05_2{
      
	  int sum = 0 ;
	  double avg = 0.0 ;
	  String res = "" ;
	   
	   
	   //합계 메소드 (국어, 영어, 수학) 반환형 x
	   
	   public void sum1(int kor, int eng, int math){
       sum = kor+eng+math ;
	     avg1(sum) ;
	   }

	   //평균 메소드 (합계) 반환형 x

	   public void avg1(int sum){
       avg = (int)((sum/3.0)*10)/10.0 ;
	    hak1(avg) ;
	   }

	   //학점 구하는 메소드 (평균) 반환형 x
	    
	   public void hak1(double avg){
       
	   if(avg>=90){
          res="A 학점";
       }else if(avg>=80){
          res="B 학점";
       }else if(avg>=70){
          res="C 학점";
       }else{
          res="F 학점";
       }
	   

	   }

	   //결과를 출력하는 메소드(이름, 합계, 평균, 학점)

	   public void print1(String name, int sum, double avg, String hak){
       System.out.println(name+"\t" + sum+"\t" + avg+"\t" + hak) ;
	   }

}
