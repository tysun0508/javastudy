class Ex06{
    public static void main(String[] args){
       // while 문 : for문과 같은 반복문

       // 초기식;
       // while(조건식){
       // 조건식이 참이면 실행
       // 증감식;
       // }
        
       // 초기식;
       // while(true){
       //  if(끝낼조건) break;
       //  실행문장
       //  if(끝낼조건) break;
       //  증감식;
       // }
      
       // 0-10 까지 출력
       int i = 0 ;
       while(i < 11){
         System.out.println(i);
         i++;
       }
     System.out.println();
       // 0-10까지 짝수 출력하기
       int j = 0 ;
       while(j<11){
          System.out.print(j+"  ");
          j = j+2 ;
        }
     System.out.println();
     int k = 0 ;
     while(k<11){
      if(k%2==0){
        System.out.print(k+"  ");
       }
      k++;
     }
    System.out.println();

    //5 단 출력하기
    int su1 = 1 ;
    while(su1 <10){
         System.out.println("5*"+su1+"="+(5*su1));
     su1 ++;
    }     


    // a-z까지 출력하기
   char ch='a';
   while(ch <= 'z'){
     System.out.print(ch +"  ");
    ch++;
   }
  System.out.println();
 }
}
