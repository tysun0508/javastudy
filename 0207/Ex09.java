import java.util.*;
class Ex09{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
       

       chk:
       while(true){

       System.out.print("�̸� : ");
       String name = scan.next();

       System.out.print("���� :");
       int kor = scan.nextInt();

       System.out.print("���� :");
       int eng = scan.nextInt();

       System.out.print("���� :");
       int math =scan.nextInt();

       int sum = kor+eng+math ;
       double avg=sum/3.0 ;
       String hak="" ;
     
       if(avg>=90){
          hak="A ����";
       }else if(avg>=80){
          hak="B ����";
       }else if(avg>=70){
          hak="C ����";
       }else{
          hak="F ����";
       }
         
       System.out.println("�̸� : " +name);
       System.out.println("���� : " +sum);
       System.out.println("��� : " +((int)(avg*10)/10.0));
       System.out.println("���� : " +hak);
       while(true){
       System.out.println("����ұ��(y/n)?");
       String str=scan.next();
        if(str.equalsIgnoreCase("y")){
              break;
        }else if(str.equalsIgnoreCase("n")){
              break chk;
        }else{
              continue;
        }
     }

    }
   }
}