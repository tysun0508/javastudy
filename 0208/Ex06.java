import java.util.*;
class Ex06{
      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            Random ran = new Random();
            double allCount = 0 ;
            double vCount = 0 ;  

            exit :
            while(true) {
                  allCount ++ ;
                  int com = (int)(ran.nextDouble() *2) +1; // 1�ƴϸ� 2
                  System.out.print("1.���� 2.���� >> ");
                  int user = scan.nextInt();
                  
                 if(user == com ){
                        vCount++;
                      System.out.println("����");             
                  }else{
                     System.out.println("Ʋ��");
                  }
                   while(true){
                     System.out.print("����ұ��?(y/n)");
	        String str = scan.next();
	       if(str.equalsIgnoreCase("y")){
                	break; 
	        }else if(str.equalsIgnoreCase("n")){
                	break exit;
	        }else{
               	continue;
	        }
                 }
            }
          System.out.println("�����ϼ̽��ϴ�.");
          System.out.println("����� �·� : "+
		(int)((vCount/allCount)*100)+"%");
      }
}