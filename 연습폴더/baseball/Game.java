package baseball;

import java.util.Random;

public class Game {
	protected int[] comball =new int[3];
	private int im = 0;//�ӽ÷� ���� ����ϴ� ��.
	Random ran = new Random();
	
	//�迭 �ʱ�ȭ �޼ҵ�
	public void cls(){
	for(int i=0;i<comball.length;i++)
		comball[i] = 0;
	}

	//computer�� ������ �� 3���� ����ϴ� �޼ҵ�.
	public void com(){
		com:
		for(int i=0; i<comball.length;i++){
			im = ran.nextInt(9)+1 ; //1~9������ ������ �� �Է�
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
				}//if�� ����
			}//���� for��
		}//�ٱ��� for��
	}//�޼ҵ� ����

	//��¸޼ҵ�
	public void prn(){
		for(int i=0;i<3;i++)
		System.out.print(" "+comball[i]);
	}







}
