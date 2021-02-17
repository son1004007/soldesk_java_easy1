package Y0119;
class Book{
	String a=""; //  필드(변수)
	int b;
	Book(String a, int b){ // 메소드(함수)
		this.a = a; // 필드의 a에 메소드의 a를 입력한다. 
		this.b = b;
		
	}
	Book(String a){
//		this.a =a;
		this(a,2220); 
// this 용도1. 필드 이름과 매개변수 이름이 같을 때, 필드 이름 앞에 this
// this 용도2. 다른(위에 있는) 생성자 호출
		
	}
	Book(){
		this("", 0);// 위(String a, int b) 생성자 호출
		System.out.println("기본 생성자 호출"); // 기본 생성자가 제일 먼저 호출되기 때문에 생성자 호출이 출력된다. 
	}
	
	void show() {
		System.out.println(a+" "+b);
	}
	
}
public class Y0119_prc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b 	= new Book("하멜표루기", 30000);
		Book b1	= new Book("총균쇠");
		Book b2 = new Book();
		
		b.show(); //하멜표루기 30000
		b1.show(); //총균쇠 2220
		b2.show();
		
	}

}
