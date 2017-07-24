import java.util.*;

class Ex03{
    public static void main(String[] args){
     
      //어떤 수를 받아서 홀수, 짝수 판별하기

        Scanner scan=new Scanner(System.in);

        System.out.print("정수입력 :");
        int su= scan.nextInt();
        String result="";
        if(su%2==0){
           result="짝수";
       }else{
           result="홀수";
       }
      System.out.println("당신 입력한"+su+"는"+result+"입니다.");

  
   }
}