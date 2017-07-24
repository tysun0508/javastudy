package baseball;

import java.util.Random;

public class Game {
	protected int[] comball =new int[3];
	private int im = 0;//임시로 수를 기억하는 곳.
	Random ran = new Random();
	
	//배열 초기화 메소드
	public void cls(){
	for(int i=0;i<comball.length;i++)
		comball[i] = 0;
	}

	//computer가 임의의 값 3개를 기억하는 메소드.
	public void com(){
		com:
		for(int i=0; i<comball.length;i++){
			im = ran.nextInt(9)+1 ; //1~9까지의 임의의 수 입력
			for(int j = 0;j<(i+1);j++){
				if(comball[j] == im){
					--i;
					continue com;
				}else{
					if(i==j){
						comball[j]=im;
						break;
					}else{
						continue;
					}
				}//if문 종료
			}//안쪽 for문
		}//바깥쪽 for문
	}//메소드 종료

	//출력메소드
	public void prn(){
		for(int i=0;i<3;i++)
		System.out.print(" "+comball[i]);
	}







}
