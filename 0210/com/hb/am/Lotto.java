package com.hb.am;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] su = new int [6] ;
		
		for (int i = 0; i < su.length; i++) {
			su[i] = Math.abs(random.nextInt())%45+1 ; // 1-45 ;
			//ù��° ���� �ߺ��˻� ���� ������ ����
			//�ι�° �����ʹ� �ߺ��˻� �� �ߺ��Ǹ� �ٽ� ó������ ����
			if (i>=1){
				for(int j=0; j<i; j++){
					if(su[i]==su[j]){
						su[i] = Math.abs(random.nextInt())%45+1 ;
						j = -1 ;
					}
				}
			}
		}
		Arrays.sort(su);
		for(int k : su){
			System.out.print(k+"  ");
		}
	}
}
