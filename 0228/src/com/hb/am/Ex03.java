package com.hb.am;

import java.util.Scanner;

//�������� (throws �������)
//���ܰ� �߻��ϸ� ���ܸ� ó���ϴ� ���� �ƴ϶�, ���� ��ü�� �ڽ���
//ȣ���� ������ ������. ���߿��� ����ó��(try~catch)�� �ϴ� ���� ����.
public class Ex03 {
	public void setData(String n) throws NumberFormatException{
		if(n.length()>=1){
			String str = n.substring(0, 1);
			prnData(str);
		}
	}
	public void prnData(String s) throws NumberFormatException{
		int dan = Integer.parseInt(s);
		System.out.println(dan+"��");
		for(int i=0; i<10; i++){
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	public static void main(String[] args) throws NumberFormatException {
		Ex03 test = new Ex03();
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("���� : ");
			String msg = scan.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("ù���ڴ� ���ڷ� �Է��ϼ���");
		}
		
	}
}
