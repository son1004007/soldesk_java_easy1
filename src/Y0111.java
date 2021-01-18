import java.util.Scanner;
public class Y0111 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
//      System.out.printf("%d + %d = %d\n",100, 200, 100+200);
//      System.out.printf("%d / %d = %.1f\n",100, 200, 100/200.0);
//      
//      int a=10; 
//      String a2 = Integer.toBinaryString(a);
//      
//      System.out.println(a2);
//      
//      if (a <10) {
//         System.out.println("10보다 작군요");
//      }
//      System.out.println("거짓이므로 앞의 문장은 안보이겠죠?");
//      System.out.println("프로그램 끝");
//
//      
//      Scanner scr = new Scanner(System.in);
//      
//      System.out.println("실수를 입력하시오");
//      double b1 = scr.nextDouble();
//      //float b = scr.nextFloat();
//      
//      if (a > 10.0) {
//         System.out.println(a + "는 10보다 크다");
//      }
//      else if (a==10) {
//         System.out.println(a + "는 10 이다.");
//      }
//      else 
//         System.out.println(a + "는 10보다 작다");
//         
//      
//      
//      System.out.println();
      
//      page 184, 185, 190, 191, 192 문제 풀이
//      // 예제 모음 11 단순 if 문을 활용한 간단한 계산기
//      Scanner scr = new Scanner(System.in);
//      int num1 = scr.nextInt();
//      System.out.println("첫번째 수를 입력하세요 : ");
//      System.out.println("연산자를 입력하세요 : ");
//      
      
      // 하나의 문자를 입력받는다, J 면 java 출력, D 면 database 출력, 그외는 none 출력
      
//      Scanner scr = new Scanner(System.in);
//      System.out.println("문자 하나를 입력하세요");
//      char chr1 = scr.next().charAt(0);
//      
//
//      switch(chr1) {
//      case 'j' :
//         System.out.println("Java");
//      break;
//      
//      case 'd' :
//         System.out.println("Database");
//      break;
//      
//      default :
//         System.out.println("none");
//      break;
//      }
//      
//      scr.close();
//      
//      
      
//      //page 194 실습 6-1
//      
//      for(int i = 0; i < 5 ; i++) {
//         System.out.println("안녕 for문");   
//      }
//      
//      // page 205 직접 풀어보기 6-4
//      int sum = 0;
//      for(int i=1 ; i<12346 ; i++) {
//         sum += i;
//      }
//      System.out.println("합계 : " + sum);
//      
//         
//      // page 206 
//      int sum1 = 0;
//      for (int i1 = 1; i1 <= 100 ; i1++) {
//         if(i1%3==0) {
//            sum1 += i1;
//         }
//         
//      }
//      System.out.println("1부터 100까지 3의 배수의 합계" + sum1);
//      
//      
//      // 1~10까지 범위 설정(random 함수)
//      int rdm = (int)(Math.random()*10)+1;
//      
//      for (int i2=1;i2<=10;i2++) {
//         System.out.println(rdm + " ");
//      }
//      
//      
      // page 230
//      for(;;) 무한루프 for문
      
      //page215 직접풀어보기 6-7
      
//      System.out.println("page215 직접풀어보기 6-7");
//      for (int i3 = 1 ; i3 <=9 ; i3++) {
//         for(int k1 = 2 ; k1 <=9 ; k1++) {
//            
//            System.out.print(k1 + "*" +i3 +"="+(k1*i3)+ "\t");
//         }
//         
//         System.out.println();
//      
//         
//         
//         
//      }

// 1행 9열
      // 1행 4공백 1별 
      // 2행 3공백 3별
      // 3행 2공백 5별
      // 4행 1공백 7별 
      // 5행 0공백 9별 
      // 6행 1공백 7별
      // 7행 2공백 5별
      // 8행 3공백 3별
      // 9행 4공백 1별
      // 행i 공백  별j
      
//      for (int i=0 ; i < 9 ; i++) {
//         if (i<5) {
//            for(int j =0 ; j<4-i ; j++) {
//               System.out.print(" ");
//            }
//            for (int j=0;j<i*2+1;j++) {
//               System.out.print("*");   
//            }
//         }
//         else {
//            for(int j = 0 ; j<i-4 ; j++) {
//               System.out.print(" ");
//            }
//            for (int j=0;j<17-i*2 ; j++) // j의 범위 구하는법 이전행을 참조해서 수식을 작성
//            System.out.print("*");
//            
//         }
//      System.out.println();
//      }
      
      

/*
      
      int i =1;
      while(i<=5) {
         System.out.println(i);
         i++;
      }
   
      
//      while(true) {} // 무한 루프 = for(;;)
      
      // 0~10까지 짝수 출력
      int i6 =0;
      while(i6<=10) {
         if(i6%2==0) {
            System.out.println(i6);   
         }
         i6++;
      }
      
      
      
      for(int i61=0; i61<=10; i61++) {
         if(i61%2==0) {
            System.out.println(i61);
         }

      }
*/
      
//      Scanner scr = new Scanner(System.in);
//      System.out.println("정수 단을 입력하세요");
//      int i62 = scr.nextInt();
//      
//         for(int i63 = 1 ; i63 <10 ; i63++)
//            System.out.println(i62*i63);
//      
//      scr.close();
      
      //1~100까지 총합 while 문
      
//      int i71 = 1, sum1=0;
//      while (i71<=100) {
//         sum1 = sum1+i71;
//         System.out.println("i71 : " + i71);
//         System.out.println("sum1 : " + sum1);
//      
//         i71++;
//         
//      }
//      System.out.println(sum1);
      
      Scanner scr = new Scanner(System.in);
//      System.out.println("이름을 입력하세요.");
//      String name = scr.next();
//      if(name.equals("홍길동")) {
//         System.out.println("아버지를 아버지라 부르지 못하고");
//      }
//      else {
//         System.out.println("홍길동이 아니구만");
//      }
      
//      while(true) {
//         System.out.println("이름 입력");
//         String name = scr.next();
//         if(name.equals("용현")) {
//            break;
//         }
//         System.out.println(name); // break 되면 실행되지 않음.
//      }
//      
//      scr.close();
      
      
      
//      // 랜덤함수가 1~6까지 출력 6이면 종료
//      while(true) {
//         int rdm = (int)(Math.random()*6)+1;
//         if(rdm==6) {
//            System.out.println("6이다 종료");
//            break;
//         }
//         System.out.println(rdm + "이다.");
//         
//      }
      /*
      int sum = 0, num1 = 100;
      Scanner scr7 = new Scanner(System.in);
      
      while(num1!=0) {
         System.out.println("입력해라");
         num1 = scr7.nextInt();
         
         sum = sum + num1;
         System.out.println(sum + " 0이면 끝난다.");
         
      }
      System.out.println(sum);
      */
      
      
      
      // 1번
      // 두 과목 점수를 입력하여 평균 출력하는 프로그램
      // (평균은 소수점 이하 첫재짜리까지 출력 출력결과) : 70 80 평균 75.0
      /*
      System.out.println("과목1 점수를 입력하세요");
      Scanner scr8 = new Scanner(System.in);
      float scr81 = scr8.nextFloat();
      
      System.out.println("과목2 점수를 입력하세요");
      float scr82 = scr8.nextFloat();
      
      System.out.println("과목의 합 : " +  (scr81+scr82));
      System.out.printf("과목 평균 : %.1f", (scr81+scr82)/2.0 );
      */
      
      //2번
      // 시간과 물건 개수로 금액 할인해주는 프로그램
      //(총 금액은 10만원으로 설정, 시간과 물건 개수는 입력받기)
      //14시에 마트를 방문하고 물건 개수가 3개 이하면 5%로 할인
      //18시에 마트를 방문하고 물건 개수가 5개 이하면 10%로 할인
      //20시에 마트로 방문하고 물건 개수가 10개 이하면 20%로 할인
      Scanner scr8 = new Scanner(System.in);
      System.out.println("방문시간을 입력하세요");
      int time = scr8.nextInt();
      
      System.out.println("물건 개수를 입력하세요");
      int count = scr8.nextInt();
      
      double money = 100000; // 총 금액
      
      if (time==14 && count<=3 ) {
         money = money * 0.95;
      }
      else if (time==18 && count<=5) {
         money = money * 0.90;
      }
      else if (time==20 && count<=10) {
         money = money * 0.85;
      }
      else {
         System.out.println("할인 없음");
      }
      
      System.out.println("가격 : " + money);
   
      
   }

}