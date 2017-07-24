import java.util.* ;

class Ex05_main

{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		Ex05 test = new Ex05() ;
		Ex05_2 test2 = new Ex05_2() ;
		
		//이름, 국어, 영어, 수학 받기
		System.out.print("이름 : ") ;
		String name = scan.next() ;
		System.out.print("국어 : ") ;
		int kor = scan.nextInt() ;
		System.out.print("영어 : ") ;
		int eng = scan.nextInt() ;
		System.out.print("수학 : ") ;
		int math = scan.nextInt() ;

		//합계구하는 메소드 호출
		int sum = test.sum1(kor, eng, math) ;

		//평균구하는 메소드 호출
		double avg = test.avg1(sum) ;

		//학점구하는 메소드 호출
        String hak = test.hak1(avg) ;

		//출력하는 메소드 호출
		test.print1(name, sum, avg, hak) ;
		System.out.println(":::::::::::::::::::::::::");
         test2.sum1(kor, eng, math);
		 test2.print1(name, sum, avg, hak);
	}
}
