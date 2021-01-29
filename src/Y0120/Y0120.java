package Y0120;
class Person1229{
	private String name;
	
	Person1229(String name){
		this.name=name;
	}
	void name() {
		System.out.println(name);
	}
}


class Student1229 extends Person1229{
	private String major;
	private String school;
	
	Student1229(String name, String major, String school){
		super(name); //super는 반드시 첫번째에 작성해야 한다.
		// 부모에 있는 생성자를 호출한다.
		this.major= major;
		this.school=school;
	}
	void show() {
		name();
		System.out.println(major+""+school);
	}
}


public class Y0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person1229 p = new Person1229("기숙");
		Student1229 s = new Student1229("wkl","whdak","tjsgo");
		
		
		p.name();
		s.show();
				
		
		
		
		// 복습 문제 page 402
		// 문제1. public은 다른 패키지에서 접근가능하다
		// 문제2. protected는 같은 패키지에서만 접근 가능하다(다른패키지에서 접근 불가능하다)
		// 문제3. default는 같은 패키지에서만 접근 가능하다.
		// 문제4. default는 선언하면 서브클래스에서 쓸수 있다/없다 : 없다.
		
		
		
		//15:08 문제. 뭐가 출력되는지 예상하라.
		// 0-2, 0-3 배열 2차원배열 3행 4열
		// 0 1 2 3
		// 1 2 3 4
		// 2 3 4 5
		
		
		
	}	
	

}
