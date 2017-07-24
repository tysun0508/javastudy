import java.util.*;

class Ex04{
    public static void main(String[] args){
     //알바시간 계산 받아서 계산 : 8시간까지 6870원, 초과하면 1.5배
         Scanner scan= new Scanner(System.in);

         System.out.print("알바시간 : ");
            
         int time = scan.nextInt();
         int dan = 6870 ;
         int pay = 0 ;

         if(time>8){
            pay=(8*dan)+(int)((time-8)*dan*1.5);
         }else{
            pay=time*dan;
         }
         
         System.out.println("당신의 급여는"+pay+"입니다.") ; 
  
   }
}