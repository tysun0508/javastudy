import java.util.*;

class Ex10{
    public static void main(String[] args){
     
      //� ���� �޾Ƽ� Ȧ��, ¦�� �Ǻ��ϱ�
        
       Scanner scan=new Scanner(System.in);
      
       chk:
       while(true){
       
       System.out.print("�����Է� :");
        int su= scan.nextInt();
        String result="";
        if(su%2==0){
           result="¦��";
       }else{
           result="Ȧ��";
       }
      System.out.println("��� �Է���"+su+"��"+result+"�Դϴ�.");
     
      while(true){
       System.out.println("����ұ��(y/n)?");
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