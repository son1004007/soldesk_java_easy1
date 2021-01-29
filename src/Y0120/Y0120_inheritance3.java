package Y0120;
class Car1219{
	
	Car1219(){ // 기본 생성자. 
		System.out.println("슈퍼 클래스의 기본 생성자를 먼저 호출(파라미터 없음)");
	}
	
	Car1219(String str){ // 추가 생성자. 생성자 오버로딩 발생.
		System.out.println("슈퍼 클래스의 추가 생성자 호출 : "+str);
	}
}
class Sedan1219 extends Car1219{ // 부모 클래스 호출
	Sedan1219(String str){ // 기본 생성자는 부모 또는 자식 클래스 어느 위치에서든 먼저 호출된다.
		super(str); // 부모 클래스의 기본 생성자를 제외하고, 추가 생성자를 호출 한다. 
		System.out.println("서브 클래스의 추가 생성자 호출 : "+str);
	}
}
public class Y0120_inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// page 436 parents 와 child class 호출 순서
		// 슈퍼클래스 가 먼저 실행되고, 서브 클래스 생성자 내용이 호출된다.
		
		// 복습 퀴즈
		// 문제1. 생성자는 오버로딩 될 수 있다. > 파라미터(자료형)이 다를때 오버로딩 될 수 있다.
		// 문제2. 생성자가 여러개일때, (기본) 생성자가 먼저 호출된다.
		// 문제3. 인스턴스를 기본 생성자로 생성했을때, 생성자를 반드시 만들 필요는 없다.
		// 문제4. 생성자를 만드는 이유 ? : 일괄적으로 초기화를 하기 위해서.
		// 문제5. 생성자는 반환형이 있다/없다 : 없다.
		
		//page 437
		Sedan1219 sedan1 = new Sedan1219("여기요");
		
		
		
		
	}	
	

}
