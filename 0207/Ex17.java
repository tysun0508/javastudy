import java.util.*;

class Ex17{
   public static void main(String[] args){
       
       Scanner scan=new Scanner(System.in);
       
       int[]arr={0,2,4,6,8,10};
       String result="�ߺ��ƴ�";
         chk:
         while(true){
           System.out.print("�����Է�:");
           int su=scan.nextInt();   
           for(int i=0; i<arr.length; i++){
               if(arr[i]==su){
                   result="�ߺ�";
               }
           }
          System.out.println(result);

           while(true){
             System.out.print("����ұ��(y/n)? ");
                      String str = scan.next();
         	          if(str.equalsIgnoreCase("y")){
                             break; // continue chk;
                      }else  if(str.equalsIgnoreCase("n")){
		break chk;
                      }else{
                        continue ;
                   }
              } //���� while 
 
       }

   }
}