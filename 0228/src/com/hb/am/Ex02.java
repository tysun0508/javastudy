package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���� catch�� : try �������� �Ѱ��� Exception�� �߻��ϴ� ���� �ƴ϶�
//				  �������� Exception�� �߻������� ��� ������
//				  Exception�� ó���ϰ��� �� �� ���
// try{
//	���� �߻� ������ ����;
// }catch(���ܰ�üe){
//	���ܹ߻��� ó������ ;
// }catch(���ܰ�üe){
//  ���ܹ߻��� ó������ ;
// }catch(���ܰ�üe){
// ���ܹ߻��� ó������ ;
// }
// ���ǻ��� : �ֻ��� Ŭ������ Exception �� ����� ���
//			  �ݵ�� ���� �Ʒ� �ʿ� catch���� ���

public class Ex02 {
	public static void main(String[] args) {
		try{
			int var = 50 ;
			Scanner scan = new Scanner(System.in);
		
			System.out.print("�����Է� : ");
			int data = scan.nextInt();
		
			System.out.println("���� : " + (var/data));
				
		}catch(Exception e){
			System.out.println("�����߻� : "+ e);
		}
	}
}
