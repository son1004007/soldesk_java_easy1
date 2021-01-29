package Y0128;

import java.util.Scanner;

//3. 1~100안의 정수를입력받아 3,6,9 중 하나가 있는 경우 “짝”, 두 개 있는 경우 “짝짝”,
//하나도 없으면 “땡”을출력해라. 
//(정수값이 39라고 할 때, n/10=3, n%10=9 이 나온다.   (/, % 연산자 활용))
//실행 결과) 입력:39                
//짝짝


//4.  컨텐트팬의 배경색을 빨간색으로 하고, Ok, Cancel 버튼을부착한 frame하나 만들어라
// Ok버튼을 누르면 “확인”, Cancel을 누르면 버튼을 비활성화 시켜라. 
//(MouseAdapter로 접근)

public class Y0128_1145 {
	public static void main(String[] args) {
		System.out.println("1~100 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("음수는 안됩니다.");
		}
		else if(n>100) {
			System.out.println("100보다 크면 안됩니다.");
		}
		if (n/10 ==3 || n/10 == 6 || n/10 == 9) {
			System.out.print("짝");
			if(n%10 == 9 || n%10 == 6 || n%10 == 3) {
				System.out.print("짝");
			}
		}
	}

}
