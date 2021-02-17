package Y0122;

import java.util.Scanner;

class XY{
	int a,b;
	void set(int a, int b){
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+""+b);
	}
}
class XYZ extends XY{
	String s;
	void color(String s) {
		this.s=s;
	}
	void show() {
		//System.out.println(a+""+b+""+s); 줄안바꾸려고 찍음.
		super.show();
		System.out.println(s);
	}

}
public class Y0122_1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3. Main()를 보고 클래스 구현해라
//		(XY는 슈퍼클래스, XYZ는 서브클래스)
//		main(){
		 XY x= new XY();
		 x.set(1,2);
		 x.show();         //1,2 출력

		 XYZ xy=new XYZ();
		 xy.set(4,5);
		 xy.color("blue");
		 xy.show();       //4,5,blue 출력   

		 

//		4. 두 사람이 가위바위보를 한다. 가위,바위,보 중 하나를 문자열로 입력받아 누가 이겼는지 판단하는 프로그램을작성해라.
//		(중첩 if문 사용해야함, 문자열 비교) 
//		실행결과) 영수 : 가위
//		        철수 : 보
//		       철수가 이겼다.
		 
		 String a="가위", b="바위", c="보", d, e;
		 
		 Scanner tmp = new Scanner(System.in);
		 
		 System.out.println("영수 :" );
		 d = tmp.next();
		 if (d.equals("가위")) {
			 e=tmp.next();
			 if(e.equals("가위")) {
				 System.out.println("비김");
			 }
			 else if(e.equals("바위")) {
				 System.out.println("짐");
			 }
			 else {
				 System.out.println("이김");
			 }
			 
		 }
		 
		 
		 
	}

}
