import java.util.*;

class Ex08{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        chk:
        while(true){
          System.out.print("�����Է� :");
        int su=scan.nextInt();
        String res="";

        if(su%2==0){
           res="¦��";
          }else{
           res="Ȧ��";
          }
         System.out.println("����� ������ ����"+res+"�Դϴ�.");
         
        while(true){
         System.out.println("����ұ��(y/n)?");
         String str=scan.next();
          if(str.equalsIgnoreCase("y")){
                break; //continue chk;
          }else if(str.equalsIgnoreCase("n")){
                break chk;
         }else{
                continue;
         }
        
        }//���� while end
       
       }//while end

     }//main end

}