import java.io.IOException;
import java.util.Scanner;
public class Y0118_prc1 {
static 	Scanner tmp = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
//		1. 정수 10개를 입력받아 배열에 저장한 후, 배열을 검색하여 4의 배수만 골라 출력하는 프로그램
		System.out.println("1번 문제 정수 3개를 입력받아 배열에 저장한 후, 배열을 검색하여 4의 배수만 골라 출력하는 프로그램");
		int array[] = new int[3];

		int i=0;
		for (i = 0 ; i<3 ; i++) {
			System.out.println("array ["+i+"]에 들어갈 정수를 입력하세요.");
			array[i]= tmp.nextInt();
			}
		
		for (i = 0 ; i<3 ; i++) {
			if (array[i]%4==0) {
				System.out.println("array ["+i+"]에 4의 배수 "+array[i]+"가 있습니다.");
			}
			else {
				System.out.println("array ["+i+"]에 4의 배수가 아닙니다. : "+array[i]);
			}
		}
		
		
		
		
		//2. 정수 a=50, b=150으로 초기화해서 a가 b보다 크면 a와 b의 곱, 아니면 a를 b로 나눴을 때의 나머지 출력(삼항 조건 연산자 활용)
	
		System.out.println("2번 문제 정수 a=50, b=150으로 초기화해서 a가 b보다 크면 a와 b의 곱, 아니면 a를 b로 나눴을 때의 나머지 출력(삼항 조건 연산자 활용)");

		double a = 50, b=150;
		double ab = a>b ? a*b : a%(double)b;
		
		System.out.println(ab); // a%b 값 0.3


		
//		3. 1부터 100이하의 자연수 중에서 2의 배수이고 7의 배수인 숫자를 출력하고, 출력된 숫자의 합을 출력(while문 이용)

		System.out.println("3번 문제 for문");
		int sum =0;
		for(int c=1; c <=100 ; c++) {
			if(c%2==0 && c%7==0) {
//				System.out.println("2의 배수이고 7의 배수인 숫자 : "+c); //점검용
				sum +=c;
			}
			
		}
		System.out.println("합 : "+sum);
		
		System.out.println("3번 문제 while 문");
		int sum2=0, c2=1;
		while (c2<=100) {
			if(c2%2==0 && c2%7==0) {
//				System.out.println("2의 배수이고 7의 배수인 숫자 : "+c2);// 점검용
				sum2 +=c2;
				
			}
			
			c2++;
		}
		System.out.println("합 : "+sum2);

//		4. 정수를 입력받아 짝수이면 “짝수”, 홀수이면 “홀수” 라고 출력해라.
//		정수를 입력하지 않은 경우에만 프로그램을 종료시켜라.(try-catch 사용)

		

		while(true) {
			try {
				System.out.println("정수를 입력 하세요");
				int d = tmp.nextInt();
				if (d==0) {
					System.out.println("0은 안됩니다.");
					break;
				}
				else if (d%2==0) {
					System.out.println("짝수");
				}
				else {
					System.out.println("홀수");
				}
				
				
				
			}catch(Exception e){
				System.out.println("정수를 입력하지 않았습니다.");
				break;
			}
		
		}
*/		
//		5. 무한루프안에 두 정수를 입력받아 합을 구하고, 실수를 입력하면 “실수는 안된다”라고 출력하고, 다시 두 정수를 입력받는 코드를 작성해라.
//
//		실행 결과) 두 정수 입력: 3 3.5
//
//		           실수는 안된다
//
//		           두 정수 입력: 3 5
//
//		           답: 8 
		
/*	
		while(true) {
			int sum5=0;
			try {
				System.out.println("정수2개를 입력하세요.");
				int a5 = tmp.nextInt();
				int b5 = tmp.nextInt();
				sum5 = a5+b5;
				System.out.println("합:"+sum5);
				break;
				
			}catch (Exception e) {
				System.out.println("다시 입력");
				tmp.nextLine(); // 이거 몰랐음.
				//이 스캐너를 현재 줄을 넘어서 진행하고 건너 뛴 입력을 반환합니다.
				continue;
			}
			
		}
*/		
		
		System.out.print("t1 next 입력 : ");
		String t1 = tmp.next();
		System.out.println("t1 next 출력 : "+t1);
		
		System.out.print("t2 next 입력 : ");
		String t2 = tmp.nextLine();
		System.out.println("t2 nextLine 출력"+t2+""+t1+
				"은 스캐너의 현재 줄을 넘어서 진행하되 (버퍼 값이 초기화)된(skipped) 입력을 반환합니다.");

		System.out.print("t3 next 입력 : ");
		String t3 = tmp.next();
		System.out.println("t3 next 출력 : "+t3);

		System.out.print("t4 next 입력 : ");
		String t4 = tmp.nextLine();
		System.out.println("t4 nextLine 출력"+t4+""+t1+""+t3+" Advances this scanner past the current line and returns the input that was skipped.");

		
		
//
//		 
//
//		6. func함수 작성하기.(키보드로 입력한 양수를 5로 나누어 몫과 나머지를 변수에 저장하기)
		// 수를 5로 나누어 몫과 나머지
/*
		int a6,b6,c6;
		

		System.out.println("몫 나머지 구하기 1번째");
		System.out.println("정수를 입력하세요");
		a6 = tmp.nextInt();
		b6 = a6/5; // 몫
		c6 = a6%5; // 나머지
		

		func(b6,c6); //b->몫, c-> 나머지
		
		System.out.println("몫 나머지 구하기 2번째");
		System.out.println("정수를 입력하세요");
		int d6 = tmp.nextInt();
		func2(d6);
*/		
		
//
//		​
//
//		실행결과) 양수 입력: 8
//
//		몫 : 1, 나머지: 3
		
		
		
		
	}
	static void func(int a, int b) {
		System.out.print("몫 : "+a+", ");
		System.out.println("나머지 : "+b);
		
	}
	
	static void func2(int a) {
		int b = a/5;
		int c = a%5;
		System.out.print("몫 : "+b+", ");
		System.out.println("나머지 : "+c);
	}

}
