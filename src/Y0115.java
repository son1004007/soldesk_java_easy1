import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Y0115 {

   static Scanner tmp = new Scanner(System.in);

   //함수 복습1
//   static double average (int a1, int a2) {
//	   double avg1= (a1+a2)/2.0;
//	   return avg1;
//   }
   //함수 복습2
//   static double average2() {
//
//     System.out.println("1번 정수 입력하세요");
//     int a1 = tmp.nextInt();
//     System.out.println("2번 정수 입력하세요");
//     int a2 = tmp.nextInt();
//     System.out.println("정수의 평균 출력");
//     return (a1+a2)/2.0;
//     
//   }
   //함수 복습3
//   static void average3() {
//
//	     System.out.println("1번 정수 입력하세요");
//	     int a1 = tmp.nextInt();
//	     System.out.println("2번 정수 입력하세요");
//	     int a2 = tmp.nextInt();
//	     System.out.println("정수의 평균 출력");
//	     System.out.println((a1+a2)/2.0);
//	     
//	   }
   //배열+함수 복습1
//   static int total(int a3[]) {
//	   int sum=0;
//	   for (int i=0; i<a3.length ; i++) {
//		   sum += a3[i];
//	   }
//	   return sum;
//   }
   
//   //배열+함수 복습2
//   static int total(int a4[][]) {
//	   int sum=0;
//	   for (int i=0; i<a4.length ; i++) {
//		   for(int j=0 ; j<a4[i].length ; j++)
//		   {
//			   sum += a4[i][j];
//		   }
//	   }
//	   return sum;
//   }
//   
//   //배열 + 조건 + 삼항 연산자 복습
//   static void big(int a, int b) {
//	   
//	   if (a > b) {
//		   System.out.println(a + "가 크다");
//	   }
//	   else {
//		   System.out.println(b + "가 크다");
//	   }
//	   
//	   int n=(a>b)?a:b;
//	   System.out.println(n + "가 크다");
//   }
   
   public static void main(String[] args) throws IOException {
      
//	   //함수 복습 1
//      System.out.println("1번 정수 입력하세요");
//      int a1 = tmp.nextInt();
//      System.out.println("2번 정수 입력하세요");
//      int a2 = tmp.nextInt();
//      System.out.println("정수의 평균 출력");
//      double avg1 = average(a1,a2);
//      System.out.println(avg1);
	   
	   //함수 복습2
//	   double avg2=average2();
//	   System.out.println(avg2);

	   //함수 복습3
//	   average3();
	   
	   //배열+함수 복습1
//	   int a3[]=new int[] {1,2,3,4,5};
//	   System.out.println(total(a3));

	   //배열+함수 복습2
//	   int a4[][]={{1,2,3},{4,5,6}};
//	   System.out.println(total(a4));
//	   
//	   //
//	   System.out.println("정수 2개를 입력하세요");
//	   big(tmp.nextInt(), tmp.nextInt()); // 함수 호출
	   
	   
	   
	   //page 346 문제 6. 전역변수 a =100; 지역변수 a =200
	   // 지역변수 우선순위가 높다. 답 200
	   
	   //문자열 복습1
//		length 길이비교
//		replace 문자열 교체
//		substring 문자열 추출
//		sprilt 문자열 분리
//		trim 앞뒤 공백 제거
//		compareTo 문자열 비교
//		contains 문자열 포함 확인
//		concat 앞 문자열과 문자열 연결
	   
	   //비대면 문제
	   //1. 1~10까지의 총곱을 출력해라.(while)
	   
//	   int mul1=1, i1=1;
//	   while(i1<=10) {
//		   //mul1=mul1*i1;
//		   mul1*=i1;
//		   i1++;
//	   }
//	   System.out.println(mul1);
//	   
//	   
//	   //2. 구구단의 짝수단만 출력하면서 해당되는 단의 범위까지
//	   //(2단은 2*2, 4단은 4*4, 6단은 6*6, 8단은 8*8)출력해라.(break)
//	   
//	   for (int i = 2 ; i<=9 ; i++) {
//		   for (int j = 2; j<=9 ; j++) {
//			   System.out.println(i*j + " ");
//			   
//			   if (i==j) {
//				   break;
//			   }
//		   }
//	   }
	   
	   
	   // page 352 실습 10-1 예외처리의 기본예
//	   int a[]=new int[3];
//	   try {
//
//		   a[3]=100;
//	   }
//
//	   catch (ArrayIndexOutOfBoundsException e) {
//		   System.out.println("배열 첨자가 배열 크기보다 큼");
//	   }
		
	   
	   // page 353 실습 10-2 예외 처리의 전체 예
	   
//	   int a353[] =new int[3];
//	   try {
//		   a353[2] = 100/0;
//		   a353[3] = 100;
//	   }
//	   catch(ArrayIndexOutOfBoundsException e){ // 두번째 에러 메시지 참조안됨
//		   System.out.println(" 배열 첨자가 배열 크기보다 커요");
//	   }
//	   catch(ArithmeticException e) { // 첫번째 에러 메시지 발생하면 break 됨
//		   System.out.println("0 으로 나누기");
//	   }
//	   catch(Exception e) { // 하위 클래스가 상위 클래스 보다 먼저 에러검출 된다. 
	   // 하위 클래스가 상위 클래스보다 우선시된다.
//		   System.out.println("에러가 있다.최상위 클래스");
//	   }
//	   finally {
//		   System.out.println("무조건 나옴");
//	   }
//	   
	   
	   // page 379 예제 26
//	   try {
//	   System.out.println("수를 입력하세요");
//	   double i26 = tmp.nextDouble();
//	   
//	   
//	   System.out.println("수를 입력하세요");
//	   double j26 = tmp.nextDouble();
//	   
//	   System.out.println("연산자를 입력하세요");
//	   char a26=tmp.next().charAt(0);
//	   
//	   switch (a26) {
//	   case '+' : {
//		   System.out.println(i26+ "+" +j26+ "=" +(i26+j26));
//	   }
//	   case '*' : {
//		   if (i26==0 || j26==0) {
//			   throw new Exception("둘 다 0이면 안됨");
//		   }
//		   System.out.println(i26*j26);
//		   break;
//	   }
//	   case '/' : {
//		   if (j26==0) {
//			   throw new Exception("둘 다 0이면 안됨");
//		   } 
//		   System.out.println(i26/j26);
//		   break;
//	   }
//	   
//	   }
//	   
//	   
//	   
//	   }catch(Exception i) {
//		   System.out.println(i.getMessage());
//	   }
	   
	   
	   //page 355 직접풀어보기 10-1
	   // 실습 10-4를 수정하여 a가 0이 아닌 경우에도 0은 나눠도 0입니다. 오류가 추가로 발생하도록 해보자
	   
	   
	   
//	   String str1, str2;
//	   System.out.println(str1 = tmp.next());
//	   System.out.println(str2 = tmp.nextLine()); 
	   // nextLine은 참조변수String을 공백(띄어쓰기, 줄바꾸기, 들여쓰기)으로 구분하여 입력 받는다.
	   // 
	   // API document 확인
	   // String :	nextLine() : Advances this scanner past the current line and returns the input that was skipped.

	   
	   // page 387 7번
	   
//	   String input = "";
//	   int key;
//	   
//	   System.out.println("글자 또는 숫자 입력 ");
//	   while ((key = System.in.read()) != 13) { //조건 : 엔터 치면 끝
//		   if((int)key < 49 ) { //모르겠네..
//			   input += Character.toString((char)key); // key를 문자열로 변경해서 input에 저장
//			   System.out.println("입력한 글자중 숫자 : " + input);
//		   }
//		   
//	   }
	   
	  
	   
	   
	   
	   
	  
	   
	   /*
	   
	   // 버블정렬
	   int array[] = {6,5,4,3,2,1};
	   int tmp;
	   for(int i= 0 ; i<array.length;i++) {
		   for(int j =0 ; j<array.length ; j++) {
			   System.out.println("i :" +i+"j : "+j);
			   if (array[i] > array[j]) {
				   tmp = array[i];
				   array[i]=array[j];
				   array[j]=tmp; 
				   
			   }
			  
		   }
		   
	   }
	   for (int i =0 ; i < array.length ; i++) {
		   System.out.print(array[i]);
	   }
	   
	   */
	   
	   
	   
	   //바이트 스트림
	   //1) 입력 스트림 형식 : ~~InputStream
	   //2) 출력 스트림 형식 : ~~OutputStream
	   
	   //문자 스트림
	   //1) 읽기 스트림 형식 : ~~Reader
	   //2) 쓰기 스트림 형식 : ~~Writer
	   
	   //page 364
	   //1. 파일 생성
	   //writer(문자단위 파일 생성)
	   //OutputStream(바이트 단위 파일 생성)
	   
	   //class안에서 파일 생성이 가능하냐 불가 하냐. 주인공(단독 가능) 장식(단독 불가)
	   // Constructor의 괄호안 매개변수에 InputStream, OutputStream, Reader, Writer가 보이면 장식
	   // 없으면 주인공
	   
	   //2. 파일에 값 저장
	   // writer 메소드
	  
	   //3. 파일 읽기
	   // Reader 메소드
	   
	   //4. 파일 닫기
	   
	   
	   //page 366 실습 10-9
/*
	   FileInputStream fis = new FileInputStream("C:\\Users\\son10\\OneDrive - re-contextualize efficient channels\\java_soldesk\\eclipse\\Test01\\test.txt");
	   
	   int ch;
	   while((ch=fis.read())!=-1) {// 파일의 끝일경우 -1을 반환한다. EOF : End Of File : 파일의 끝
		   System.out.print((char)ch);
	   }
	   fis.close();
*/
	   
//	   public static void main(String[] args) throws IOException {

	   char a = 'S';
	   char b = 'W';
	   
	   char c = 'I';
	   
	   //a.txt 만들어서 a,b,c를 저장.
	   
	   FileWriter tst1 = new FileWriter("test2.txt"); // 파일 생성
	   
	   tst1.write(a);
	   tst1.write(b);
	   tst1.write(c);
	   
	   tst1.close();
			   
	   FileWrite1(); // 파일 쓰기 메소드
	   FileRead1(); // 파일 읽기 메소드
//	   FileRead2(); // 파일 읽기 메소드
	   
   }
   static void FileWrite1() throws IOException {

	   FileWriter tst1 = new FileWriter("test4.txt");
	   System.out.println("저장할 문자열을 입력하세요.");
	   
	   String str1 = tmp.next();
	   tst1.write(str1);
	   
	   tst1.close();
   }
   
   static void FileRead1() throws IOException{
	   char array[] = new char [10];
	   int cnt;
	   FileReader tst2 = new FileReader("test3.txt");
	   
	   cnt = tst2.read(array, 0, array.length);
	   
	   for(int i=0; i<cnt ; i++) {
		   System.out.println(array[i]);
	   }
	   tst2.close();
	   
   }
   //혼자서 테스트 완성 안됨. page 373 실습 10-14 파일을 이용한 출력2를 참고해서 작성가능할듯
//   static void FileRead2() throws FileNotFoundException {
//	   FileReader tst1 = new FileReader("test4.txt");
//	   
//	   int str;
//	   while((str = System.in.read)) != 13)
//	   System.out.println(str);
//	   
//   }
   
   
   
   

}

