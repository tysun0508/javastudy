package Lotto;
import java.util.* ;

class  Lottoo{
	public static void main(String[] args) {
		
		int[] a = new int[6] ;
		Random ran = new Random() ;
		a[0] = 0 ;
		
		로또:
		for(int i =0; i < a.length; i++) { 
		int im = (ran.nextInt(45)+1);
		 for(int j=0; j<(i+1);j++){
			if(a[j] == im){
				j=-1;
				--i;
				continue 로또;
			}else{
				if(i==j){
					a[i]=im;
					break;
				}else continue;
				}
		}
}
		
    System.out.print("오늘의 로또 결과 : ");
	Arrays.sort(a);
	for(int i=0;i<6;i++)
	System.out.print(a[i]+" ");
    System.out.println(); 	





	}
}
