class Ex5{
     public static void main(String[] args){

      // ������ : �Ҽ����� ���� ����, �⺻ int���̴�.
      //           byte < short < int < long

      // byte ; -128 ~ 127���� ǥ�� ����
         
         byte su = 127 ;
          //    su = 128 ;
          //    su = 127+1 ;
              su = 127 ;
         
             byte su2 = -128 ;
             System.out.println(su + 1) ; 
            
              //byte +byte , byte +short �� ����� ��� int�� ���;� �Ѵ�.
             //byte result = su + su2 ;
               int result = su +su2 ;
             System.out.println(result);

          // long���� ���� �ڿ� L �Ǵ� l �� ���δ�. ���� ���������ϴ�
            long num = 123 ;
            long num2 = 214l;
            long sum =num + num2 ;
            System.out.println(sum);

          // �Ǽ��� : �Ҽ����� �ִ� ����, �⺻ double���̴�.
          //         float < double
          // float�� �ݵ�� ���� �ڿ� F�Ǵ� f�� ���δ�. �����Ұ�
 
                       float pi = 3.14f;
                       System.out.println(pi);


      }
}