class Test03{
       public static void main(String [] agrs){
   
       
       int input = 10000 ;
       int dan = 3500;
       int su = 2 ;
       
       int sum = dan*2;
       int vat = (int)(sum*0.1) ;
       int total = sum +vat ;
       int output = input - total ;
             
       System.out.println("������ �� : "+ input);
       System.out.println("�ܰ� : "+ dan);
       System.out.println("���� : "+ su);
       System.out.println("�ΰ��� : "+vat);
       System.out.println("��ǰ �Ѿ� : "+total);
       System.out.println("�Ž����� : "+output);



  }
}