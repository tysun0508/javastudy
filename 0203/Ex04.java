class Ex04{
      public static void main(String [] args){
      // 다중 if문
      //  if(조건식 1){
      //  조건1이 참이면 실행하는 문장
      //  }else if(조건식2){
      //   조건1은 거짓이면서 조건2가 참인 문장
      //    }else if(조건식3){
      //   조건1, 조건2가 거짓이면서 조건3이 참인 문자
      //   }else{
      //    조건1, 조건2, 조건3이묘두 거짓인, 나머지 
      //   }

      //  평균이 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점 나머지는 F학점
        double avg = 74.5 ;
        String res = "";
        if(avg >= 90){
          res = "A 학점" ;      

         }else if(avg >= 80) {
           res = "B 학점" ;

       }else if(avg >= 70) {
             res = "C 학점" ;
       
        }else{
          res = "F 학점" ;
       }
       
        System.out.println(res) ;        

      // char ch가 A, a이면 아프리카, B,b이면 브라질 C, c 이면 캐나다 나머지는 한국
       char ch = 'd' ;
      if(ch == 'A' || ch == 'a'){

       }else if(ch == 'A' || ch == 'a'){
            res = "아프리카" ;
       }else if(ch == 'B' || ch == 'b'){
            res = "브라질" ;
       }else if(ch == 'C' || ch == 'c'){
            res = "캐나다" ;
       }else{
           res = "한국" ;  
          }
        System.out.println(res) ;     

      // 메뉴 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
      // 4이면 과일쥬스 3500이다.
      // 지불한 돈은 10000이다.
      // 친구와 2잔 먹었다. 잔돈은 얼마를 받아야 하나(부가세)10%
  }
}