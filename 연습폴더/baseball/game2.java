package baseball;

import java.util.Scanner;

public class game2 {
	public static void main(String[] args) 
	{
	
		Game bbg = new Game();
		Scanner sc = new Scanner(System.in);
		
		bbg.cls();
		bbg.com(); 
		System.out.println("야 구 게 임");

		int count = 0;
		
		while(true){
		System.out.println(count+1+"번째 게임");
		System.out.println(" [ (1~9)사이의 수를 입력해주세요 ]");
		System.out.println("---------------------------------------");
		int ball = 0;
		int strike = 0;
		
		
		int[] user = new int[3];
			for (int i = 0; i < user.length; i++) {
				System.out.print((i+1)+"번째 수:");
				user[i]=sc.nextInt();
				if(user[i]<1 || user[i]>9){ // 범위 내의 수 입력
					i-=1;
					System.out.println("잘못된 입력입니다.");
				}
				if(i>0){ //같은 값 입력시 재입력 요청
					for(int j =0;j<i;j++){
						if(user[i]==user[j]){
							System.out.println("이전과 같은값을 입력하셨습니다.다시입력하세요");
							System.out.println();
							i-=1;
							break;
						}
					}
				}
			}
			
			for(int i =0; i<3;i++){ //strike와 ball의 수 계산.
				for(int j = 0;j<3;j++){
					if(bbg.comball[j]==user[i]){
						if(i==j){
							strike++;
						}else{
							ball ++;
						}
					}											
				}
			}
			System.out.println();
			if(strike == 3){
				System.out.println("홈런");
				break;
			}else{
			System.out.println("strike :"+strike +"   ball: "+ ball);
			}
			System.out.println("--------------------------------------");
			count++;
			if(count==15) break; //15번째에 종료!
		}
		System.out.print("컴퓨터의 수는 : ");
		bbg.prn();
		
	}
}
