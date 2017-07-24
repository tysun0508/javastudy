import java.util.*;
class Ex01{
   public static void main(String[] args){
        
    int[] su = {9,5,3,1,10,2,4,7,6,8,};
    int im = 0;

    for(int i=0; i<su.length-1; i++){
       for(int j=i+1; j<su.length; j++){
          if(su[i]>su[j]){  //부등호만 바꾸면 오름차 내림차 변경가능
             im=su[i];
             su[i]=su[j];
             su[j]=im;
          }
       }
    }
     //출력
     for(int i=0; i<su.length; i++){
         System.out.print(su[i]+"  ");
     }
     System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
    //////////////////////////////////////////////////////////////////////////////
       int[] su2 = {9,5,3,1,10,2,4,7,6,8,};
       //Arrays라는 클래스에 sort라는 메소드를 사용하면 정렬된다.
         Arrays.sort(su2);

          for(int i=0; i<su2.length; i++){
         System.out.print(su2[i]+"  ");
         }
   }
}