package com.hb.am;
class Ex03 
{
		private String name  = "������" ;    //�����ڰ� ������ �ʱⰪ
		private int age = 15 ;
		private String addr = "����" ;
		//������ : return type x, Ŭ���� �̸��� ����, ������� ���� �ʱ�ȭ
		//           �����ڴ� �����ε��� ����(��ü�� ����� ����� �پ��ϴ�.)
		public Ex03(String n){
				//name = "ȫ�浿" ;
				//age = 12 ; 
				//addr = "��û��" ;
				name = n ;
		}

		public Ex03(String n, int k){
				name = n ;
				age = k ;
		}

		public Ex03(int k, String n){
				name = n ;
				age = k ;
		}

		public Ex03(int k, String n, String m){
				name = n ;
				age = k ;
				addr = m ;
		}



		// getter ;
		public String getName(){
				return name ;
		}

		public int getAge(){
				return age ;
		}

		public String getAddr(){
				return addr ;
		}



}

	
