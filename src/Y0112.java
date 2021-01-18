import java.util.Scanner;
public class Y0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p176 if문 중첩 복습
		//p191 5번
		// 입력한 수가 양수인지 음수인지 0인지 출ㄹ력하는 프로그램을 중첩if문을 사용해서 작성하시오
		
//		Scanner scr = new Scanner(System.in);
		
//		System.out.println("음수 또는 양수 또는 0을 입력하세요");
//		double num1 = scr.nextDouble();
//		
//		if (num1>=0) {
//			if(num1!=0)
//				System.out.println("양수");
//			
//			System.out.println("0");
//		}
//		else {
//			System.out.println("음수");
//		}
			
		
		/*
		//p178 문제 5-2 
		Scanner scr = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = scr.nextInt();
		if (score >= 70) { // 70 점 이상 실행
			
			if (score >=95) {
				System.out.println("A+");
			}
			if (score >= 90) {
				System.out.println("A");
			}
			else if(score >=85) {
				System.out.println("B+");
			}
			else if(score >=80) {
				System.out.println("B0");
			}
			else if(score >=75)
				System.out.println("C+");
			
			else
				System.out.println("C0");
		}
		else { // 70점 미만을 기준으로 실행
			if (score >=65) {
				System.out.println("D+");
			}
			else if(score >=60) {
				System.out.println("D");
			}
			else			
			System.out.println("F");
		}
		*/
		
		
		//3. 중첩 반복문(for, do while)으로 5단부터 9단까지 출력
		
//		System.out.println("문제3-1 중첩 반복문 구구단 5단부터 9단 출력");
//		for(int a = 5; a < 10 ; a++) {
//			
//			for(int b=1; b < 10 ; b++) {
//				System.out.println(a+"x"+b+"="+(a*b));
//			}
//		
//		}
		
//		System.out.println("문제3-2 중첩 반복문 구구단 5단부터 9단 출력"); // 이건 왜 안되는지 이해 안됨.
//		int b=1;
//		for(int a = 5; a < 10 ; a++) {
//			
//			while (b<10) {
//				System.out.println(a+"x"+b+"="+(a*b));
//				b++;
//			}
//			
//		}
		
		

		 /*

		//4. while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
		int sum =0, i3=1;
	
		while (i3 <=100) {
			if(i3%5==0) {
				sum=sum+i3;
				System.out.println("sum = "+sum);
			}
			i3 ++;
		}
		
		
*/
		
		
		
		//page 254 예제 17 원하는 배수의 합계 구하는 계산기
/*
		Scanner num2 = new Scanner(System.in);
		System.out.println("정수1를 입력하세요");
		int sum3 = num2.nextInt();
		System.out.println("정수2를 입력하세요");
		int sum4 = num2.nextInt();
		System.out.println("배수를 입력하세요");
		int multiple1 = num2.nextInt();
		//정수1과 정수2까지 n 배수의 합계
		
		int sum5=0;
		for ( int z = sum3 ; z <= sum4 ; z++) {
			if (z%multiple1==0) {
				sum5+=z;
//				System.out.println(z);// 검토
//				System.out.println(sum5); //검토
			}
			System.out.println(sum5);
			
		}
		num2.close();
*/
		
		//5. while, random()을 이용해서 (x,y)형태로 출력하는데 x+y합이 5이면 실행을 멈추는 코드를 작성. 
		// 5가 아니면 난수 계속 발생시키고출력 (x,y 범위는 1부터 5까지)
/*
		while(true) {
			int x = (int)(Math.random()*5)+1;
			int y = (int)(Math.random()*5)+1;
			int sum = x+y;
			System.out.println(sum); //검토용
			if (sum==5) {
				break;
			}
			
		}
*/	
		
/*		
		// 반복문 마지막 문제
		// 1~99까지 정수중
		//2의 배수 또는 3의 배수 출력(반복문 하나 사용)
		System.out.println("반북문 for");
		for (int a=1 ; a<100 ; a++) { //반복문
			if (a%2==0 || a%3==0) { //조건문
				System.out.println("2배수 또는 3의 배수 출력"+a);
			}
		}
		
		
		System.out.println("\n반복문 while");
		int b=1;
		while (b<100) { //반복문
			if (b%2==0 || b%3==0) { //조건문
				System.out.println("2배수 또는 3의 배수 출력"+b);
			}
		b++;
		}
*/		
/*
		int n=-1;
		do { // do while문은 무조건 1번은 실행된다. 1번 실행 이후 조건에 맞는지 확인하고 반복한다.
			System.out.println(n);
			n++;
		}while(n>0);
*/
		
/*		
		//1~100까지 do while
		int i = 1;//초기값
		do {
			System.out.println(i);
			i++; // 증감식
		}while(i<=100); // 조건식
		
*/		

		
/*		// page 242 직풀 7-2. 실습 7-2를 do-while 문으로 바꿔보자 1부터 10까지 합 출력
		int i=1, sum=0;
		do {
			sum+=i;
			i++;
			
			System.out.println(sum);

		}while (i<=10);
*/
		

/*
		// page 248 직풀 7-4. 
		// 실습 7-9에서 사용한 for문을 while 문으로 바꿔서 작성하라
		// 실습 7-9 1~100의 합에서 최초로 1000을 넘는 수를 출력
		int hap =0;
		int i =1;
		while(i<=100) {
			hap +=i;
			i++;
			System.out.println("hap : "+ hap); //검토
			System.out.println("i : "+i); //검토
			
			if (hap >=1000) {
				break;
			}
			
		}
		System.out.println("1~100의 합에서 최초로 1000이 넘는 위치는? " + i);
		
*/		
		
/*		
		// page 248 실습 7-10 continue 문 예제
		int sum =0, i;
		
		for (i =1;i<=100;i++) {
			if(i%3==0) {
				System.out.println("i : "+i);
				
				continue;
			}
			
			sum+=i;
			System.out.println("sum : "+sum);
		}
		System.out.println("1~100까지의 합(3의 배수 제외):"+sum);
		
*/		
		
		
		
		
/*		
		int answer =18;
		Scanner tmp = new Scanner(System.in);
		int count =0;
		
		for(count = 1 ; ; count++) {
			
		
			System.out.println("숫자를 입력하세요");
			int num = tmp.nextInt();
			
			
			if (answer > num) {
				System.out.println(num +" 보다 큽니다.");
			}
			else if(answer < num) {
				System.out.println(num +" 보다 작습니다.");
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
		}
		
		System.out.println("총 "+count+"회 시도 했습니다.");
		// 경우의 수 작성(안쪽) > 반복 구간 작성(바깥쪽) > 마지막 출력문 위치 확인
*/		
		
/*
		int answer2 =18;
		Scanner tmp2 = new Scanner(System.in);
		int count2 =0;
		while(true) {
			count2+=1;
			System.out.println("숫자를 입력하세요");
			int num2 = tmp2.nextInt();
			
			
			if (answer2 > num2) {
				System.out.println(num2 +" 보다 큽니다.");
			}
			else if(answer2 < num2) {
				System.out.println(num2 +" 보다 작습니다.");
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("총 "+count2+"회 시도 했습니다.");
		// 경우의 수 작성(안쪽) > 반복 구간 작성(바깥쪽) > 마지막 출력문 위치 확인
		
*/
		
/*		
		Scanner tmp = new Scanner(System.in);
		// 대문자 uppercase A-Z 89-114 / lowercase a-z 97-122 / number 0-9 48-057
		//page 254 uppercase lowercase number
		
		System.out.println("한문자 입력");
		char chara1 =tmp.next().charAt(0);
		
		int charach=(int)chara1;
		
		System.out.println("입력문의 아스키코드는 "+charach+" 입니다.");
		
		for (int i=97; i<=charach ; i++) { // 97부터 내가 입력한 문자(charach)의 아스키코드까지 반복
			for(int j=i;j<charach ; j++) { // (i=98)부터 아스키코드 내가 입력한 문자의 아스키코드-1까지 1씩 증가
//				System.out.println(i + "" + j); 이해를 위해
				System.out.print("아스키코드 : "+j); // 아스키코드 표시
				char chara2=(char)j; // 아스키코드=숫자 j를 문자 chara2로 형변환
				System.out.println(" 문자 : "+chara2); // chara2를 출력
				break; // j 종료
			}
			
		}System.out.println(); // 1줄 띄우고 
		
*/		
/*
		String str;
		do {
			System.out.println("한문자열 입력");
			str = tmp.next();
			if(str.equals("exit")) {
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println(str);
			}
				
		}while(!str.equals("exit")); // "exit"가 아니면 문자열을 입력받아 출력
		
		tmp.close();


*/		
/*		
		// 숙제
		// 실습 7-6 
		Scanner scn = new Scanner(System.in);
		int menu;
		do {
			System.out.println("주문하시겠습니까?\n");
			System.out.print("1카페라떼, 2카푸치노, 3아메리카노, 4그만시킬래요 =>");
			
			menu = scn.nextInt();
			switch (menu) {
			case 1 : {
				System.out.println("카페라떼 주문했습니다.");
				break;
			}
			case 2:{
				System.out.println("카푸치노 주문했습니다.");
				break;
			}
			case 3:{
				System.out.println("아메리카노 주문했습니다.");
				break;
			}
			case 4:{
				System.out.println("주문하신 커피 준비하겠습니다.");
				break;
			}
			default : 
				System.out.println("잘못 주문했습니다.");
			}
			
		}while(menu!=4);
		
		// page 243 직풀 7-3
		// 실습 7-6에서 사용한 switch case를 if로 바꾸기
		
		Scanner scn2 = new Scanner(System.in);
		int menu2;
		do {
			System.out.println("주문하시겠습니까?");
			System.out.print("1카페라떼, 2카푸치노, 3아메리카노, 4그만시킬래요 =>");
			menu2 = scn.nextInt();
			if (menu2==1) {
				System.out.println("카페라떼 주문했습니다.");
			}
			else if (menu2==2){
				System.out.println("카푸치노 주문했습니다.");
			}
			else if (menu2==3){
				System.out.println("아메리카노 주문했습니다.");
			}
			else if (menu2==4){
				System.out.println("주문하신 커피 준비하겠습니다.");
			}
			else
				System.out.println("잘못 주문했습니다.");
		}while(menu2!=4);
*/		
		
/*		
		int i=0;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=8);
*/		
		
/*		
		//1~20까지 합(do~while)
		
		int i=1,sum8=0;
		
		do {
			sum8+=i;
			i++;

		}while(i<=20);
		System.out.println("sum :"+sum8);
*/			
		
		// 반복문 연습 : 1~10까지의 합 중 30이 초과되면 멈추고 30을 초과하는 값 출력.
/*		//for문
		int i=1, sum=0;
		
		for(i=1;i<=10;i++) {
			sum+=i;
			if(sum>=30) {
				break;
			}
			
		}
		System.out.println(sum);
*/		
		
/*		
		//while
		int i=1, sum=0;
		while(i<=10) {
			
			sum+=i;
			i++;
			if(sum>=30) {
				break;	
			}
			
		}
		System.out.println(sum);
*/
		
//		//do while
//		int i=1, sum=0;
//		do {
//			sum+=i;
//			i++;
//			if(sum>=30) {
//				break;
//			}
//			
//		}while(i<=10);
//		System.out.println(sum);
		

//		//0~9까지 수 중 짝
//		int num=0;
//		while(num<=9) {
//			num++;
//			if(num%2==0) { //짝수
//				continue; // 반복문으로 돌아간다.
//			}
//			else {
//				System.out.println(num);
//			}
//		}
//		
//		System.out.println("for문");
//		
//		for(int num2=0; num2 <=9 ; num2++){
//			if(num2%2==0) {
//				continue;
//			}
//			else {
//				System.out.println(num2);
//			}
//					
//		}
		
		
		//page 264 배열
		//배열을 사용하는 이유 : 빠르게 코드를 짜기 위함. 일괄처리. 
		
//		int [] ary = new int[4]; //0~3까지 ary 라는 정수 배열. 데이터형 인덱스 ary
//		//데이터형과 배열을 동시에 생성
//		//int는 1개에 4바이트 4개이므로 총 16바이트
//		
//		int ary_test[]; // 정수 배열 생성
//		ary_test = new int[4]; // 배열 크기 설정
//		
//		System.out.println(ary_test[3]);
		
		
//		// page 269 실습 8-3
//		Scanner s = new Scanner(System.in);
//		int[] ary = new int[4];
//		int i, sum = 0;
//		for(i=0;i<=3;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요 : ");
//			System.out.print("aa[" +i+ "]번째 숫자를 입력하세요 : ");
//			ary[i] = s.nextInt();
//			sum +=ary[i];
//			
//		}
//	//	sum = ary[0]+ary[1]+ary[2]+ary[3];
//		System.out.println("합계 : "+sum);
//		
		
		
		
		
//		//문제1. 정수 5개를 저장할 배열 생성과 선언 동시에
//		int[] ary1 = new int[5]; // index 0~4까지
//		
//		//문제2. 실수 10개를 저장할 배열
//		float[] ary2 = new float[10]; // index 0~9까지
//		
//		//문제3. 배열 요소수가 3개인 int형 배열
//		int[] ary3 = new int[3]; // index 0~3까지
//		
//		//문제4. 인덱스의 최대값이 4인 char형 배열
//		char[] ary4 = new char[5]; // index 0~4까지
		
		
		
//		// 실수 3개 입력해서 출력
//		Scanner tmp = new Scanner(System.in);
//		float[] num = new float[3];
//		for (int i=0; i<3 ; i++) {
//			System.out.println(i+ "번째 실수를 입력하세요. 총3개");
//			num[i] = tmp.nextFloat();
//			System.out.println(num[i]);
//		}
		
		// page 297 연습문제1번 > 296 배열의 이해
		
		// page 270 직접 풀어보기 8-1
		// 실습 8-3을 수정하여 변수 4개가 아니라 10개를 입력받도록 해보자.
		// 또한 for 문을 while문으로 변경해보자
		
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("for문 배열의 합");
//		int[] aray = new int[10];
//		int num, sum = 0;
//		for (num =0 ; num <10; num++) {
//			System.out.println((num+1)+ " 번째 정수를 입력하세요. 총10개");
//			aray[num] = tmp.nextInt();
//			sum+=aray[num];
//		}
//		System.out.println("총합 : " +sum);
//		
//		System.out.println("while문 배열의 합");
//		int[] aray1 = new int[10];
//		int num1=0, sum1=0;
//		while(num1<10) {
//			System.out.println((num1+1)+" 번째 정수를 입력하세요. 총10개");
//			aray1[num1]=tmp.nextInt();
//			sum1+=aray1[num1];
//			num1++;
//		}
//		System.out.println("총합 : " +sum1);
//		
//		
//		System.out.println("do-while문 배열의 합"); 
//		//do로 while을 만족하지 않더라도 최소 1번은 실행한다. 이후 while의 조건을 만족할때까지 반복된다.
//		int[] aray2 = new int[10];
//		int num2=0, sum2=0;
//		do {
//			System.out.println((num2+1)+" 번째 정수를 입력하세요. 총10개");
//			aray2[num2]=tmp.nextInt();
//			sum2+=aray2[num2];
//			num2++;
//		}while(num2<10);
//		System.out.println("총합 : " +sum2);
		
		
//		int aray[] = {10,20,30}; // 초기화 할때는 인덱스 크기를 설정하지 않는다.
//		for(int i=0; i<3; i++) {
//			System.out.println("인덱스 "+i+"의 값 : "+ aray[i]);
//		}
//		int aray2[] = new int[] {10,20,30,40}; // 초기화할때는 인덱스 크기를 설정하지 않는다.
//		int aray3[] = new int[5]; // 초기화 하지 않을때는 인덱스 크기를 설정한다.
		
		
		// page 297 문제3 1,4
		// page 273 실습8-5
		
		int []aa = new int[100];
		int bb[] = new int[100];
		int i;
		
		for (i=0;i<100;i++) {
			aa[i]=i*2;
		}
		for (i=0;i<100;i++) {
			bb[i]=aa[99-i];
		}
		
		System.out.println("bb[0]은 "+bb[0]+", bb[99]는 "+bb[99]+" 입력됨");		
		
		System.out.println("실습 8-5을 while문");
		int []aa1 = new int[100];
		int bb1[] = new int[100];
		int i1=0;
		
		while(i1<100) {
			aa1[i1]=i1*2;
			i1++;
		}
		while(i1<100) {
			bb1[i1]=aa1[99-i1];
			i1++;
		}
		System.out.println("bb1[0]은 "+bb1[0]+", bb1[99]는 "+bb1[99]+" 입력됨");	
		
		
		System.out.println("실습 8-5을 do-while문");
		int []aa2 = new int[100];
		int bb2[] = new int[100];
		int i2=0;
		do {
			aa2[i2]=i2*2;
			i2++;
		}while(i2<100);
		
		do {
			bb2[i2]=aa2[99-i2];
			i2++;
		}while(i2<100);
		System.out.println("bb2[0]은 "+bb1[0]+", bb2[99]는 "+bb2[99]+" 입력됨");	
			
		
	}

}













