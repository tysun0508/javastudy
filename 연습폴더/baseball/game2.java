package baseball;

import java.util.Scanner;

public class game2 {
	public static void main(String[] args) 
	{
	
		Game bbg = new Game();
		Scanner sc = new Scanner(System.in);
		
		bbg.cls();
		bbg.com(); 
		System.out.println("�� �� �� ��");

		int count = 0;
		
		while(true){
		System.out.println(count+1+"��° ����");
		System.out.println(" [ (1~9)������ ���� �Է����ּ��� ]");
		System.out.println("---------------------------------------");
		int ball = 0;
		int strike = 0;
		
		
		int[] user = new int[3];
			for (int i = 0; i < user.length; i++) {
				System.out.print((i+1)+"��° ��:");
				user[i]=sc.nextInt();
				if(user[i]<1 || user[i]>9){ // ���� ���� �� �Է�
					i-=1;
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				if(i>0){ //���� �� �Է½� ���Է� ��û
					for(int j =0;j<i;j++){
						if(user[i]==user[j]){
							System.out.println("������ �������� �Է��ϼ̽��ϴ�.�ٽ��Է��ϼ���");
							System.out.println();
							i-=1;
							break;
						}
					}
				}
			}
			
			for(int i =0; i<3;i++){ //strike�� ball�� �� ���.
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
				System.out.println("Ȩ��");
				break;
			}else{
			System.out.println("strike :"+strike +"   ball: "+ ball);
			}
			System.out.println("--------------------------------------");
			count++;
			if(count==15) break; //15��°�� ����!
		}
		System.out.print("��ǻ���� ���� : ");
		bbg.prn();
		
	}
}
