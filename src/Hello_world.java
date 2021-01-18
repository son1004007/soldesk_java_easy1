
public class Hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.out.println("Hello world");
//		System.out.println(10);
//		System.out.println(3.14);
//		//print ln 의 ln이 라인 변경이다
//		System.out.println("피자는" +20000+ "원이다");
//		
//		System.out.printf("10\n");
//		System.out.printf("%d\n", 10);
		/*
		printf에서 서식 종류
		%d 정수
		%f 실수, 소수점 여섯 자리 수까지 표시
		%.2f 실수, 소수점 두자리 수까지 표시
		%s 문자열
		%c 문자
		*/
		
//		System.out.printf("%d\n", 10);
//		System.out.printf("%f\n", 3.14);
//		System.out.printf("%c\n", 'A');
//		System.out.printf("%s\n", "kkk");
//		System.out.printf("%d\n", 100+100);
//		System.out.printf("%d\n%d\n", 100, 200);
//		System.out.printf("%d\n%.2f\n", 100, 3.14);
//		//System.out.printf("%.1f", 0.5);
//		
//		System.out.printf("%d/%d = %.1f\n", 100,200,0.5);
//		
//		int num1=100, num2=200;
//		System.out.println(num1 + "/" + num2+ "=" + ((float)num1/num2));

		/*char name;
		int age;
		float eye;*/
		
		/*
		System.out.printf("%s, %d, %.1f, %c\n","kkk",34,1.0,'A');
		
		int age = 34;
		double leg = 180.1;
		String name = "kkk";
		char score = 'A';
		
		System.out.printf("%d %.1f %s %c\n", age, leg, name, score);
		
		double eng=100, kor=95;
		//int eng=100, kor=95;
		//소수점 첫째자리 까지 평균 출력을 위해 int를 double로 변경함.
		//또는 int를 그대로 사용하고 아래와 같이 바꿀 수 있음.
		//System.out.printf("%.1f", (eng+kor)/2.0);
		//정수(eng+kor)와 정수(2)의 연산은 정수만 나온다고 설정되어 있기 때문에 실수(%.1f) 출력을 못함.
		//정수(eng+kor)와 실수(2.0)의 연산으로 변경하여, 실수(%.1f)가 표시되도록 변경
		System.out.printf("%.1f", (eng+kor)/2);
		*/
//		
//		int a = 30;
//		double b = 30; // 자료형 실수
//		//float는 소수점 아래 9자리
//		//double은 float의 두배 소수점 아래 18자리
//		System.out.println(a);
//		System.out.println(b);
//		String c = "tom";
//		
//		System.out.println(c + "은 " + a +"살"); //println은 문자열을 +을 이용해서 출력
//		System.out.printf("%s은 %d살", c, a); //printf는 서식 문자를 이용해서 변수를 출력
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123); // 5자리를 확보 후 오른쪽 정렬 XX123
		System.out.printf("%-5d\n",123); // 5자리를 확보 후 왼쪽 정렬 123XX
		System.out.printf("%05d\n",123); // 5자리를 확보해서 0으로 채우고 오른쪽 정렬
		System.out.printf("%f\n",123.45);
		System.out.printf("%7.1f\n",123.45); // 7자리 확보 후 오른쪽 정렬하되, 소수점 1자리까지
		System.out.printf("%7.3f\n",12345.45); // 7자리 확보 후 오른쪽 정렬하되, 소수점 3자리까지
		
//		문제
//		국어 70, 영어 80, 수학 90 으로 초기화(=변수에 값을 입력. null에 값을 넣어서)해서 
//		각각의 점수와 총점을 출력
		
//		int han=70, eng=80, math=90;
//		System.out.println("국어 : "+han+" 영어 : "+eng+" 수학 : "+math+" 총점 : "+(han+eng+math));
		
//		int a;
//		System.out.println("%d",a); 변수 값 입력안하고 출력하는 방법이 있었는데..

//		int a=(int)123.123f; // a=123 내가 원하는 자료값 앞에 자료형태를 작성해서 사용.
//		float b=100;
//		
//		System.out.println(a);
//		System.out.println(b);
//	
//		int a,b ;
//		float c, d ;
//		a = 100;
//				b= a;
//		System.out.println(b);
//	
////		123.00 소숫점도 자릿수에 포함된다.
//		float 4byte, int 4byte
		
//		int a=10, b =20;
////		float r=a/b;
//		float r=a/(float)b;
//		System.out.printf("%f\n\n\n\n",r);
//	
//	
//	// 정수 연산과 정수연산은 정수가 출력된다.
//		// 실수가 하나라도 들어가면 실수가 된다.
//		System.out.println(1+2.0);
//		System.out.println(2/(float)3);
//		System.out.println((float)10/3);
//		System.out.println(10.0/3);
//		
		int a=2, b=3, c=4;
		int r1,r2,r3;
		float r4;
		
		r4=a*b/(float)c;
		
		System.out.println(r4);
		//double(8byte, 소수점아래 18자리)은 float(4byte, 소수점 아래 9자리)의 소숫점(배열)을 두배로 갖는다는 의미 입니다.
	
		r3=c%b;	//나머지 연산자
		System.out.println(r3);
		
		//아스키코드 설명 https://ko.wikipedia.org/wiki/ASCII
		
		char ch ='a';
		char ch1 = 97; // a의 아스키코드(10진법)가 97임. 
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch1);
	
		ch1=(char)(ch+1); // a의 강제 형변환
		// 강제 형변환 하다가 혼난 기억이 있는데 어떤 상황이었는지 기억이 안나네..
		
		char ch2=90; // 아스키코드 90은 Z
		System.out.println(ch2);
		
		boolean t,f ; // 부울대수 참1 거짓0만 가능
		
		f=(10==20);
		System.out.println(f);
		
		
		System.out.println(10);
		System.out.printf("%d\n", 10);
		System.out.printf("%.6f\n", Math.PI);
		System.out.printf("%.1f\n", 3.45);
		System.out.printf("%.10f\n",3.4);
		int n=10,m=20;
		System.out.printf("%d과 %d의 합은 %d 입니다.",n,m,n+m);
		String name= "홍길동", address="33-44";
		
		int age = 30;
		
		
		System.out.println("저의 이름은 "+name+"입니다.");
		System.out.println("제 나이는 "+age+"살 이고, 주소는 "+address+"번지 입니다.");
		
		
	
	
	
	
	}

}