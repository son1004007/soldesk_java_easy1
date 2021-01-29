package Y0120;
class People{ // 부모 클래스
	int age;
	String name;
	
	void show() {
		System.out.println(age+""+name);
	}
}

class Student extends People{ // 자식 클래스
	String major;
	
	void pr() {
		show(); // 부모 함수를 가져다씀
		System.out.println(major);
	}
}
public class Y0120_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		부모 클래스 = 상위 클래스 = 슈퍼 클래스
//		자식 클래스 = 하위 클래스 = 서브 클래스 
		
		People p = new People();
		p.age=34;
		p.name="기석";
		p.show();
		
		
		
		Student s = new Student();
		s.age = 25; // 부모에게 상속받아서 부모의 age,name변수와 show함수를 사용할 수 있다.
		s.name = "aaa";
		s.show();
	}

}
