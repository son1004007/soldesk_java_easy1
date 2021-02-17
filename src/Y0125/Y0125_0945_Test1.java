package Y0125;

public class Y0125_0945_Test1 {
	public static void main(String[] args) {
		/*
		 * 1. main()를 보고 클래스를 작성해라.
 main(){
Point p = new Point(3,4);
System.out.println(p);   //3.4출력 

 

2. 주민번호 “841111-1234560”을 초기화하여여성인지 남성인지 출력해
(7번째 숫자가 1이면 남성, 2이면여성 – switch case사용)
		 */

//		Point125 p = new Point125(3,4);
//		Point125 p = new Point125(3,4);
//		System.out.println(p);
		
		String jumin = "841111-1234560";
		String jen=jumin.substring(7,8);
		
		switch(jen) {
		case"1" :
			System.out.println("남자");
			break;
		case"2" :
			System.out.println("여자");
			break;
		}
	}
	class Point125 {
		int a, b;
		Point125(int a, int b){
			this.a = a;
			this.b = b;
		}
		public String toString() { //객체를 문자열로 변경하는 함수
			return a+"."+b;
		}
		
	}
}
