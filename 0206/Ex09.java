class Ex09{
   public static void main(String[] args){
       // continue��: ����ݺ����� Ż���ϴ� ���� �ƴ϶�
       //             continue���Ʒ� ���๮�� �����ϰ�
       //             ����ȸ���� ���� ���������� ����.(for ��)
       //             �������� ������ ���ǽ����� ����.(while ��)
       //          �̶� ���ǽ� ���� �������� �־�� ���� ������ ������ �ʴ´�.

      //0-10 ���
      for(int i=0; i < 11 ; i++){
         System.out.print(i+" ");
      }
     System.out.println(":::::::::::::::::::::::::");


     // 0-10 ��� (i�� 3�϶� continue);
      for(int i=0; i < 11 ; i++){
         if(i==3) continue ;
         System.out.print(i+" ");
      }
     System.out.println(":::::::::::::::::::::::::");

    int k = -1 ; 
     while(k<11){
      k++;
      if(k==3) continue ;
      System.out.print(k+" ");
     }
     System.out.println(":::::::::::::::::::::::::");
     
     // 0-10 ¦��
    for(int i=0; i < 11 ; i++){
     if(i%2==0){
        System.out.print(i+" ");
     }
   }
   System.out.println(":::::::::::::::::::::::::");

    // 0-10 ¦��
   for(int i=0; i<11; i++){
     if(i%2!=0) continue;
       System.out.print(i+" ");
   }
   System.out.println(":::::::::::::::::::::::::");

 // ���� for���ȿ� �����ϴ� continue���� ���� for���� ���������� �̵��Ѵ�.
   for(int i=1; i<4; i++){
      for(int j=1; j<6; j++){
       // if(j==3) continue ; 
          if(i==2) continue ;
         System.out.print("i="+i+", j="+j+" ");
      }
      System.out.println();
   }
  System.out.println(":::::::::::::::::::::::::");

  // continue label�� : label�Ʒ� �����ϴ� �ݺ����� ���������� �̵��Ѵ�.

 
   a :
   for(int i=1; i<4; i++){
      for(int j=1; j<6; j++){
        // if(j==3) continue a; 
          if(i==2) continue a;
         System.out.print("i="+i+", j="+j+" ");
      }
      System.out.println();
   }
  System.out.println(":::::::::::::::::::::::::");
 }
}
 