//1. 5부터 10까지의 정수형 데이터를 입력 받아5~10 이외의 정수형이 입력되면 “다시 입력”이라고 출력 한다. 
//입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지 홀수만 더하는 프로그램을 작성 해라. 
//(calculate()함수는int형 정수를 입력 받아 1부터 입력 받은 숫자까지 홀수의 합을 구하여리턴하는 함수)

package Y0129;

import java.util.Scanner;

class Calc0129_1045{
		
	int calculate(int a){
		int sum =0;
		for(int i =1 ; i< a;i+=2) {
			sum+=i;
			System.out.println(i);
		}
		return sum;
	}
}
public class Y0129_1045_prc1 {

	public static void main(String[] args) {
		
		Calc0129_1045 c =new Calc0129_1045();
		Scanner sc = new Scanner(System.in);
		System.out.println("5~10 정수를 입력하세요.");
		int a = sc.nextInt();
		
		if(a <= 5 || a >= 10) {
			System.out.println("다시 입력");
		}
		System.out.println(c.calculate(a));
		
		
	}
}
