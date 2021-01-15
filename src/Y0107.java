import java.util.Scanner;
public class Y0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("이름 입력");
//		String name = tmp.next();
//		
//		System.out.println("나이 입력");
//		int age = tmp.nextInt();
//		
//		System.out.println("키 입력");
//		double ki =tmp.nextDouble();		
//		
//		System.out.printf(name+ " " +age+ " " +ki+ " ");
//		tmp.close();
		
		
//		int a=10;
//		if(a<30) {
//			System.out.println("a");
//		}
//		else if(a<20) {
//			System.out.println("a<20");
//		}
//		else if(a<10) {
//			System.out.println("c");
//		}
//		
//		else {
//			System.out.println("d");
//		}
		
		
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("첫번째수 입력하세요");
//		double a = tmp.nextDouble();
//		
//		System.out.println("연산자 입력하세요");
//		String z = tmp.next();
//		
//		System.out.println("두번째 수 입력하세요");
//		double b = tmp.nextDouble();
//		
//		if(z.equals("+")) { // equals 함수는 문자열 비교할때 사용한다.
//			System.out.println(a+b);
//		}
//		else if(z.equals("-")) {
//			System.out.println(a-b);
//		}
//		else if(z.equals("*")) {
//			System.out.println(a*b);
//		}
//		else if(z.equals("%")) {
//			System.out.println(a%b);
//		}
//		else if(z.equals("/")) {
//			System.out.println(a/b);
//		}
//		else {
//			System.out.println("연산자를 + - * % / 중에 입력하세요");
//		}
		
//		Scanner scr = new Scanner(System.in);
//		
//		System.out.println("성적을 입력하세요");
//		int score = scr.nextInt();
//		
//		
//		System.out.println("당신의 성적은");
//		
//		if (score >= 90) {
//			System.out.println("A");
//		}
//		else if(score >=80) {
//			System.out.println("B");
//		}
//		else if(score >=70) {
//			System.out.println("C");
//		}
//		else {
//			System.out.println("F");
//		}
//		
//		scr.close();
//		

//		Scanner scr = new Scanner(System.in);
//		
//		System.out.println("성적을 입력하세요");
//		int score = scr.nextInt();
//		
//		char grade;
//		System.out.println("당신의 성적은");
//		
//		if (score >= 90) {
//			grade = 'A';
//		}
//		else if(score >=80) {
//			grade = 'B';
//		}
//		else if(score >=70) {
//			grade = 'C';
//		}
//		else {
//			grade = 'F';
//		}
//		
//		System.out.println(grade);
//		scr.close();
		
//		Scanner tmp = new Scanner(System.in);
//		
//		System.out.println("나이를 입력하세요");
//		int age = tmp.nextInt();
//		
//		if (age >= 30) {
//		System.out.println("30대 이상");
//		}
//		else if (age >= 20) {
//			System.out.println("20대");
//		}
//		else {
//			System.out.println("10대");
//		}
//		tmp.close();
		
		
//		Scanner tmp = new Scanner(System.in);
//		
//		// 키가 187.5 이상이고 몸무게가 80.0 이상이면 ok 출력
//		
//		System.out.println("키 입력");
//		double tall = tmp.nextDouble(); 
//		
//		System.out.println("몸무게 입력");
//		double kg = tmp.nextDouble();
//				
//		
//		if (tall>=187.5 && kg>=80) {
//			System.out.println("ok");
//		}
//		else
//			System.out.println("not ok");
//		
//		tmp.close();
		
		
		
		// 하나의 정수를 입력 받아 3의 배수이고 4의 배수인 수들만 출력
				
		
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("3과 4의 공배수를 입력하시오");
//		int n = tmp.nextInt();
//		
////		if (n%12 == 0)
//		if (n%3==0 && n%4==0)
//			System.out.println("3과 4의 공배수 "+n+"입니다.");
//		else
//			System.out.println("3과 4의 공배수가 아님");
//		
//		tmp.close();
			
		// 예상 문제 a=20, b=40 false
//		
//		int age =25, kg =60;
//		char size;
//		
//		if(age < 20)
//		{
//			if(kg<50) {
//				size='S';
//			}
//			else if (kg<60)
//				size='M';
//			else
//				size='L';
//		}
//		else {
//			if(kg<60)
//				size ='s';
//			else if(kg<70)
//				size ='m';
//			else
//				size ='L';
//			
//		}
//		System.out.println(size);
		
		// 총점 300으로 초기화, 세과목의 평균을 초기화, 평균이 90 이상 A 80이상B, 70이상 C, 그외 F
		
		
//		Scanner tmp = new Scanner(System.in);
//		int max = 300;
//		double ave;
//		System.out.println("첫번째 과목 점수 입력");
//		int a = tmp.nextInt();
//		System.out.println("두번째 과목 점수 입력");
//		int b = tmp.nextInt();
//		System.out.println("세번째 과목 점수 입력");
//		int c = tmp.nextInt();
//		
//		max = a+b+c;
//		ave=max/3;
//		
//		if(ave >= 90) {
//			System.out.println("A");
//		}
//		else if(ave >=80) {
//			System.out.println("B");
//			
//		}
//		else if(ave >=70) {
//			System.out.println("C");
//		}
//		else {
//			System.out.println("F");
//		}
			
//		Scanner tmp = new Scanner(System.in);
//		
//		System.out.println("점수 입력");
//		int a = tmp.nextInt();
//		System.out.println("학년 입력");
//		int b = tmp.nextInt();
//		
//		if(a >= 70) {
//			if (b != 4 ) {
//			System.out.println("합격");
//			}
//			else if (a >=80)
//			System.out.println("합격");
//			else
//			System.out.println("불합격");
//		}
//		else
//			System.out.println("불합격");
		
//		//삼항조건 연산자
//		int score =85;
//		//  조건식 ? true:false
//		// 참이면 ? 뒤가 실행. 거짓이면 :뒤가 실행
//		char grade =(score>90)?'A':'B';
//		System.out.println(grade);
		
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("오늘은 무슨 요일 입니까");
//		String day = tmp.next(); 
//		
//		switch(day) { //  switch에는 문자 문자열 정수 입력이 가능하다.
//		case "목":
//			System.out.println("목");
//			break;
//		case "금":
//			System.out.println("금");
//			break;
//		default:
//			System.out.println("목금아님");
//			break;
//		
//		}
//		
//
//		// 14시30분 시작
//		// 문제
//		//switch case문이용. 문자하나 입력받아 m이면 movie, s면 sing, b면 book 그외 etc 출력
//		
//		Scanner tmp = new Scanner(System.in);
//		
//		System.out.println("하나의 문자를 입력하시오");
//		//String a = tmp.next(); 
//		//next가 char를 인식할 수 없으므로 string을 사용함.
//		char a=tmp.next().charAt(0);
//		// char가 되는 경우 charAt(0)은 문자열(배열)의 첫번째(0번) 위치를 의미한다
//		switch(a) {
//		case 'm':
//		//case "m":
//			System.out.println("movie");
//			break; // break 안하면 끝나지 않고 하위 케이스 실행
//		case 's':
//		//case "s":
//			System.out.println("sing");
//			break;
//		
//		case 'b':	
//		//case "b":
//			System.out.println("book");
//			break;
//		default:
//			System.out.println("etc");
//			break;
//		}
//		tmp.close();
//	
	
		// 학점을 입력 받아서, A,B 학점이면, excellent 출력, C,D학점이면 Good, F 면 Bad
		
//		Scanner tmp = new Scanner(System.in);
//		
//		System.out.println("학점 ABCDF를 입력하세요");
//		char score = tmp.next().charAt(0);
//		
//		switch(score) {
//		case 'A' :
//		case 'B' : // 다른 상황별 결과 값이 같은 경우 상황을 몰아쓰는게 좋다.
//			System.out.println("Exccelent");
//			break;
////		case 'B':
////			System.out.println("Exccelent");
////			break;
//		case 'C':
//			System.out.println("good");
//			break;
//		case 'D':
//			System.out.println("good");
//			break;
//		default:
//			System.out.println("bad");
//			break;
//		}
//		tmp.close();
		
		
		// 0.0<= Math.random() < 1.0
		// 0.0 *10 <= Math.random() *10 < 1.0 *10
		// 0.0 <= Math.random() *10 < 10.0
		// (int)0.0 <= (int)Math.random() *10 < (int)10.0
		// 0 <= (int)Math.random() *10 < 10 : 0~9
		// 0 +1 <= (int)Math.random() *10 +1 < 10 +1 : 1~10
		
//		int n1 = (int)(Math.random()); // 0~1
//		int n2 = (int)(Math.random()*10)+1; // 1~10
//		int m1 = (int)(Math.random()*6); //0~5
//		int m2 = (int)(Math.random()*6)+1; //1~6
		
//		System.out.println(m);
		
//		//문제 난수 범위 작성하기 4~13까지 범위
//		int z1 = (int)(Math.random()*13); // 0(부터)~13(미만)
//		int z2 = (int)(Math.random()*13)+1; // 1(부터)~14(미만)
//		int z3 = (int)(Math.random()*14)+1; // 1~15(미만)
//		int z4 = (int)(Math.random()*14)+1; // 1~15
//		System.out.println(z1);
		
//		//3시 30분 
//		//문제 1부터 100까지 무작위 출력
//		int y2 = (int)(Math.random()*100)+1;
//		//int y2 = 100;
//		System.out.println(y2);
//		
//		// y2 가 5의 배수이면, 5의 배수 10의 배수이면 10의 배수
//		// 둘다 아닌경우 위 경우 다 아님을 출력
//		
//		if(y2%5==0) {
//			if(y2%10==0)
//				System.out.println("5의 배수이면서 10의 배수");
//			else
//			System.out.println("5의 배수");
//		}
//		else if (y2%10==0) {
//			System.out.println("10의 배수");
//		}
//		else
//			System.out.println("둘다아님");
		
//		//81점 에서 100점까지 랜덤함수
//		int a1 = (int)(Math.random()); // 0~1미만 
//		int a2 = (int)(Math.random()*20)+81; // 0~20미만 +81 // 81~101미만
//		// ~까지와 와 ~미만을 구분해서 생각해야함.
//		
//		
//		
//		int score = (int)(Math.random()*20)+81;
//		//System.out.println(score);
//		
//		String grade;
//		
//		if(score>=90) {
//			if(score>=95) 
//				grade="A+";
//			
//			else
//				grade="A";
//		}
//		else if(score>=80) {
//			if(score>=85) 
//				grade="B+";			
//			else
//				grade="B";			
//		}
//		else
//			grade ="F";
//		System.out.println("점수 " + score);
//		System.out.println("학점 " + grade);
		
		
		
//		for(int i=0;i<5;i++){ // 0부터 5미만(4까지) 0~4 = 5번 반복
//			System.out.println("집");
//		}
		
//		
//		//for문에서 중괄호 있고 없고의 차이 확인
//		for(int i=0;i<3;i++) {
//			System.out.println("집");
//			System.out.println("우리 집");
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<3;i++) 
//			System.out.println("집");
//			System.out.println("우리 집");
//	
//	
	
		
		
		
//		for(int i=5;i>=1;i-=2){ // i-=2 는 i=i-2라는 의미이다. 
//			// 5 3 1 출력
//			System.out.println(i);
//			}
		//10~20 까지 for문으로 출력
//		
//		for(int i=10;i<=20;i++) {
//			System.out.println(i);	
//		}
		
		
//		int hap=0;
//		for(int i=1; i<=10; i++) {
//			hap+=i;
//			System.out.println("i는"+i);
//			System.out.println("hap+=i는 "+hap);
//		}
//		System.out.println("따라서 hap은 "+hap);
//	
	// 4시 30분
		//문제 1 501부터 1000까지 홀수 합만 출력
		
		int hap=0;
		for(int i=501;i<=1000;i+=2) {
			System.out.println("i는 "+i);
			hap = hap+i;
					
		}
		System.out.println("합은 "+hap);
		
		
		// 문제 2 첫번째 수 입력, 연산자 입력, 두번째 수 입력, 연산결과 출력은 소숫점 6자리까지
		// switch
		Scanner tmp = new Scanner(System.in);
		
		
		System.out.println("첫번째 수 입력");
		float a1 = tmp.nextInt();

		System.out.println("연산자 입력");
		String b1 = tmp.next();


		System.out.println("두번째 수 입력");
		float a2 = tmp.nextInt();
		
		switch (b1) {
		case "+":
			System.out.printf((int)a1 + "+" + (int)a2 + "= %f\n", (a1+a2));
		break;
		
		case "-":
			System.out.printf((int)a1 + "-" + (int)a2 + "= %f\n", (a1-a2));
		break;
		
		case "*":
			System.out.printf((int)a1 + "*" + (int)a2 + "= %f\n", (a1*a2));
		break;
		
		case "/":
			System.out.printf((int)a1 + "/" + (int)a2 + "= %f\n", (a1/a2));
		break;
		}
		
		
		
		// if 이용

		Scanner tmp2 = new Scanner(System.in);
		System.out.println("첫번째수 입력");
 		float a = tmp2.nextFloat();
 		
 		System.out.println("연산자 입력");
 		String z=tmp2.next();
 		//char z=tmp2.next().charAt(0);
 		
 		System.out.println("두번째 수 입력");
 		float b = tmp2.nextFloat();
 		
 		if(z.equals("+")) { // equals 함수는 문자열 비교할때 사용한다.
 			System.out.printf((int)a + "+" + (int)b + "= %f", a+b);
 		}
 		else if(z.equals("-")) {
 			System.out.printf((int)a + "-" + (int)b +"= %f",a-b);
 		}
 		else if(z.equals("*")) {
 			System.out.printf((int)a + "*" + (int)b +"= %f",a*b);
 		}
 		else if(z.equals("%")) {
 			System.out.printf((int)a + "%" + (int)b +"= %f",a%b);
 		}
 		else if(z.equals("/")) {
 			System.out.printf((int)a + "/" + (int)b +"= %f",a/b);
 		}
 		else {
 			System.out.println("연산자를 + - * % / 중에 입력하세요");
 		}
	
	
	}
	
		
		

}
