class Test01{
      public static void main(String[] agrs){
        // �Է� => ó��(����) => ���


       int com = 81 ;
       int eng = 73 ;
       int math = 90 ;
       int java = 70 ;

      // int sum = 80 +85 +90 +70 ;
       int sum = com + eng + math +java ;
       
       double avg = sum / 7.0 ;
       int res = (int)(avg * 100) ;
       double avg2 = res /100.0;
       
       double avg3 = Math.ceil(avg*1000)/1000.0;   //�ø�
       double avg4 = Math.round(avg*1000)/1000.0; //�ݿø�
       double avg5 = Math.floor(avg*100)/100.0; // ����
       System.out.println("=============������=============");
       System.out.println("���� : "+com+"\t"+eng+"\t"+math+"\t"+java);
       System.out.println("���� : " + sum) ;
       System.out.println("���1 : " + avg) ;
       System.out.println("���2 : " + avg2) ;
       System.out.println("���3 : " + avg3) ;
       System.out.println("���4 : " + avg4) ;
       System.out.println("���5 : " + avg5) ;

  }
}