class Ex05{
      public static void main(String [] args){
        // �񱳿����� : > , <, >=, <= , == , !=
        // ���� ���� : ���ڿ��� ==(����) ������� �ʴ´�.
        //             char�� �ڵ尪(����)���� ����ǹǷ� ��밡��
        // ����� ������ boolean��, ���ǽĿ� ���� ����

        int su1 = 20 ;
        int su2 = 30 ;
        boolean res = su1 > su2 ;

        System.out.println("��� : " + res) ;
        
        char ch1 = 'A' ;
        char ch2 = 'a' ;
        res = ch1 > ch2 ;
        System.out.println("��� : " +res) ;

        // ����� k �� �빮��?, �ҹ��� ?
         char k =  'P' ;

         //res = k>=65 &&k<= 90 ; // �빮��
         //      k>=97 && k<= 122;  // �ҹ��� 
        
        // res = k>='A' &&k<= 'Z' ; // �빮��
        //       k>='a' && k<= 'z';  // �ҹ���
        

  }
}