class Test05{
     public static void main(String[] args){
  	int time = 3662 ; // ��

        int h, m, s, res ;

        // 1�ð� = 60��, 1�� = 60 ��, 1�ð� = 3600��
         h = time / 3600 ;  // 1
         res = time % 3600;  // 62

         m = res / 60 ;
         s = res % 60 ;

     System.out.println(time+"�ʴ� "+h+"�ð� "+m+"�� " + s +"��");

     }
}