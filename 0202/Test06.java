class Test06{
     public static void main(String[] args){
         double cm, feet, fe, inch, in ;

        cm = 162.56 ;
        inch = 2.54 ; //1��ġ 2.54cm
        feet = 12 * inch ; // 1��Ʈ 12��ġ  = 12 * 2.54 =30.48 cm

         fe = cm / feet ; 
         in = (cm% feet) / inch ;
 
         System.out.println(cm+"cm�� "+(int)(fe)+"��Ʈ"+(int)(in)+" ��ġ�̴�.");
     


    }
}