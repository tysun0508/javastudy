import java.util.*;
class Ex04{
    public static void main(String[] args){
       
        //������ �߻��ϴ� Ŭ���� : Math.random(), Random()
        // 1. Math.random() : double => 0.0~1.0�̸��� ���� �߻�


           double res1=Math.random();
           System.out.println("��� : "+res1);

        //������ �����ϱ� : (int)(Math.random() * ����) = 0~������������ ���� �߻�
        int res2 = (int)(Math.random()*7);  //0~6����
        System.out.println("��� : "+res2);
 

        //Random Ŭ���� �̿��ϱ� ���� (����, ����)
        
        Random ran=new Random();
        System.out.println("ran���ּ�:"+ran);

        //�� �ڷ��� ���� Random ������ ���� : nextXXXX(�ڷ���)
        // nextBoolean() : true, false
        // nextDouble(), nextFloat(), nextInt(), nextLong() �� �ڷ����� ũ�⸸ŭ �������� ����

        System.out.println("���� : " +ran.nextBoolean());
        System.out.println("���� : " +ran.nextDouble());
        System.out.println("���� : " +ran.nextFloat());
        System.out.println("���� : " +ran.nextInt());
        System.out.println("���� : " +ran.nextLong());

        //Ư�� ������ �����ϴ� ��� ; ran.nextInt(����=����):0~����������
       
        System.out.println("���� : " +ran.nextInt(7));


    }

}