import java.util.*;
class Ex06{
     public static void main(String[] args){
          Scanner scan=new Scanner(System.in);
              
         System.out.print("�ֹι�ȣ : "); //ex)800808-1
         String jumin=scan.next();
         String gender=jumin.substring(7);
         //char gender2=jumin.charAt(7);
         //String gender3=jumin.substring(jumin.indexOf("-")+1);
         String age=jumin.substring(0,2);
         int r_age=Integer.parseInt(age);
         
         
         String r_gen="";
          int res=0;
         switch(gender){
            case"1" : r_gen="����";res=2017-(1900+r_age);break;
            case"2" : r_gen="����";res=2017-(1900+r_age);break;
            case"3" : r_gen="����";res=2017-(2000+r_age);break;
            case"4" : r_gen="����";res=2017-(2000+r_age);break;

           }
           System.out.println("����� ������"+r_gen+"�̰�,���̴�"+res+"�Դϴ�.");
        





      }
}