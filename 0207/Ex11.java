import java.util.*;

class Ex11{
    public static void main(String[] args){
     //알바시간 계산 받아서 계산 : 8시간까지 6870원, 초과하면 1.5배
         Scanner scan= new Scanner(System.in);

         chk:
         while(true){
         
         System.out.print("알바시간 : ");
            
         int time = scan.nextInt();
         int dan = 6870 ;
         int pay = 0 ;

         if(time>8){
            pay=(8*dan)+(int)((time-8)*dan*1.5);
         }else{
            pay=time*dan;
         }
         

         while(true){
         System.out.println("당신의 급여는"+pay+"입니다.") ; 
         System.out.println("계속할까요(y/n)?");
         String str=scan.next();
         if(str.equalsIgnoreCase("y")){
           break;
         }else if(str.equalsIgnoreCase("n")){
           break chk;
         }else{
           continue;
         }
         
     }//안while
    }//밖while
   }
}