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

		// ����ȯ
//		Student2 s = new Student2("�⼮"); // ��ü ����. Ŭ���� �̸��� �յڰ� ���� �Ϲ���.
//		System.out.println(s.name); 
		
		Person2 p = new Student2("�⼮"); 
		//�ڽ� Ŭ������ �θ� Ŭ������ ����ȯ �ϴ� �۾�. up-casting �̶�� �Ѵ�.
		
		Student2 s = (Student2)p; 
		// �θ� Ŭ������ �ڽ� Ŭ������ ����ȯ �ϴ� �۾�. down-casting
		// �ٿ� ĳ�����Ҷ��� �ݵ�� �ڽ�Ŭ������ ����ؼ� ����ȯ
		
		System.out.println(p.name);
		System.out.println(s.name);
		
		//�θ� �ڽ� Ŭ���� Ȯ��
		// �θ� �ڽ����� down casting, �ڽ��� �θ�� up casting
		Fruit f1 = new Apple("red", 10); // �ڽ��� apple, �θ� fruit
		f1.show();
		
		
		
	}

}
