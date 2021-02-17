package Y0125;
class Book{
	String a,b;
	
	Book(String a, String b){
		this.a=a;
		this.b=b;
	}

	Book(String a){
//		this.a=a;
//		b = "작가 미상";
		this(a,"작가 미상"); // a, b 각각 선언하는 것보다 이게 더 깔끔(메모리 점유를 낮게)한다.
	}
	
	Book(){
		this("생성자 호출", ""); // a, b각각 선언하는 것보다 이게 더 깔끔하다.
//		a = "생성자";
//		b = "호출!!!";
	}
	void show() {
		System.out.println(a + " " + b);
	}
}

public class Y0125_1500_test {
	
	public static void main(String[] args) {
		//문제1 main함수를 보고 작성해라.
		Book b1 = new Book("멋진 세계", "올더스 헉슬리");
		Book b2 = new Book("더 해빙");
		Book b3 = new Book();
		
		b1.show();
		b2.show();
		b3.show();
		
//		실행 결과) 멋진 신세계 올더스 헉슬리
//      더 해빙 작가 미상
//      생성자 호출!! 
		
	}
}
