class Ex01{
    public static void main(String[] agrs){
         // ���θ�� : �ڵ�����ȯ
         //            ���� �ڷ����� ū�ڷ������� ��ȯ�Ǵ°�
         //            ���� �ս��� ����
         // �� ��� :  ��������ȯ(ĳ����)
         //            ū �ڷ����� ���� �ڷ������� ��ȯ�Ǵ� ��
         //            �����߻������� �߻����� �ʵ��� ��ġ�ϴ� ��
         //            ���� �ս��� �߻� �� ���� �ִ�.

         // ���θ��
          long su1 = 10 ; // long�� = int��
          int num1 = 20 ;
           su1 = num1 ;   // long�� = int�� 
          System.out.println(su1) ;

          char ch = 'a' ;
          num1 = ch ;  // int = char int�� �� ū �ڷ����̹Ƿ� �����߻����մϴ�.
          System.out.println(num1);

          float su2 = su1 ;
          System.out.println(su2);

          // �� ��� (������ ����ȯ)
          // �ڷ��� ������ = (�����ڷ���)(������) ;
            int su3 = 128 ;
                su3 = 129 ;
                su3 = 49 ;
            byte num2 = (byte)(su3) ;
            System.out.println(num2) ;

          
            int num3 = 65 ;
            char ch2 = (char)num3 ;
            System.out.println(ch2);

   }
}