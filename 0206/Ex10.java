class Ex10{
   public static void main(String[] args){
      // String Ŭ���� ; ���ڿ��� ó���� �� �ֵ��� �����ִ� Ŭ����
      // String�� ���� �⺻ �޼ҵ�(����=���)���� �˾ƺ���

       String jumin = "880915";
       String msg ="���ѹα� �� Korea";
       String msg2 = "Korea";
       String msg3 = "korea";

       // 1. charAt(int index) : char => index�� �ڸ���(��ġ��)=>0���ͽ���
       //     �ش� ��ġ�� �޾Ƽ� �ش� ��ġ�� �����ϴ� ���ڸ� �����Ѵ�.
       char ch  = jumin.charAt(3);
       System.out.println(ch);
     
       ch = msg.charAt(5);
       System.out.println(ch);

       ch = msg.charAt(2);
       System.out.println(ch);

       ch = msg.charAt(9);
       System.out.println(ch);

       for(int i=0 ; i < 5; i++){
           ch=msg2.charAt(i);
           if(ch>='A' && ch<='Z'){
               System.out.print(ch);
           }else if(ch>='a'&& ch<='z'){
               System.out.print((char)(ch-32));
           }else{
              System.out.println("���� ����");
           }
       }

      // 2.equals(String str) : boolean
      // str���ڿ��� �ش� ���ڿ��� ����(��ҹ��ڱ���) ������ true, �ٸ��� false;
          boolean res = msg2.equals(msg3);
          System.out.println(res);
   
      // 3.equalsIgnoreCase : boolean
      // str���ڿ��� �ش� ���ڿ��� ����(��ҹ��ڱ���X) ������ true, �ٸ��� false;
          res = msg2.equalsIgnoreCase(msg3);
          System.out.println(res);

      // 4. indexOf(int ch): int  =>int ch => char�� ����
      //     indexOf(String str) : int
      //  �ش繮�ڳ� ���ڿ��� �����ϸ� �����ϴ� ��ġ���� ���, ������������ -1 

      String str1 = "abcdabcd��ABCDABCD";
      int result =  str1.indexOf("��");
      System.out.println(result);

      String jum="890912-1010101";
      
      //�������ϱ�
      char result2 = jum.charAt(7);
      System.out.println(result2);
      

      int result3 = jum.indexOf("-") +1 ; // 7
      result2 = jum.charAt(result3);
      System.out.println(result2);

      //ã��
      result3 = str1.indexOf("a");
      System.out.println(result3);

      // 5. lastIndexOf(int ch):int , lastIndexOf(String str) : int
      // �������� �����ϸ� ������ ���ڳ� ���ڿ��� ��ġ�� ǥ��
           result3=str1.lastIndexOf("a");
           System.out.println("a : " + result3);


      // 6. length() : int // �ش繮�ڿ��� ����(����)�� ���ڷ� ǥ��
        String str2="love";
        int result4=str2.length();
        System.out.println(str2 +"�� ���ڱ��� : " + result4);

        for(int i=0 ; i < str2.length(); i++){
               char kk = str2.charAt(i);
              if(kk>='A' && kk <='Z'){
                     System.out.print(kk+"  ");
              }else if(kk>='a' && kk<='z'){
                     System.out.print((char)(kk-32));
              }
        }

       // 7. replace("�������ڿ�", "�ٲܹ��ڿ�") : String
        String str3 ="���ѹα�" ;
        String str4 = str3.replace("����","����");
        System.out.println("��� : "+ str3);
        System.out.println("��� : "+ str4);
        str4 = str3.replace("��", "�Ѣ�");
        System.out.println("��� : "+str4);

       // 8. substring(������ġ��) : String
       //    substring(������ġ, ����ġ) : String, ����ġ�� ���Ծ���
       //          ����ġ - ������ġ : �����ϴ� ������ ��

       String jumin2 = "880915";
       String year = "19" + jumin2.substring(0,2);
       System.out.println(year);
       String month = jumin2.substring(2,4);
       System.out.println(month);

       // 10. toLowerCase() : ������ ���ڿ��� �ҹ��ڷ� ����.
       // 11. toUpperCase() : ������ ���ڿ��� �빮�ڷ� ����.

        String str5="AbcDESg123������Abcdefg";

        String str6= str5.toLowerCase();
        System.out.println(str6);

        String str7= str5.toUpperCase();
        System.out.println(str7);

       // 12. trim() : �յڿ� �������� ���鹮�� ����(���ڻ��� ������ ���Ÿ���)
        String str8 = "         rksk     1231     ASDFB     ";
        System.out.println("���:"+str8 +"/"+ str8.length());
        String str9 = str8.trim();
        System.out.println("���:"+str9+"/"+str9.length());

       // 13. valueOf(�����ڷ���) : String => �����ڷ����� ���ڿ��� �����Ѵ�.
        boolean b1 = true;
        int num1 = 321;
        long num2 = 412L;
        double do1 = 3.14;
        float do2 = 78.654f;
        char ch1 = 'A' ;
        
        String result5 = String.valueOf(b1);
        System.out.println(result5 + 10);

        result5 = String.valueOf(num1);
        System.out.println(result5 + 10);

        result5 = String.valueOf(num2);
        System.out.println(result5 + 10);

        result5 = String.valueOf(do1);
        System.out.println(result5 + 10);

        result5 = String.valueOf(do2);
        System.out.println(result5 + 10);

        result5 = String.valueOf(ch1);
        System.out.println(result5 + 10);

        System.out.println(":::::::::::::::::::::::::::::::::");
        
        System.out.println(b1+""+10);
        System.out.println(num1+""+10);
        System.out.println(num2+""+10);
        System.out.println(do1+""+10);
        System.out.println(do2+""+10);
        System.out.println(ch1+""+10);

      // 14. ���ڷ� �� �����ڷ����� ���� �ڷ������� �����Ŵ
          
         String msg10 = "true";   //"true"�� "false" ���� �ϳ��� �Է°���;
            
         if(Boolean.parseBoolean(msg10)){
            System.out.println("�氡�氡");
         }else{
            System.out.println("Hi~~~~");
         }

         String msg11 = "100";
         System.out.println(msg11+10);//10010
         System.out.println(Integer.parseInt(msg11)+10);//110

         String msg12 = "3.14";
         System.out.println(msg12+10);//10010
         System.out.println(Double.parseDouble(msg12)+10);//110


   }
}