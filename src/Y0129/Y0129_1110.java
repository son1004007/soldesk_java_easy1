package Y0129;

import java.util.Scanner;

//3. 다음 main()을 보고 코드를 작성해라. (Cal은 인터페이스, a,b,는 두 정수를 입력받아 a부터 b까지 총합)
//Cal c= new Show();
//System.out.println(c.cal(a,b));

//4. 다음 main()을 보고 Gen클래스를 만들어라.
//Gen<String> g=new Gen<String>(“seoul”,”busan”);
//System.out.println(g.one());   //seoul 출력
//System.out.println(g.two());   //busan 출력
//System.out.println(g.three(T t));  //false 출력 (두 문자열 비교) 
interface Cal{
	public int cal(int a, int b);
}
class Show implements Cal{
	
	public int cal(int a, int b) {
		
		int sum =0;
		if(a<b) {
			for(int i=a; i<b ; i++) {
				sum +=i;
			}
		}
		else {
			for(int i=b; i<a ; i++) {
				sum +=i;
			}
		}
		return sum;
	}
}

public class Y0129_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Cal c = new Show();
		System.out.println(c.cal(a, b));
	}

}
