import java.util.*;

class Ex14{
   public static void main(String[] args){
       //Ű���带 ���ؼ� �����̸� �ޱ�
        Scanner scan=new Scanner(System.in);
       
       //�迭 �����
         String[] str=new String[5];

       //�迭�� �ֱ�
         for(int i=0; i<str.length; i++){
           System.out.print("�����Է� : ");
           str[i]=scan.next();
         }
       
      
       System.out.print("����� �Է��� ����� : ");
       //�迭 ���� ����ϱ�
         for(int i=0; i<str.length; i++){
            System.out.print(str[i]+",");
         }
       
     


   }
}