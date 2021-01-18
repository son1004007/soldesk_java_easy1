import java.util.Scanner;

public class Y0106 {

	private static final String String = null;

	public static void main(String[] args) {

//		String name = "kkk";
//		int age = 99;
//		float lng = 180.1f;
//		System.out.println(name + "\n"+ age +"\n" + lng);

//		Scanner sc = new Scanner(System.in); //		import java.util.Scanner;를 불러와서 사용
//		class 구조
//		클래스명 객체명 = new 클래스명();
//
//		int a,b;
//		System.out.println("a값 입력:");
//		a=sc.nextInt(); //.는 접근연산자 이다. 객체를 이용해 클래스에 해당하는 함수를 사용 가능하다.
//				
//		System.out.println("b값 입력:");
//		b=sc.nextInt();
//		
//		System.out.println("c값 입력:");
//		int c=sc.nextInt();
//		
//		System.out.println(a+b+c);
//		System.out.println(a + " " + b + " " + c);
//		
//		System.out.println("내이름 : ");
//		String name = sc.next(); // 문자, 문자열 next() 로 표시
//		
//		System.out.println(name);
		
//		// 두정수를 입력 받아 평균 출력하는 프로그램
//		System.out.println("두 정수를 입력하세요: ");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("평균은 "+(float)(a+b)/2);
//		System.out.println(a+ "+"+b+"은"+(a+b));
//		
//		int a=40;
//		System.out.println((float)a);
////		
//		float b =3.8f;
//		System.out.println((int)b); // 버림
//		System.out.println((int)(b+0.5)); // 올림
//		
//		
//		Scanner score = new Scanner(System.in);
//		String hak = score.next();
//		
//		System.out.println();
		
		// 키보드로 이름, 나이, 키 입력 받아 출력

//		Scanner x=new Scanner(System.in);
//
//		System.out.print("이름 : ");
//		String name = x.next();
//		
//		System.out.print("나이 : ");
//		int age = x.nextInt();
//		
//		System.out.print("키 : ");
//		double lng = x.nextDouble();
//		
//		System.out.println("이름 :" + name);
//		System.out.println("나이 :"+ age);
//		System.out.println("키 :"+ lng);
//		
//		int a=4;
//		double b=3*5/(float)a;
//		System.out.println(b);
//		double c=3*5/(double)a;
//		System.out.println(c);
//		
//		
//		int a=3, b=3, c=3;
//		a+=3;
//		b*=3;
//		c%=2;
//		System.out.println(a+""+b+""+c);
//		System.out.println(++a); // 전위 연산자. 출력(처리) 전에 a에 1을 증가시킨다.
//		System.out.println(a++); // 후위 연산자. 출력(처리) 후에 a에 1을 증가시킨다.
////		
//		Scanner a=new Scanner(System.in);
//		System.out.print("이름:");
//		String name = a.next();
//		
//		System.out.print("사는곳:");
//		String home = a.next();
//		
//		System.out.print("나이:");
//		int age = a.nextInt();
//		
//		System.out.print("키:");
//		double tll = a.nextDouble();
//				
//		System.out.print("공부 여부(true/false):");
//		boolean study=a.nextBoolean();
//		
////		boolean study=a.hasNext(String);
//				
//		System.out.println(name);
//		System.out.println(home);
//		System.out.println(tll);
//		System.out.println(study);
//		
		/*
		//1.10/4 한 결과값을 소수점까지 출력해라
		System.out.println("10/4 ="+ (float)10/4);
		
		//2.하나의 정수를 입력받아 그 수의 제곱을 구해라.
		Scanner i = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int m = i.nextInt();
		
		System.out.println("정수의 제곱" + m*m);
		
		//3.a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 printf로 출력해라.
		float a = 4.0f, b= 1.2f;
		
		System.out.printf(a+ "+" +b + "="+ (a+b)+"\n");
		
		//3-1. 앞에서 출력한 5.2를 소수점을 버려라. 
		System.out.println((int)(a+b));
		
		//4.Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("입력해라");
		String name = x.next();
		
		String home = x.next();
		
		int age = x.nextInt();
		
		float kg = x.nextFloat();
		
		System.out.println("내 이름은 "+name+"이다");
		System.out.println("사는 곳은 "+home+"이고, 나이는 "+age+"살이다");
		System.out.println("몸무게는 "+kg+"kg 이다.");
		
		
		*/
		
		//관계 연산자의 결과값
		// 비교 연산자
//		System.out.println('a'>'b');
//		
//		
//		int a = 100, b = 200;
//		System.out.println("a : "+a+"\nb : "+b);
//		
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a>=b);
//		System.out.println(a<=b);
//		
//		System.out.println("3!=2");
//		System.out.println(!(3!=2));
//		
//		System.out.println("(3>2)&&(3>4)");
//		System.out.println((3>2)&&(3>4)); // && 는 and를 의미한다. 2개의 명재가 모두 참이어야 참이다.
//		
//		System.out.println("(3>2)||(-1>0)");
//		System.out.println((3>2)||(3>4)); // ||는 or를 의미한다. 둘중 하나만 참이어도 참이다.
//		
//		// a =3 , b =4 // a=5 , b =5 // a 5 b 4 //a3 b3
//		
//		
//		int a=99;
//		if(a<98) { // 괄호가 없으면 참이면 아래 1줄 실행. 괄호가 있으면 참일때 괄호 안의 내용 실행. 거짓이면 아무것도 실행하지 않음.
//			System.out.println("a " +a+ "는 100보다 작군요");
//			System.out.println("a " +a+ "는 101보다 작군요");
//			System.out.println("끝");
//		}
		
		//두 정수 a=10, b=4로 초기화해서 a가 b보다 크면 a를 b로 나눴을 때의 몫, 그 이외조건은 a를 b로 나눴을 때의 나머지 출력

//		int a = 10, b =4;
//		if(a>b) {
//		System.out.println("a/b="+ (float)a/b);
//		}
//		else {
//		System.out.println("a%b="+ (float)a%b);	
//		}
//		
//		
//		//실수 2개 입력 받아 사칙연산 출력
//		//라이브러리 호출 import java.util.Scanner;
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("실수1를 입력하시오");
//		float m=tmp.nextFloat(); 
//		System.out.println("실수2를 입력하시오");
//		float n=tmp.nextFloat();
//		
//		System.out.printf("%.2f + %.2f = %.2f\n", m, n, m+n);
//		System.out.printf("%.2f - %.2f = %.2f\n", m, n, m-n);
//		System.out.printf("%.2f * %.2f = %.2f\n", m, n, m*n);
//		System.out.printf("%.2f / %.2f = %.2f\n", m, n, m/n);
//		
//		System.out.println("정수를 입력 하세요");
//		Scanner tmp = new Scanner(System.in);
//		int a = tmp.nextInt();
//		
//	
//		if(a%2==0) {
//			System.out.println("짝수");
//			
//		}
//		else //a%2!=0
//			System.out.println("홀수");
//				
//		
		
//		System.out.println("나이를 입력하세요");
//		Scanner tmp = new Scanner(System.in);
//		int age = tmp.nextInt();
//		
//		if (age >= 30) {
//			System.out.println("30살 이상");
//			
//		}
//		else if(age>=20) {
//			System.out.println("20살 이상");
//		}
//		else {
//			System.out.println("성인 아님");
//		tmp.close();
//		}
		
		
		
	}
}
