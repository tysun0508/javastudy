class Ex08{
   public static void main(String[] args){
        // break�� : ���� �ݺ����� Ż���Ҷ� ���
     
        // 0-10 ���� ���
        for(int i=0; i < 11 ; i++){
           System.out.print(i + " ");
        }
        System.out.println();

       for(int i=0; i < 11 ; i++){
           if(i==4) break;
           System.out.print(i + " ");
        }
        System.out.println("::::::::::::::::::");

       int k = 0;
       while(k<11){
         if(k==4) break;
         System.out.print(k +" ");
        k++;
       }

      System.out.println("::::::::::::::::::");

       int p = 0;
       while(true){
        if(p==4) break;
        System.out.print(p +" ");
        p++;
       }
      System.out.println("::::::::::::::::::");

       // ���� for�� �ȿ� �����ϴ� break���� ���� for���� �������´�.
        for(int i=1 ; i<6 ; i++){
           for(int j=1 ; j<6 ; j++){
               // if(j==3) break;
                 if(i == 2) break;
              System.out.print("i=" + i+", j="+j+" ");
           }
          System.out.println();
         }
        System.out.println("::::::::::::::::::");

        // break label �� : label �Ʒ� �����ϴ� ��� �ݺ��� Ż���Ѵ�.
        chk :
         for(int i=1 ; i<6 ; i++){
           for(int j=1 ; j<6 ; j++){
                if(j==3) break chk;
              System.out.print("i=" + i +", j="+j+" ");
           }
          System.out.println();
         }
        System.out.println("::::::::::::::::::");
       }
}