package Y0121;
import java.util.Scanner;
class Num extends Exception{ //Num 클래스 상속 받는다. API 기본 라이브러리 Exception
	Num(){
		super("음수 입니다.");
		// 부모 생성자 호출(Exception)
	}
}
public class Y0121_1630 {

	static Scanner tmp = new Scanner(System.in);
	
	static int in() throws Num {
		int a = tmp.nextInt();
		
		
		if(a<0) { // 조건 설정 
			Num n= new Num();
			throw n; // n을 Num에 던진다.
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("양수 입력");
		try { // in() 메소드가 정수가 아닌 경우를 처리하기 위해 예외처리 
			int n = in(); //정수 입력하는 함수
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
