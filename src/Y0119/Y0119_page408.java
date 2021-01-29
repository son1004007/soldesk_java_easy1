package Y0119;
class Profile2{
	
	String a,b;
	
	Profile2(String a, String b){
		this.a=a;
		this.b=b;
		
	}
}


public class Y0119_page408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profile2 p1 = new Profile2("010-1234-5678","장군");
		Profile2 p2 = new Profile2("010-2345-9876","승훈");
		
		System.out.println(p1.a+" "+p1.b);
		System.out.println(p2.a+" "+p2.b);
	}

}


/*
 * 클래스명을 확인한다.
 * 생성자 호출 부분을 보고 필드값을 적는다.
 * 파라미터가 있는 생성자일 경우 생성자를 반드시 만든다. // 생성자는 클래스명과 동일하다.
 * 
*/
