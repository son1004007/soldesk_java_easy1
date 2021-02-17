package Y0121;
abstract class Car{		// 추상 클래스
	String name;
	void run() {		// 일반 메소드
		System.out.println("차가 움직인다.");
	}
	abstract void stop(); {// 추상 메소드(빈껍데기 함수). 추상 메소드가 있으면 클래스는 반드시 추상 클래스여야 한다.
		// 내용을 입력할 수 없다.
	}
}
class Sedan1 extends Car{
	Sedan1(){
		name="차이름";
	}
	void stop(){
		System.out.println("stop ");
	}
	
}
//추상 클래스안에는 일반적인 메소드, 추상 메소드 둘다 가능
//추상18

public class Y0121_1545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
