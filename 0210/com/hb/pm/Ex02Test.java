package com.hb.pm;

import java.util.Scanner;

public class Ex02Test {
	public static void main(String[] args) {
		Ex02 t1 = new Ex02();
		t1.setName("��"	);
		t1.setPrice(500);
		Ex02 t2 = new Ex02("�̿�����", 900);
		Ex02 t3 = new Ex02("Ŀ������", 1000);
		Ex02 t4 = new Ex02("ź������", 800);
		
		
		// t1, t2, t3, t4 �� �迭�� ����
		// �ڷ���[] �̸� = new �ڷ���[ũ��]	
		// t1~t4�� Ŭ������ ���� ��ü�� �迭�� ��������
		// �ش� Ŭ������ �ڷ����� �ȴ�.
		// �̷��� �迭�� �����迭, ��ü�迭�̶�� �Ѵ�.
		Ex02[] arr = new Ex02[4] ;
		arr[0] = t1 ;
		arr[1] = t2 ;
		arr[2] = t3 ;
		arr[3] = t4 ;
		// Ex02[] arr2 = {t1, t2, t3, t4} ; �̷��Ե� ���
		
		//System.out.println(t1);
		//System.out.println(arr[0]));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert Coin : ");
		int coin = scan.nextInt();
		
		/*if(t1.getPrice()<=coin){System.out.println(t1.getName());}
		if(t2.getPrice()<=coin){System.out.println(t2.getName());}
		if(t3.getPrice()<=coin){System.out.println(t3.getName());}
		if(t4.getPrice()<=coin){System.out.println(t4.getName());}*/
		
		for (int i = 0; i < 4; i++) {
			if (arr[i].getPrice()<= coin){
				System.out.println(arr[i].getName()+"  ");
			}
			
		}
		System.out.println();
	
		System.out.print("�����ϼ���>>");
		String str = scan.next();
		int output = 0 ;
		/*if(str.equalsIgnoreCase("��")){
			output = coin - t1.getPrice();
		}else if (str.equalsIgnoreCase("�̿�����")) {
			output = coin - t2.getPrice();
		}else if (str.equalsIgnoreCase("Ŀ������")){
			output = coin - t3.getPrice();
		}else if (str.equalsIgnoreCase("ź������")) {
			output = coin - t4.getPrice();
		}*/
		for (int i = 0; i < arr.length; i++) {
			if (str.equals(arr[i].getName())) {
				output = coin - arr[i].getPrice();
			System.out.println("�����մϴ�. "+"�������� : " + arr[i].getName()+", �ܵ� : "+output);
			break ;
			}
		}
		
	}
		
}

