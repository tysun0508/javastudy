import java.util.*;
class Ex03{
    public static void main(String[] args){
         //��¥ ���� Ŭ���� : Calendar
           
         //Calendar �����ɶ� ��ǻ���� ��,��,��,�ú��ʸ� ����
             Calendar now = Calendar.getInstance();

         //��, ��, ��, ��, ��=>get(���)
           System.out.println(now.get(Calendar.YEAR)+"��");
           System.out.println(now.get(now.YEAR)+"��");
           System.out.println(now.get(Calendar.MONTH)+1+"��"); //0-11����
           System.out.println(now.get(Calendar.DAY_OF_MONTH)+"��");
           System.out.println(now.get(Calendar.DATE)+"��");

           System.out.println(now.get(Calendar.HOUR)+"��"); //12�ð�
           System.out.println(now.get(Calendar.HOUR_OF_DAY)+"��"); //24�ð�

           //����=>0, ����=>1;
            int res=now.get(Calendar.AM_PM);
            int hour=now.get(Calendar.HOUR);
            if(res==0){
               System.out.println("AM"+hour+"��");
            }else if(res==1){
               System.out.println("PM"+hour+"��");
            }

            System.out.println(now.get(Calendar.MINUTE)+"��");
            System.out.println(now.get(Calendar.SECOND)+"��");
            
           //����(SUN=>1,.........,SAT=>7);
            System.out.println(now.get(Calendar.DAY_OF_WEEK)+"����");
   




    }

}