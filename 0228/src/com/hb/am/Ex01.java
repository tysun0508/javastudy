package com.hb.am;

// ����ó�� : try~catch~
// try{
//		���� �߻� ������ ����;
//	}catch(���ܰ�üe){
//		���ܹ߻��� ó������ ;
//	}
// ���� : ���ܰ� �߻��Ǹ� ���������� ������ �ȴ�.
//		  ����ó���� ���������� ���Ḧ �������� ����� �����ϰ�
//		  ���ܹ߻��� ���ܸ� ó���Ѵ�.
//		  ���ܹ߻����� �Ʒ��� �����ϴ� ��ɾ���� �����ϰ�
//		  �ٷ� catch������ �̵��ȴ�.

public class Ex01 {
	public static void main(String[] args) {
		try{
			int[] var = {10,200,30};
			for(int i=0 ; i<=3; i++)
				System.out.println("var["+i+"]:"+var[i]);
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�迭�� �Ѿ����ϴ�.");
		}	
		System.out.println("���α׷� ��!");
		
	}
}
