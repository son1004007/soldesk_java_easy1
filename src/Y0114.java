import java.util.Scanner;
public class Y0114 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		double aray[] = {10.1,20,30,40,50.1};
		
		double sum=0;
		for(double i : aray) {
			sum+=i;
			
		}
		System.out.println(sum);
*/		
/*		
		//5.1) 3행 3열 배열을 0~8까지정수로 초기화해라.
		int array2[][] = new int[3][3];
		int a =0;
		for (int i = 0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {

				array2[i][j] += a;
				System.out.print(array2[i][j]+ " ");
				
				a++;
			}
			System.out.println();
		}
		
*/		
		
/*		
		//5.2) 2행 3열 배열을 a~f까지문자로 초기화해라.
		char array3[][] = new char [2][3];
		char cha = 'a';
		
		for (int i = 0 ; i<array3.length ; i++) {
			for (int j=0 ; j<array3[i].length ; j++) {

				array3[i][j] += cha;
				System.out.print(array3[i][j]+ " ");
				
				cha++;
			}
			System.out.println();
		
		}*/



		
//		1. 3행 4열의정수형 배열을 생성하여  0~9 범위의정수를 랜덤하게 저장한다.
//
//		저장후 2차원 배열과 합을 출력해라.
//
//		실행결과) 5 4 1 5
//
//		          0 5 3 5
//
//		          7 8 1 4
//
//		합은 48 
/*		
		int array[][] = new int[3][4];
		int sum =0;
		for (int i = 0 ; i<array.length ; i++) {
			for (int j=0 ; j<array[i].length ; j++) {

				array[i][j] += (int)(Math.random()*10);
				System.out.print(array[i][j]+ " ");
				sum+=array[i][j];

			}
			
			System.out.println();
		
		}
		System.out.println("합은" + sum);
*/		
		
//		page 314 해보기 실습9-10 메소드 호출
		// 컴퓨터 처리는 void main 코드부터 시작한다.
		// 매소드 class가 void main 보다 위에 있다고 해서, 먼저 시작되지 않는다.
		// 메소드 class : 커피 만들기 , void main : 커피 주문 


	
		
		
		//page 321 9-13
		int hap;
		hap = plus(100,200); // 함수 호출 
		System.out.println("100 과 200의 plus 메소드는  : "+hap);
		
		
		
		//임의실습1
		System.out.println("시작");
		pro(52);
		pro(23);
		System.out.println("끝");
		
		
		//임의 실습2
		double k = 164.5;
		pr(123,156.6);
		pr(125,k);
		show();
		
		
		
		//임의 실습3
		System.out.println("원의 넓이 : "+area(5.5));
		System.out.println("원의 둘레 : "+round(3.2));
		//넓이 : 3.14 * 반 * 반
		//둘레 : 3.14 * 2 * 반
		
		
		
		
		String array[][] = {{"book","책"},
							{"water","물"},
							{"note","노트"}};
			
		
		Scanner tmp = new Scanner(System.in);
		
		for (int i =0 ; i<array.length ; i++) {
				
			System.out.println(array[i][0] + "이뜻은 ?");
			String mean = tmp.nextLine();
				
			if (mean.equals(array[i][1])) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("오답입니다.");
			}
				
		}
		
		//////////////////////////////점심 식사 이후 main
		
		meter1(176); // 함수 호출 1
		
		
		System.out.println(meter2(176)); // 함수 호출 2
		
		double a; // 저장공간 변수를 바로 설정.
		a = meter2(176); // 함수 호출 3
		System.out.println(a);
		
		
		//출력을 main에서 할지 method에서 할지 선정해야 한다.
		//method에서 출력하면 method를 반환형을 void로 만들고 main에서 호출만 한다.: 함수 호출 1
		//main에서 출력하면 반환형을 지정하고, method에서 return : 함수 호출 2
		//
		
		
		//메소드 연습1
		total(1,10);
		total(1,100);
		
		
		//메소드 연습 1-1
		System.out.println(total1(1,10));
		System.out.println(total1(1,100));
		
		
		//지역변수와 전역변수
		//지역변수 : 메서드 안에서, 전역변수 : 메서드 밖에서
		//전역변수보다 지역변수의 우선순위가 높다
		//전역변수보다 지역변수의 우선도가 높다.
		
		
		func1();
		System.out.println(tt);
		
		
		
		//지역 변수는 지역에서만 사용된다.
		int aa =0;
		in();
		System.out.println(aa);
		
		
		//page 328
		
		
		int a99=10;
		
		func1(a99);
		System.out.println("func1() 실행 후 a99 는 : " + a99);
		
		System.out.println(multi1(2,10));
		
		
		
		int a98[] = new int[7];
		Scanner tmp99 = new Scanner(System.in);
		
		//정수 7개 입력
		for (int b99=0 ; b99 <7 ; b99++) {
			System.out.println("정수 7개 입력");
			a98[b99] = tmp99.nextInt();
			
		}
		System.out.println(big99(a98));
		//매개변수가 배열명일때
		//배열을 호출할때 배열명만 적으면된다. 배열 인덱스를 적으면 안된다.
		//배열을 선언할때는 인덱스까지
		
		
		/////////////////////////////
		
		
		//삼항조건 연산자로 아래를 작성
		//10이 큰지 20이 큰지 삼항조건연산자로 출력
		// 10이 크면 10이크다
		// 20이 크면 20이크다.
		
		// 참이면 ? 뒤가 실행. 거짓이면 :뒤가 실행
		String intiger =(20>10)?"20이 크다":"10이 크다";
		System.out.println(intiger);
		
		
		
		
		System.out.println(big97(5.5,6.5));
		
		
		System.out.println("실수 2개를 입력받으면 2개중 큰 값을 출력한다");
		System.out.println("메소드 호출을 이용한 입력값 비교");
		System.out.println("메소드는 삼항연산자를 이용하고 있다.");
		double src99 = tmp99.nextDouble();
		double src98 = tmp99.nextDouble();
		System.out.println(big97(src99,src98));
		
		
		// 실습
//		Scanner tmp = new Scanner(System.in);
		System.out.println("+ 또는 -를 입력하세요");
		char c99 = tmp.next().charAt(0);
		System.out.println("1번정수 입력하세요");
		int a88 = tmp.nextInt();
		System.out.println("2번정수 입력하세요");
		int b88 = tmp.nextInt();
		
		cal(c99,a88,b88);
		
		// 정수 입력받아 출력하는 함수
		// 함수명은 in
		
		System.out.println("정수 입력받아 출력하는 함수");
		System.out.println("1번 정수를 입력하세요");
		int i23= tmp.nextInt();
		System.out.println("2번 정수를 입력하세요");
		int i24 = tmp.nextInt();
		
		in22(i23,i24);
		
		System.out.println(in23(i23,i24));
	}
		
			
	
		
	//page 321 9-13
	
	static int plus(int v1, int v2) { //구문 : static(공유한다는 의미) 반환형 함수명(매게변수)
		int result;
		result = v1+v2;
		return result;
	}
	
	//임의실습1
	//void는 반환형이 없다. 출력할때, 반환형이 필요 없다. void는 비어있는 을 의미한다.
	 static void /*int*/ pro(int age) {
		System.out.println("안녕");
		System.out.println("나이는 "+age+"이다");
	}
	 
	 // 임의실습2
	 //public은 공유
	public static void pr(int  id, double ki) {
		System.out.println(id);
		System.out.println("키"+ki);
	}
	
	//반환형이랑 메개변수 형태랑 같아야 한다.
	public static void show() {
		System.out.println("그럼 이만");
	}
	
	
	//임의 실습3
	public static double area(double r) {
		// 넓이
		return r*r*3.14;
	}
	
	static double round(double r) {
		return r*2*3.14;
	}
	
	/*
	 * 이용현님에게 답변
page 313
System.out.printf() 도 메소드 입니다.
어떤 일을 해주는 기능을 메소드라고 생각하시면 됩니다.

실습했던 예제들은
(정수값 입력받아 합계 반환, 나이 출력문, 키 출력문, 원 넓이, 지름 구하기)

메소드를 배우기전 
public static void main(메인 함수)에 모든 기능(객체)을 다 작성했던 것을

메소드를 배운 후
public static void main(메인 함수)과 public static void [메소드명]으로 나누어
기능(객체:계산)을 호출해서 사용한다는 내용 입니다.





1) public(공개) static(공유)도 공유고 static도 공유 인데 차이점이 있나요?
답변 :  뒤 섹션에서 설명합니다.
public(공개) static(공유)도
함수 자체를 공개하겠다.
public의 반대 개념 private
다른 패키지 또는 다른 소스파일에 함수를 공개하겠다.


2) 함수:function과 메서드:method 용어가 햇갈립니다. 
page 313 TIP의 내용.
다른 언어에서는 메소드를 함수(라고도 부른다. 엄밀히 구분하자면, 클래스 안에 존재해야 하는 함수를 메소드라고 하는데, JAVA의 함수는 무조건 클래스 안에 존재하기 때문에 결국 모든 함수가 메소드가 되는 것이다.

점심시간
	 */
	
	
	
	// 
	public static void/*반환형*/ meter1 (int n){
		System.out.println(n/100.0);
		
	}
	
	public static double/*반환형*/ meter2(int n) {
		return n/100.0;
	}
	
	
	
	

	// 메소드 연습1
	public static void total(int n, int m){
		int sum=0;
		for (int a=n ; a <=m ; a++) {
			sum+=a;
		}
		System.out.println(sum);
			
	}
	
	// 메소드 연습1-1
	public static int total1(int n, int m) {
		int sum =0;
		for (int a=n ; a <=m ; a++) {
			sum+=a;
		}
		return sum;
	}
	
	static int tt =100;
	
	static void func1() {
		int tt = 200;
		System.out.println(tt);
	}
	
	
	static void in() {
		int aa =10;
		System.out.println(aa);
	}
		
	
	static void func1(int a99) {
		a99 = a99+1;
		System.out.println("전달 받은 a99는 : "+ a99);
	}
	
	static int multi1(int a, int b) {
		int mul=1;
		for (int c=1 ; c<=b ; c++) {
			mul=mul*a;
		}
		return mul;	
	}
	
	
	//교재에 없는 배열 메소드
	//배열을 선언할때는 인덱스까지
	static int big99 (int array[]) {
		int max = 0;
		for (int i = 0 ; i < array.length ; i++) {
			if(max < array[i]) {
				max=array[i];
			}
			
		}
		return max;
	}
	
	static String big97 (double a, double b) {
		// 참이면 ? 뒤가 실행. 거짓이면 :뒤가 실행
		String n =(a>b)?"앞에 값이 크다 : "+a:"뒤에 값이 크다 : "+b;
		return n;
	}
	

	static void cal(char a, int b, int c) {

		switch (a) {
		case '+' : 
			System.out.println(b+"" +a+""+c +"="+(b+c)); 
			break;
		
		
		case '-' : 
			System.out.println(b+"" +a+""+c+"="+(b-c)); 
			break;
		
			
			
		}
	}
	
	static void in22(int a, int b) {
		System.out.println("정수 1 : "+a);
		System.out.println("정수 2 : "+b);
	}
	
//	변수명을 abc 만 사용하시면서
//	코드를 중간중간 지우면서 수업하지만
//
//	나는 그대로 쓰니까
//	a1~99까지 늘어난다 ㅋㅋ
	
	static String/*변수 형태는 반환값에 맞춰서 작성*/ in23(int a, int b) {
		Scanner tmp = new Scanner(System.in);
		a= tmp.nextInt();
		b= tmp.nextInt();

		String str = "정수 1 : " +a + " 정수 2 : " +b;
		return str;
	}
}



