class Ex02{
          public static void main(String[] args){

          // String : �����ڷ���(Ŭ������ �ڷ������� ���)
          //          Ư���� String�� �⺻ �ڷ��� ó�� ���ȴ�.
          //          ���ڳ� ���ڿ��� ó���ϴµ� ����ϴ� Ŭ������.

          // char�� '' , String�� "" ���
              String str = "�氡�氡" ;
              System.out.println(str) ;

          // ���ǻ��� : String�� + �����ڸ� ����� �� �ִ�.
          //  �̶�, + �����ڴ� ������ �ƴ϶� ���� �������̴�.
          String str2 = "10" ;
          int su1 = 10 ;           
          System.out.println(str2+su1) ; 
          System.out.println(":::::::::::::::::::::::::::");
          System.out.println(str2 +100) ;
          System.out.println(su1 +100) ;
          System.out.println("��� : " + str2 +100) ;
          System.out.println("��� : " + su1 +100) ;
          System.out.println("��� : " + str2 +100) ;
          System.out.println("��� : " + (su1 +100)) ;

 }
}