class Ex09{
       
       public static void main(String[] args){
              //다차원 배열 : 1차원 배열이 여러개 모인 것
              //                 고정길이, 가변길이
              // 1.고정길이;
              // 선언 : 자료형[][] 이름;
                int[][]su;
              // 생성 : 이름=new 배열자료형[1차원배열의 수][1차원배열이 가지고 있는 배열의 수]
                su = new int[3][2];
              // 초기값
                su[0][0] = 10;
                su[0][1] = 20;
                su[1][0] = 100;
                su[1][1] = 200;
                su[2][0] = 1000;
                su[2][1] = 2000;

              // 선언과 생성을 한번에
                int[][] su2 = new int[3][2];

              // 선언과 생성과 초기값을 한번에
                int[][] su3 = { {10,20},{100,200},{1000,2000} } ;

                System.out.println("주소 : "+su3);
                System.out.println("주소 : "+su3[0]); //다차원이라서 주소, 1차원이였으면 값출력
              // 중요!!(출력)
                
                for(int i=0; i<su3.length; i++){
                    for(int j=0; j<su3[i].length; j++){
                        System.out.print(su3[i][j]+"   ");
                    }
                    System.out.println();
                }

              System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

              //2.가변길이
              //자료형[]배열이름=new 자료형[1차원배열의 수][] ;

               int[][] num = new int[3][] ;

              // 초기값 =>컴파일할때는 오류가 없지만 실행시 오류발생;
              // num[0][0] = 10;
              // num[0][1] = 20;
              // num[1][0] = 100;
              // num[1][1] = 200;
              // num[2][0] = 1000;
              // num[2][1] = 2000;

              //다차원num에 들어갈 1차원배열을 별도로 만듬
                int[] num1={10,20};
                int[] num2={100,200,300,400,500};
                int[] num3={1000,2000,3000};

              //별도로 만든 배열을 다차원배열에 연결한다.
                num[0]=num1;
                num[1]=num2;
                num[2]=num3;



              // 중요!!(출력)
                
                for(int i=0; i<num.length; i++){
                    for(int j=0; j<num[i].length; j++){
                        System.out.print(num[i][j]+"   ");
                    }
                    System.out.println();
                }

              System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");





       }

}