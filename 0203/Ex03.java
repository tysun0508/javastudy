class Ex03{
    public static void main(String [] args){
        // if(���ǽ�){
        //    ���ǽ��� ���϶� ������ ����� ;
        // }else{
        //    ������ �����϶� ������ �����;
        // }

       

        // int su�� 60�̻��̸� �հ�, �ƴϸ� ���հ�
           int su = 70 ;
           String res = "" ;
           if(su>=60){
           res = "�հ�";
      }else{          
       
          res = "���հ�" ;
            }
         System.out.println(res);


        //  gender �� 1,3�̸� ����, 2,4�̸� ����, �������� �ܱ���
        int gender = 14 ;
        if(gender==1 || gender==2 || gender == 3 || gender== 4){
          if(gender ==1 || gender == 3){
              res = "����";
           }else{
              res = "����";
           }
        }else{
          res = "�ܱ���";
        }
          System.out.println(res);
 
        // ��1�� ��2�� ���ؼ� ū���� ����Ͻÿ�
            int num1 = 40;
            int num2 = 50 ;
            int result = num1 ;
           if(num1 > num2){
                 result =num1 ;
           }else{
               result = num2 ;
         }
           System.out.println(result) ;


  }
}