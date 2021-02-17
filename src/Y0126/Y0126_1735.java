package Y0126;
interface Cal1735{
	int total(int a, int b); // a~b까지 합 리턴
	int big(int a, int b); // 두수 중 큰값 삼항연산자
}
class Calcu implements Cal1735{
	public int total(int a, int b) {
		int sum =0;
		for(int i =a; i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
	public int big(int a, int b) {
		return a>b?a:b;
	}
	
}
public class Y0126_1735 {
	public static void main(String[] args) {
		// 자식클래스는 Calcu
		Cal1735 c = new Calcu();

		System.out.println(c.total(1,10));
		System.out.println(c.big(5,2));
	}
	
}
