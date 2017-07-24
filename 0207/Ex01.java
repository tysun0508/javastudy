
import java.util.Scanner;
class Ex01{
    public static void main(String[] args){
       // Scanner는 java.lang안에 존재하지 않으므로
       // import를 해야된다.   

       //키보드로 입력된 내용을 scan이 기억한다.
       Scanner scan = new Scanner(System.in);
      //저장된 내용을 자바의 자료형으로 변경시키자(nextXXX)
         //String name = scan.next();
         
      

         System.out.print("이름 : ");
         String name2 = scan.nextLine();

         System.out.print("나이 : ");
         int age = scan.nextInt();

         System.out.print("키 : ");
         double ki = scan.nextDouble();

         System.out.print("진실입니까 : ");
         boolean res = scan.nextBoolean();

         if(res){
                 //System.out.println("당신의 이름 : " + name);
               System.out.println("당신의 이름 : " + name2);
               System.out.println("당신의 나이 : " + age);
               System.out.println("당신의 키 : " + ki);
               }else{
                 System.out.println("제대로 입력하세요");
               }
           
      
      //System.out.println("당신의 이름 : " +name);
      //System.out.println("당신의 이름 : " +name2);
     
   }
}