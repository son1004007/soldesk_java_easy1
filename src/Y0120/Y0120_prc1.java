package Y0120;
// 부모의 기본 생성자가 우선된다.
// super(변수)를 입력하면, 기본 생성자보다 추가 생성자가 우선된다.
// 추가 생성자에서 기본 생성자를 다시 호출하기 위해서, this()로 Book103을 호출 했다.

class Book103{ 
	Book103(){ // Book의 기본 생성자
		System.out.println("Book 클래스 $기본$ 생성자");
	}

	Book103(String a){ // Book의 추가 생성자
		this(); 
		// this는 자신의 class를 가르킨다. this() 디스메소드는 클래스의 기본 생성자를 가르킨다.
		// 따라서 this()는 Book103()을 호출.
		System.out.println("Book 클래스 %추가% 생성자 "+a);
	}
}


class ComputerBook extends Book103{
	
	ComputerBook(String a){
		super(a); // 부모의 추가 생성자 강제 호출.
		System.out.println("ComputerBook 클래스 $기본$ 생성자");
	}
}

public class Y0120_prc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerBook sedan1 = new ComputerBook("굿 자바");

		
	}

}
