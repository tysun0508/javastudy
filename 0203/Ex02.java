class Ex02{
     public static void main(String [] args){
      // �ܼ� if�� : ������ �����ϰ� ���� ��츸 ����
      //            ������ �����϶��� if���� ��ü�� ����
      // ���� : if(���ǽ�) {
      //           ���ǽ��� ���϶� ������ �����
      //             } 
      // ���ǻ��� :  ���ǽ��� ���϶� ������ ������ �� �����̸� {} ��������

     



      // ����(sum)�� 60 �̻��̸� �հ�
        int sum = 59 ;
        String res = "���հ�" ;
        if(sum >= 60){
          // System.out.println("�հ�");
         res = "�հ�" ;        
}

        System.out.println(res) ;

        // ����(sum)�� 60�̻��̸� �հ�, �������� ���հ�
       if(sum>=60){
          res = "�հ�" ;
        }
       if(sum<60){
          res = "���հ�" ;
            }
         System.out.println(res);

      // ��� k�� Ȧ������ ¦������ �Ǻ�����
      int k = 2 ;
      res = "Ȧ��" ;
     if(k%2==0){
         res = "¦��" ;
    }
      System.out.println(res);

      


     // ����� k2�� �빮������ �ҹ������� �Ǻ�����
        char k2 = 'A' ;
        res = "�ҹ���" ;
         if(k2>='A' && k2<= 'Z'){
          res = "�빮��" ;
         }
         System.out.println(res);
     

         // 8�ð������� �ð��� 6,780�� �̰� �ʰ��ϸ� 1.5�� ����
        
           int time = 8 ;
           int dan = 6780;
           int pay = time * 6780 ;
           if(time >8){
                  pay = (8*dan) + (int)(1.5*(time-8)*dan);
            }
            System.out.println(pay);




}
}