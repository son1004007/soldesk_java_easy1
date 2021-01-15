import java.util.Scanner;
public class Y0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		// 선언과 동시에 배열 생성
		int a[] = new int[10];
		
		a[0] = 10;
		a[1] = 40;
		a[2] = 50;
		
		// 배열 초기화1
		int b[]= {1,2,3,4,5};
		
		// 배열 초기화2
//		int c[] = new int {1,2,3,4,5};
		
		
		int a1[] = new int[10];
		int a2[] = {10,40,50}; // 자주 사용되는 배열 초기화 방법
		int i;
		for(i=0 ; i<3 ; i++) {
			System.out.println("배열 초기화 값 입력하세요");
			Scanner tmp = new Scanner(System.in);
			a1[i]= tmp.nextInt();
			
			System.out.println(a2[i]); // a2 배열 출력
		}
		System.out.println(a1[i]);
		
*/
/*		
		// 실수 5개 입력받아서 평균 출력(배열)
		
		double a3[] = new double[5];
		int sum =0;
		Scanner tmp1 = new Scanner(System.in);
		for(int i2 = 0; i2 <5 ; i2++) {
			System.out.println((i2+1)+"번 실수를 입력하세요");
			a3[i2] = tmp1.nextDouble();
			
			sum +=a3[i2];			
		}
		System.out.println("평균 : " + sum/5.0);
		tmp1.close();
*/		
/*		
		// page 274 배열 요소의 개수 알아내기 실습 8-6
		// page 298 6번 문제 
		// 실습 8-3을 참조 하여 입력한 숫자 4개의 합계와 곱을 구하는 프로그램을 작성하시오.
		// 단 모두 while문으로 작성한다.
		
		double a4[] = new double[4];
		double sum2=0, multi1 =1;
		Scanner tmp2 = new Scanner(System.in);
		int i3=0;
		while(i3<4) {
			System.out.println((i3+1)+"번째 숫자를 입력하세요");
			a4[i3]= tmp2.nextDouble();
			
			sum2 += a4[i3];
			multi1 *= a4[i3];
			i3++;
			
		}
		
		
		System.out.println("합 :"+sum2 +" 곱 :"+ multi1);
		
		tmp2.close();
		
*/		


/*		
		//아파트 인원 배열 문제
		// 5층 아파트 있음
		// 5층까지 거주자 총원
		
		int man1[] = new int[5];
		
		Scanner tmp = new Scanner(System.in);
		int sum = 0;
		
		for (int layer = 0 ; layer <5 ; layer++) {
			
			System.out.println((layer+1) + "층 거주자 인원을 입력하세요");
			man1[layer] = tmp.nextInt();
			sum+= man1[layer];
		
			
		}
		System.out.println("총 인원 " + sum +"명");
		
		tmp.close();
*/
/*		
		// 1 2 3 5 8 13 21 34 55 89 .. (피보나치 수열을 배열로 작성) 
		
		
		int aray[] = new int[10];
		aray[0] = 1;
		aray[1] = 2;
		System.out.print(aray[0]+" "+aray[1]+" ");
		
		for (int i=0 ; i<8 ; i++) {
			aray[i+2]= aray[i] + aray[i+1];
			
			System.out.print(aray[i+2]+" ");
		}
		
//		for (int i=0 ; i<10 ; i++) {
//			System.out.println(aray[i]+" ");
//		}

*/
/*
		// 문제1.	1~10까지 합을 구해라. (for, while, do~while)
		//1-1
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		// 1-2
		int sum2=0, i=1;
		while(i<=10) {
			
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		
		//1-3
		int i=1, sum=0;
		do {
			sum +=i;
			i++;
			
		}while (i<=10);

		System.out.println(sum);
		
		
		//2.while문을 이용하여 정수를 여러개 입력받고 평균 출력해라. 
		//(0이 입력되면 입력이 종료된다.)무한.

		Scanner tmp = new Scanner(System.in);
		
		int count=1, sum=0;
		while (true) {
			System.out.println("정수를 입력하세요");
			int m = tmp.nextInt();
			sum +=m;
			System.out.println("평균 : "+ (sum/(double)count));
			
			if (m==0) {
				System.out.println("종료 됩니다.");
				break;
			}
			count++;
		}
		
		//3. 다음 while문을 보고 실행결과가 동일하게 나오도록 
		// 2가지 과정으로 바꿔라.
//		int i=1, sum=0;
//		while( i<10){
//		i=i+2;
//		sum +=i;
//		}
//		System.out.println(sum);
//		3.1) while(true)와 break를 사용하여 바꿔라.
//	    3.2) do~while문, continue을 사용하여 바꿔라.

		
		int i=1, sum=0;
		while (true) {
			i=i+2;
			sum +=i;
			
			if (i=>10) {
				break;
			}
		}System.out.println(sum);
	
		
		int i=1, sum=0;
		do {
			
			i+=2;
			if(i%2==0) {
				continue;
			}
			sum += i;
			
		}while (i<=10); // i 는 10까지
		System.out.println(sum);
		
		
		//4-1) 10개의 문자를 가지는 배열 a를 선언하고 생성해라.
		
		char a[] = new char[10];
		
		int b[] = {0,1,2,3,4};
		
		String c[] = {"java", "c", "c++"};
		
		int d[] = new int[10];
		
*/		
		
/*		
		// 1~100까지 중 5의 배수이고 10의 배수
		// while do while for
		
		System.out.println("while");
		int i=1;
		while (i <= 100) {
			if(i%5==0 && i%10==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
		System.out.println("do-while");
		int i2=1;
		do {
			if(i2%5==0 && i2%10==0) {
				System.out.println(i2);
			}
			
			i2++;
			
		}while(i2 <= 100);
		
		
		
		System.out.println("for");
		for(int i3=1; i3<=100; i3++) {
			if(i3%5==0 && i3%10==0) {
				System.out.println(i3);
			}
		}
		
		
*/
		
/*		
		// 정수 5개 입력해서 제일 큰 값을 출력
		Scanner tmp = new Scanner(System.in);
		int a[] = new int[5];
		
		int big =0;
		
		for (int i=0; i<a.length; i++) { //a배열 갯수 만큼
			System.out.println((i+1)+"번째 정수를 입력하세요 총 5개");
			a[i] = tmp.nextInt();
			

			
			if (big < a[i]) {
				big = a[i];
			}
//			System.out.println("가장큰수 : "+big);

			
		}
		System.out.println("가장큰수 : "+big);
		
		
*/	
		
/*		
		//for each 활용
		String str[] = {"컴퓨터", "사비","DB"};
		
		// for each 문 
		// for(자료형 자료형_이름 : 배열 이름)
		for(String s:str) {
			System.out.println(s);
		}
		
		// for each 문 활용
		int sum=0;
		int aray[] = {1,2,3,4,5};
		for (int i:aray) {
			sum+=i;
			System.out.println(sum);
			
		}
		
		
		
	
*/		
		//page 276 int a[][] =new int[행수][열수]
//		int aray[][] = new int[2][2]; //2행 2열
//		aray[0][0] =5;
//		aray[0][1] =8;
//		aray[1][0] =6;
//		aray[1][1] =2;
		
		
/*		
		int aray[][] = new int[][] {{5,8},{6,2}};
		for (int i=0 ; i<2 ; i++) {
			for(int j=0;j<2;j++)
			{
				System.out.print(aray[i][j]);
			}
			System.out.println();
		}
*/
/*
		//page 278 실습 8-8
		int a[][] = new int[3][4];
		int val =1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]
			}
		}
*/		
		//문제
		//page 296 2번
		
		//page 297 4번 50개
		//page 299 8번

		// 6교시 시작 문제
		//정수 10개 입력받아 배열에 저장한 후
		//5의 배수 정수만 출력
		
		
		//for each 활용
//		String str[] = {"컴퓨터", "사비","DB"};
		
		// for each 문 
		// for(자료형 자료형_이름 : 배열 이름)
//		for(String s:str) {
//			System.out.println(s);
//		}
		/*
		int aray[] = new int[3];
		Scanner tmp = new Scanner(System.in);
		
		for (int i:aray) { // i는 배열에 들어갈 정수값 ? 

			System.out.println("정수 입력");
			aray[i] = tmp.nextInt();
		
			
			if(aray[i]%5==0) {
				System.out.println("입력값중 5의 배수 : "+ aray[i]);
			}
			
		}
		
		*/
		
		//2차원 배열. 실수 입력받아서 출력
/*		
		Scanner tmp = new Scanner(System.in);
		
		double a[][] = new double[2][3];
		
		for(int i=0 ; i<2 ; i++) {
			for(int j=0; j<3 ; j++) {
				System.out.println(i+"행"+j+"열 값을 입력하세요");
				a[i][j] = tmp.nextDouble();
			
			}			
		}
		for(int i=0 ; i<2 ; i++) {
			for(int j=0; j<3 ; j++) {
		
				System.out.println(i+"행"+j+"열"+a[i][j]);
			}
		}
		
*/
		//int a[][]=new int[3][2];
		/// 1,2,3,4,5,6 으로 초기화 page 279
		
//		int a[][] = {{1,2,3},{4,5,6}};
		

////		int a[][] = new int[3][2];
//		for (int i=0 ; i<a.length ; i++) {
//			for (int j=0; j<=a.length ; j++) {//?
//				System.out.println(a[i][j]);
//			}
//		}
		
		
//		int b[][]= {{1,2,3,4},
//					{5,6,7,8}}; 
		//12345678을 2행 4열로 초기화
		
		
//		int c[][]=new int[4][2];
		// 4행 2열 배열 선언
		
		// 문제. 배열 b데이터를 배열c에 복사. 
		// 위치는 다름(2행 4열을, 4행 2열로 변환) 
		// 배열간 관계 확인하여 변경
/*		
		for(int i=0; i<2;i++) {
			for(int j=0; j<4 ; j++) {
				c[j][i]=b[i][j];
			}
		} // b의 배열 값을 c의 배열에 입력  
		for (int j=0; j<4; j++) {
			for (int i=0; i<2; i++) {
				System.out.print(c[j][i]+" ");
			}
			System.out.println();
		} // c의 배열을 출력
*/			
/*		
		// 2차원 배열 2행 3열 생성하여
		// 정수를 입력받는다
		// 입력한 정수의 총합 출력
		
		int d[][] = new int[2][3];
		Scanner tmpd= new Scanner(System.in);
		int sum =0;
		for(int i=0; i<2;i++) {
			for(int j=0; j<3 ; j++) {
				System.out.println("정수를 입력하세요");
				int e = tmpd.nextInt();
				d[i][j]= e;
			}
				
		}
		for(int i=0; i<2;i++) {
			for(int j=0; j<3 ; j++) {
				sum+=d[i][j];
			}
				
		}
		System.out.println(sum);
*/		
/*		
		String s[][] = {{"Java"},
						{"c","C++"},
						{"html","css","Python"}};
		
		//2차원 배열 일때
		//행 > 배열명.length
		//열 > 배열명[행].length
		
		
		
		for(int i=0; i<s.length ;i++) {
			for(int j=0 ; j<s[i].length; j++) {
				System.out.print(s[i][j]+ " ");
			}
			System.out.println();
		}
*/		
		//page 290 20번 예제 풀기
		
		// 7교시
		// 2.0 4.0
		// 6.0 8.0
		/*
		double array[][] = new double [2][2];
		double count =2.0;
		for (int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				
				array[i][j] = count;
				System.out.print(array[i][j]+ " ");
				
				count+= 2; 
			}
			System.out.println();
		}
		
		*/
		//			   01234567
		String str3 = "집에 있는데도~ 집에가고 싶을 꺼야";
		String z[] = str3.split("~");
		
		for (String s:z) {
			System.out.println(s);
		}
		
//		String z2=str3.substring(4,7); //4부터 7미만(6까지)
//		System.out.println(z2);
		
//		String z3=str3.replace("집에", "지베");
//		System.out.println(z3);
		
		//교재 없는 내용 많이 나오는 문자
/*		
		String str6= "오늘은 수요일";
		String str7=str6.concat(" 내일은 목요일"); 
		//문자열 연결
		System.out.println(str7);
*/		
//		Scanner tmp7 = new Scanner(System.in);
//		System.out.println("1번 문자열을 입력하세요");
//		String str7 = tmp7.next();
//		System.out.println("2번 문자열을 입력하세요");
//		String str8 = tmp7.next();
//		
//		if (str7.length() < str8.length()) {
//			System.out.println(str8);
//		}
//		else
//			System.out.println(str7);
		
//		length 길이비교
//		replace 문자열 교체
//		substring 문자열 추출
//		sprilt 문자열 분리
//		trim 앞뒤 공백 제거
//		compareTo 문자열 비교
//		contains 문자열 포함 확인
//		concat 앞 문자열과 문자열 연결
		
/*		
		String a1= "apple";
		String b2= "banana";
		System.out.println(a1.compareTo(b2));
		if(a1.compareTo(b2)>0) { 
			//문자열 a1와 문자열 b2의 첫번째 문자의 아스키값의 차이.
			//a1.compareTo(b2) 는 a의 아스키값크기, b의 아스키값크기 의 차
			//a1-b2의 아스키코드 값을 의미한다.
			System.out.println(a1);
			
		}
		else
			System.out.println(b2);
*/		
		//page 344 연습문제 1번
/*		
		length() : 문자열 길이
		startWith() : 시작 문자열c
		indexOf() : a
		lastIndexOf() :b
		replace() : d
		substring : 
		split : g 
		
		
		
		
*/		
	}

}
