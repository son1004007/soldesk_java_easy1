// 부모의 기본 생성자가 우선된다.
// super(변수)를 입력하면, 기본 생성자보다 우선된다.
class Book103{
	Book103(){
		System.out.println("Book 클래스 $기본$ 생성자");
	}
	
	Book103(String a){
		this(); // this는 자신의 class를 가르킨다. class Book103을 처음부터 다시 호출.
		System.out.println("Book 클래스 %추가% 생성자 "+a);
	}
}


class ComputerBook extends Book103{
	
	ComputerBook(String a){
		super(a); // 부모의 추가 생성자 강제 호출
		System.out.println("ComputerBook 클래스 $기본$ 생성자");
	}
}

public class Y0120_prc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerBook sedan1 = new ComputerBook("굿 자바");
		
	}

}
