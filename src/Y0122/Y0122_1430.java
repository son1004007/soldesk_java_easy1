package Y0122;

interface A{ // 인터페이스 이기 때문에 객체생성이 불가능(추상 클래스와 동일)
	public void funcA(); // 추상 메서드
}
interface B{
	public void funcB();
}

interface C extends A,B{ // 다중 클래스 상속을 위한 interface 사용
	public void funcC(); // 추상 메서드
}

class D implements C{ //클래스가 인터페이스를 상속 받을때는 implements 를 쓴다.
	public void funcA() {
		System.out.println("funcA");
	}
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcC() {
		System.out.println("funcC");
	}
	
}

public class Y0122_1430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D(); //D 클래스 객체
		A a1=d1;	// 부모에게 자식을 upcasting 
		a1.funcA(); // 
		
		B b1=d1;	// 부모에게 자식을 upcasting 
		b1.funcB(); // 
		
		C c1=d1;	// 부모에게 자식을 upcasting 
		c1.funcC(); // 
		

	}

}
