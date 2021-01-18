class Profile{
	private int age1 ;   // private 는 다른 class에서 접근 불가능
	int age ;  // 필드 선언
	String name ; // 필드(변수) 선언
	
	void show() { // 메소드 선언
		System.out.println(age+" "+name); // 메소드 내용
	}
	
	
}

public class Y0118_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profile p1=new Profile(); // 인스턴스(객체) 선언 :p1
		p1.age = 30; // 인스턴스의 필드를 초기화
//		p1.age1 = 30; // private 는 다른 class에서 접근 불가능
		p1.name = "변수"; 
		p1.show(); // 인스턴스의 메소드(함수) 호출
		
	}

}
