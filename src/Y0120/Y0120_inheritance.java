package Y0120;
class People{ // �θ� Ŭ����
	int age;
	String name;
	
	void show() {
		System.out.println(age+""+name);
	}
}

class Student extends People{ // �ڽ� Ŭ����
	String major;
	
	void pr() {
		show(); // �θ� �Լ��� �����پ�
		System.out.println(major);
	}
}
public class Y0120_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�θ� Ŭ���� = ���� Ŭ���� = ���� Ŭ����
//		�ڽ� Ŭ���� = ���� Ŭ���� = ���� Ŭ���� 
		
		People p = new People();
		p.age=34;
		p.name="�⼮";
		p.show();
		
		
		
		Student s = new Student();
		s.age = 25; // �θ𿡰� ��ӹ޾Ƽ� �θ��� age,name������ show�Լ��� ����� �� �ִ�.
		s.name = "aaa";
		s.show();
	}

}
