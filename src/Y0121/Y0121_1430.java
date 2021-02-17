package Y0121;
class Person2{
	String name;
	String id;
	Person2(String name){
		this.name=name;
	}
}
class Student2 extends Person2{
	Student2(String name){
		super(name);	
	}	
}
class Student3 extends Person2{
	Student3(String name){
		super(name);
	}
}

class Fruit{
	String a;
	int b;
	Fruit(String a, int b){
		this.a=a;
		this.b=b;
	}
	void show(){
		System.out.println(a+" "+b);
	}
}

class Apple extends Fruit{
	Apple(String a, int b){
		super(a,b);
	}
}

public class Y0121_1430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형변환
//		Student2 s = new Student2("기석"); // 객체 생성. 클래스 이름이 앞뒤가 같은 일반적.
//		System.out.println(s.name); 
		
		Person2 p = new Student2("기석"); 
		//자식 클래스를 부모 클래스로 형변환 하는 작업. up-casting 이라고 한다.
		
		Student2 s = (Student2)p; 
		// 부모 클래스를 자식 클래스로 형변환 하는 작업. down-casting
		// 다운 캐스팅할때는 반드시 자식클래스를 명시해서 형변환
		
		System.out.println(p.name);
		System.out.println(s.name);
		
		//부모 자식 클래스 확인
		// 부모를 자식으로 down casting, 자식을 부모로 up casting
		Fruit f1 = new Apple("red", 10); // 자식이 apple, 부모가 fruit
		f1.show();
		
		
		
	}

}
