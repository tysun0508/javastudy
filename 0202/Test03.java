class Test03{
       public static void main(String [] agrs){
   
       
       int input = 10000 ;
       int dan = 3500;
       int su = 2 ;
       
       int sum = dan*2;
       int vat = (int)(sum*0.1) ;
       int total = sum +vat ;
       int output = input - total ;
             
       System.out.println("지불한 돈 : "+ input);
       System.out.println("단가 : "+ dan);
       System.out.println("수량 : "+ su);
       System.out.println("부가세 : "+vat);
       System.out.println("상품 총액 : "+total);
       System.out.println("거스름돈 : "+output);



  }
}