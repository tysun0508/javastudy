import java.util.*;

class Ex10{
    public static void main(String[] args){
     
      //어떤 수를 받아서 홀수, 짝수 판별하기
        
       Scanner scan=new Scanner(System.in);
      
       chk:
       while(true){
       
       System.out.print("정수입력 :");
        int su= scan.nextInt();
        String result="";
        if(su%2==0){
           result="짝수";
       }else{
           result="홀수";
       }
      System.out.println("당신 입력한"+su+"는"+result+"입니다.");
     
      while(true){
       System.out.println("계속할까요(y/n)?");
       String str=scan.next();
        if(str.equalsIgnoreCase("y")){
          break;
        }else if(str.equalsIgnoreCase("n")){
          break chk;
        
       }
      }
    }
  
   }
}