class Ex01{ 
     public static void main(String [] args){
       // ���׿�����
       // ����) �ڷ��� ������ = ���ǽ� ? ���϶� ���๮ : �����϶� ���๮ ;        
       // ���� ���� :  ������ �ڷ����� ���϶� ���๮�� ����� �ڷ���
       //              �����϶� ���๮�� ����� �ڷ���, 3������ ��� ���� �ڷ���
       // ���ǽ��� boolean��, ��(true,false, �񱳿���(>= , <=, ...), ������(&&,||,!)

       String res = true ? "�ȳ��ϼ���" : "Hello~~" ;
       System.out.println(res) ;
 
       
       int res2 = false ? 100+10 : 'A' ;
       System.out.println(res2) ;

       // ��� k�� Ȧ������ ¦������ �Ǻ�����
       int k = 47 ;
       String result = (k%2 == 0) ? "¦��" : "Ȧ��" ;
       System.out.println(result) ;

       // ����� k2�� �빮������ �ҹ������� �Ǻ�����
       char k2 = '1' ;
       // result = (k2>=65 && k2<=90) ? "�빮��" : "�ҹ���" ;
       // result = (k2>='A' && k2<= 'Z') ? "�빮��" : "�ҹ���" ;
          result = (k2>='A' && k2<= 'Z') ? "�빮��" : k2>='a' && k2<= 'z' ?"�ҹ���":"�ٽ��Է�" ;
          System.out.println(result) ;
                 
       // ������ ����� 90�̻��̸� A����, 80���̻��̸� B����, ������ F����
         int avg =91 ;
         result =  avg>= 90 ? "A ����" : avg>=80 ?  "B ����" :  "F����" ; 
         System.out.println(result) ;
       
       // ������ 1�Ǵ� 3�̸� ����, 2�Ǵ�4�̸� ����, ������ �ܱ���
          int gender = 7 ;
          result = (gender == 1 || gender ==3) ? "����" : (gender == 2 || gender ==4)? "����" : "�ܱ���" ;
          System.out.println(result) ;

       // 8�ð������� �ð��� 6,780�� �̰� �ʰ��ϸ� 1.5�� ����
         int time = 10 ;
         int dan = 6780 ;
         int pay = 0 ;
          pay = (time>8) ?(8*dan) + (int)((time-8)*dan*1.5) : dan* time ;
         System.out.println(pay) ;
    }
}