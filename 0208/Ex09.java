class Ex09{
       
       public static void main(String[] args){
              //������ �迭 : 1���� �迭�� ������ ���� ��
              //                 ��������, ��������
              // 1.��������;
              // ���� : �ڷ���[][] �̸�;
                int[][]su;
              // ���� : �̸�=new �迭�ڷ���[1�����迭�� ��][1�����迭�� ������ �ִ� �迭�� ��]
                su = new int[3][2];
              // �ʱⰪ
                su[0][0] = 10;
                su[0][1] = 20;
                su[1][0] = 100;
                su[1][1] = 200;
                su[2][0] = 1000;
                su[2][1] = 2000;

              // ����� ������ �ѹ���
                int[][] su2 = new int[3][2];

              // ����� ������ �ʱⰪ�� �ѹ���
                int[][] su3 = { {10,20},{100,200},{1000,2000} } ;

                System.out.println("�ּ� : "+su3);
                System.out.println("�ּ� : "+su3[0]); //�������̶� �ּ�, 1�����̿����� �����
              // �߿�!!(���)
                
                for(int i=0; i<su3.length; i++){
                    for(int j=0; j<su3[i].length; j++){
                        System.out.print(su3[i][j]+"   ");
                    }
                    System.out.println();
                }

              System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

              //2.��������
              //�ڷ���[]�迭�̸�=new �ڷ���[1�����迭�� ��][] ;

               int[][] num = new int[3][] ;

              // �ʱⰪ =>�������Ҷ��� ������ ������ ����� �����߻�;
              // num[0][0] = 10;
              // num[0][1] = 20;
              // num[1][0] = 100;
              // num[1][1] = 200;
              // num[2][0] = 1000;
              // num[2][1] = 2000;

              //������num�� �� 1�����迭�� ������ ����
                int[] num1={10,20};
                int[] num2={100,200,300,400,500};
                int[] num3={1000,2000,3000};

              //������ ���� �迭�� �������迭�� �����Ѵ�.
                num[0]=num1;
                num[1]=num2;
                num[2]=num3;



              // �߿�!!(���)
                
                for(int i=0; i<num.length; i++){
                    for(int j=0; j<num[i].length; j++){
                        System.out.print(num[i][j]+"   ");
                    }
                    System.out.println();
                }

              System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");





       }

}