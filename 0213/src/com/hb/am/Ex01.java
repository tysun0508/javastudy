package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		//�Ͻ��� ��ü ����
		String s1 = "korea" ;
		String s2 = "korea" ;
		//����� ��ü ����
		String s3 = new String("korea") ;
		String s4 = new String("korea") ;
		
		//��ü == ��ü : ������ ���İ� ���°� �ƴϰ� �����ּҰ� ���İ� ���°��̴�.
		//�ڷ��� == �ڷ��� : ������ ���İ� ���°��̴�.
		if(s1==s2){	
			//���Ǯ�̶�� ������ s2�� �����Ҷ� s1�� �̹� ��ϵǾ� �����Ƿ�
			//s1�� �ּҸ� �����ϰ� �ȴ�.
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		if(s3==s4){
			System.out.println("����");
		}else{
			//new��� ���� ����ϸ� �׻� heap �޷θ��� ���ο� ������ �����ϰ� ��ü�� ����
			System.out.println("�ٸ���");
	    }
		// format() => ������ �����ϰ� ���Ŀ� ���� ����
		
		//printf�� ���� �Ҽ��� ��°���
		String s5 = "hanbit" ;
		String s6 = "hanbit" ;
		String s7 = String.format("%20s, %s", s5, s6);
		System.out.println("s7 : " + s7);
		//s=> ���ڿ�, d=>���� , f=>�Ǽ�
		int su = 314 ;
		float su2 = 3.445f ;
		double su3 = 3.5455 ;
		double su4 = 125.124 ;
		System.out.printf("%s, %3d, %.0f, %.0f,", s5,su,su2,su3);
		System.out.println();
		
		// split("������") => ���ڿ��� �迭�� ������.
		// split("������", ����)=>���ڴ� �迭�� ũ�⸦ ����.
		String s8 = "Happy day 2017 02 13" ;
		String[ ] s9 = s8.split(" ") ; //���⸦ ������ split
		
		//�迭�� ������ for��  //Ư�� ������ for���� �������
		for (int i = 0; i < s9.length; i++) {
			System.out.println(i + " : " +s9[i]);
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		//������ for�� ����
		//for (�迭�� �ڷ��� ����Һ��� : �迭) {   }
		for (String k : s9) {
			System.out.println(k);
		}
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		String[] s10 = s8.split(" ", 4) ;
		for (int i = 0; i < s10.length; i++) {
			System.out.println(i + ": "+s10[i]);
		}
	
	
	}
}
