
import java.util.Scanner;
class Ex01{
    public static void main(String[] args){
       // Scanner�� java.lang�ȿ� �������� �����Ƿ�
       // import�� �ؾߵȴ�.   

       //Ű����� �Էµ� ������ scan�� ����Ѵ�.
       Scanner scan = new Scanner(System.in);
      //����� ������ �ڹ��� �ڷ������� �����Ű��(nextXXX)
         //String name = scan.next();
         
      

         System.out.print("�̸� : ");
         String name2 = scan.nextLine();

         System.out.print("���� : ");
         int age = scan.nextInt();

         System.out.print("Ű : ");
         double ki = scan.nextDouble();

         System.out.print("�����Դϱ� : ");
         boolean res = scan.nextBoolean();

         if(res){
                 //System.out.println("����� �̸� : " + name);
               System.out.println("����� �̸� : " + name2);
               System.out.println("����� ���� : " + age);
               System.out.println("����� Ű : " + ki);
               }else{
                 System.out.println("����� �Է��ϼ���");
               }
           
      
      //System.out.println("����� �̸� : " +name);
      //System.out.println("����� �̸� : " +name2);
     
   }
}