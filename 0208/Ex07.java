import java.util.*;
class Ex07{
      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            Random ran = new Random();
            double allCount = 0 ;
            double vCount = 0 ;  

            exit :
            while(true) {
                  allCount ++ ;
                  int com =  (int)(ran.nextDouble() *3) ;  // 0 1 2
              //  int com =   Math.abs(ran.nextInt())%3 ;  // 0 1 2
                  System.out.println("1.���� 2.���� 3.�� >> ");
                  int user = scan.nextInt(); // 1, 2, 3
                  String res ="";
                 if(com == 0){   // ����
                      if(user==1){
		res ="���";
                      }else if(user ==2){
		vCount ++;
                          res ="�̱�";
                      }else if(user ==3){
		res ="��";
                      } 
                 }else if(com == 1){  // ����
                      if(user==1){
		res ="��";
                      }else if(user ==2){
		res ="���";
                      }else if(user ==3){
		vCount ++;
		res ="�̱�";
                     } 
                }else if(com == 2){ // ��
                      if(user==1){
		vCount ++;
		res ="�̱�";
                      }else if(user ==2){
		res ="��";
                      }else if(user ==3){
		res ="���";
                     } 
                } 
                  System.out.println("��� : " + res);
 
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