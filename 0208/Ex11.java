import java.util.*;
class Ex11{
       public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String[][] str = new String[5][5];
            String name = "" ;
            String hak = "" ;  
            String rank = "1";
            int kor = 0;
            int eng = 0;
            int math = 0;
            int sum = 0 ; 
           double avg = 0.0;

        for(int i=0; i<str.length; i++){
             System.out.print("�̸� : ");
               name = scan.next();
               System.out.print("���� : ");
               kor = scan.nextInt();
               System.out.print("���� : ");
               eng = scan.nextInt();
               System.out.print("���� : ");
               math = scan.nextInt();

               sum = kor + eng + math ;
               avg = (int)((sum / 3.0)*10)/10.0 ;

                 if(avg>=90){
                    hak="A";
                 }else if(avg>=80){
                    hak="B";
                 }else if(avg>=70){
                    hak="C";
                 }else{
                    hak="F";
                 }
                 str[i][0] = name;
                 str[i][1] = sum+"";
                 str[i][2] = avg+"";
                 str[i][3] = hak;
                 str[i][4] = rank;


        }//for end
         
      
        //��������
          
          for(int i=0; i<str.length; i++){
                   int ranki  = 1;
               for(int j=0; j<str.length; j++){                   
                   int sumi = Integer.parseInt(str[i][1]);
                   int sumj = Integer.parseInt(str[j][1]);      
                   if(i==j){
                             continue;
                   }else{
                          if(sumi<=sumj){
                                     ranki++;
                          }
                   }
                    str[i][4] = ranki+"";
                }
           }



         //����
            String[] im = new String[5];
                    for(int i=0; i<str.length-1; i++){
                        for(int j=i+1; j<str.length; j++){
                            if(Integer.parseInt(str[i][1])<Integer.parseInt(str[j][1])){
                                im=str[i];
                                str[i]=str[j];
                                str[j]=im;

                            }
                        }
                    }
          





         // ��� 
       System.out.println("�̸�\t����\t���\t����\t����");  
        for(int i=0; i<str.length; i++){
               for(int j=0; j < str[i].length;j++){
                      System.out.print(str[i][j]+"\t");
               }
              System.out.println();
         }
          System.out.println("�����ϼ̽��ϴ�");  
               

       

      
   }
}