import java.util.*;

class Ex03{
    public static void main(String[] args){
     
      //� ���� �޾Ƽ� Ȧ��, ¦�� �Ǻ��ϱ�

        Scanner scan=new Scanner(System.in);

        System.out.print("�����Է� :");
        int su= scan.nextInt();
        String result="";
        if(su%2==0){
           result="¦��";
       }else{
           result="Ȧ��";
       }
      System.out.println("��� �Է���"+su+"��"+result+"�Դϴ�.");

  
   }
}