class Ex06{
      public static void main(String [] args){
          // �������� : &&(AND, ����, ������)
          //           �־��� ������ ��� true�϶� ��� true
          // false�� ������ ����� false, �ڿ� ������ ������� ����
          // ���� >= && <= ���� => ���� ����
          
          int su1 = 10 ;
          int su2 = 7 ;
          boolean res = (su1 >= 7) && (su2 >= 5); // true = true &&true
          System.out.println("��� : "+ res) ;

          res = (su1 >= 7) && (su2 <= 5); // false = true && false
          System.out.println("��� : "+ res) ;

          res = (su1 <= 7) && (su2 >= 5); // false = false &&true
          System.out.println("��� : "+ res) ;

          res = (su1 <= 7) && (su2 <= 5); // false = false &&false
          System.out.println("��� : "+ res) ;

          int num1 =10 ;
          int num2 =20 ;
          
          res = ((num1 = num1+12) > num2) && (num1 == ( num2 = num2+2));
          System.out.println("res : " + res);
          System.out.println("num1 : " + num1);
          System.out.println("num2 : " + num2);



          int num3 =10 ;
          int num4 =20 ;
          
          res = ((num3 = num3+12) < num4) && (num3 == ( num4 = num4+2));
          System.out.println("res : " + res);
          System.out.println("num3 : " + num3);
          System.out.println("num4 : " + num4);

          // �������� : ||(or, ����, ������)
          // �־��� ���� �� �ϳ��� true�̸� ����� true
          // true�� ������ ����� true, �� ������ ó������ ����


          int su3 = 10 ;
          int su4 = 7 ;
          res = (su3 >= 7) || (su4 >= 5); // true = true || true
          System.out.println("��� : "+ res) ;

          res = (su3 >= 7) || (su4 <= 5); // false = true || false
          System.out.println("��� : "+ res) ;

          res = (su3 <= 7) || (su4 >= 5); // false = false || true
          System.out.println("��� : "+ res) ;

          res = (su3 <= 7) || (su4 <= 5); // false = false  || false
          System.out.println("��� : "+ res) ;


          int num5 =10 ;
          int num6 =20 ;
          
          res = ((num5 = num5+12) >= num5) || (num5 == ( num6 = num6+2));
          System.out.println("res : " + res);
          System.out.println("num5 : " + num5);
          System.out.println("num6 : " + num6);
          

   }
}