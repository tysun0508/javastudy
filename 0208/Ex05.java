import java.util.*;
class Ex05{
   public static void main(String[] args){
         //���� ��¥ ��� �����
         //Calendar�� �̿��ؼ� ���� ��¥ ���ϱ�
         //Math.randm(), Random()�� �̿��ؼ� ���%(0-100)�����    

         //���� ��¥
           Calendar now=Calendar.getInstance();
         //��,��,�� ���ϱ�
           int year= now.get(Calendar.YEAR);
           int month=now.get(Calendar.MONTH)+1;
           int day=now.get(Calendar.DATE);

           //Random�� �̿��ؼ� ���% ���ϱ�
            
             Random ran=new Random();
             int su=ran.nextInt(101);  
             int su2=(int)(ran.nextDouble()*101);
             int su3=(int)(Math.random()*101);

             System.out.println(year+"."+month+"."+day+":����� ���:"+su+"%�Դϴ�.");
             System.out.println(year+"."+month+"."+day+":����� ���:"+su2+"%�Դϴ�.");
             System.out.println(year+"."+month+"."+day+":����� ���:"+su3+"%�Դϴ�.");





   }

}