import java.util.Scanner;
public class Y0115_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //비대면 문제
		   //1. 1~10까지의 총곱을 출력해라.(while)
		System.out.println();
		   System.out.println("문제1 1~10까지 총 곱");
		   int mul1=1, i1=1;
		   while(i1>=10) {
			   //mul1=mul1*i1;
			   mul1*=i1;
		   }
		   System.out.println(mul1);
		   
		   
		   //2. 구구단의 짝수단만 출력하면서 해당되는 단의 범위까지
		   //(2단은 2*2, 4단은 4*4, 6단은 6*6, 8단은 8*8)출력해라.(break)
		   System.out.println();
		   System.out.println("문제2 구구단 짝수만 출력");
		   for (int i = 2 ; i<=9 ; i+=2) {
			   for (int j = 1; j<=9 ; j++) {
				   System.out.println(i + "*"+j+"="+i*j);
				   
				   if (i==j) {
					   break;
				   }
				   
			   }
		   }
		   
		   //3. main함수를 보고 adder, exp 함수를 작성해라.
		   		System.out.println();
	          System.out.println("문제3 시작");
	          int result=adder(10,20);    //두 수의 합 출력

	          System.out.println("result : "+result);

	          System.out.println(exp(3.5));   //3.5의 제곱한 값 출력

	          
//	          4. 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드를 만들어라.
//
//	          (두가지 과정으로) (메소드명은 임의로 준다.)
//
//	          4.1) 출력을 main에서 하기!
//
//	          4.2) 출력을 메소드안에서 하기!
	          System.out.println();
	          System.out.println("문제4 시작");
	          Scanner tmp = new Scanner(System.in);
	          System.out.print("반지름 입력 : ");
	          double a = tmp.nextDouble();
	          
	          double j = a*2*3.14;
	          System.out.println("원의 넓이 : "+j);
	          
	          //4-1 출력을 메인에서
	          System.out.println("문제 4-1");
	          System.out.println(mul2(a));
	          
	          // 4-2 출력을 메소드에서
	          System.out.println("문제 4-2");
	          mul1(a);
	          
	          
//	      	5. 	1  3  5  7  9  이러한 모양의 2차원 배열 출력해라.
//
//	    	11 13 15 17 19 
	          System.out.println();
	          System.out.println("문제 5번");
	          int n5=1;
	          int array51[][] = new int[2][5];
	          for (int i5=0 ; i5 <2; i5++) {
       	  
	        	  for(int j5=0; j5<5; j5++) {
	        		  array51[i5][j5]=n5;
	        		  n5+=2;
	        		  System.out.printf("%2d\t", array51[i5][j5]);
	        	  }
	        	  System.out.println();
	          }
	          
	        	  int array5[][] = {{1,3,5,7,9},{11,13,15,17,19}};
	          for (int i5=0 ; i5<array5.length ; i5++) {
	        	  for (int j5=0 ; j5<array5[i5].length ; j5++) {
	        		  System.out.print(array5[i5][j5]+", ");
	        	  }
	        	  System.out.println();
	          }
	          

	    	 

//	    	6. 문자열 a에 “C++”, b에 “, JAVA”를 초기화해라.
//
//	    	6-1) 문자열 a의 길이를 출력해라.
//
//	    	6-2) a,b의 문자열을 연결해라.
//
//	    	6-3) 인덱스 3부터 끝까지 출력해라.
//
//	    	6-4) JAVA를 “C#”으로 변경해라 
//
//	    	6-5) ,를 기준으로 문자열을 분리해라.
	          System.out.println();
	          System.out.println("문제 6번");
	          
	          String a6 = "C++", b6=", JAVA";
	          
	          System.out.println("6-1 : "+a6.length());
	          
	          
	          String c = a6.concat(b6);
	          System.out.println("6-2 : "+ c);
	          
	          
	          
	          
	          System.out.print("6-3 : ");
	          for(int i6 =3; i6<c.length();i6++) {
	        	  System.out.print(c.charAt(i6));
	          }
	          System.out.println();
	          
	          System.out.println("6-3 : "+c.substring(3,c.length()));
	          System.out.println("6-3 : "+a6.concat(b6).substring(3,a6.concat(b6).length()));
	          
	          
	          System.out.println("6-4 : "+c.replace("JAVA", "C#"));
	          
	          
	          String d[] = c.split(",");
	          for (String e:d) {
	        	  System.out.println("6-5 : "+e);
	          }
	          for (int i65 = 0; i65 < d.length ; i65++) {
	        	  System.out.println("6-5 : "+ d[i65]);
	          }
	          
	}
	
	//문제3
	static int adder(int a, int b) {
		int sum = a+b;
		return sum;
	}
	static double exp(double a) {
		double b= a*a;
		return b;
	}
	//문제4-1 출력을 메인에서
	static double mul2(double a) {
		double j = a*2*3.14;
		return j;
	}
	// 문제4-2 출력을 메소드에서
	static void mul1(double a) {
        double j = a*2*3.14;
        System.out.println("원의 넓이 : "+j);
	}
	




}
