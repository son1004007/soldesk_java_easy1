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
		super(name); //super�� �ݵ�� ù��°�� �ۼ��ؾ� �Ѵ�.
		// �θ� �ִ� �����ڸ� ȣ���Ѵ�.
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

		
		Person1229 p = new Person1229("���");
		Student1229 s = new Student1229("wkl","whdak","tjsgo");
		
		
		p.name();
		s.show();
				
		
		
		
		// ���� ���� page 402
		// ����1. public�� �ٸ� ��Ű������ ���ٰ����ϴ�
		// ����2. protected�� ���� ��Ű�������� ���� �����ϴ�(�ٸ���Ű������ ���� �Ұ����ϴ�)
		// ����3. default�� ���� ��Ű�������� ���� �����ϴ�.
		// ����4. default�� �����ϸ� ����Ŭ�������� ���� �ִ�/���� : ����.
		
		
		
		//15:08 ����. ���� ��µǴ��� �����϶�.
		// 0-2, 0-3 �迭 2�����迭 3�� 4��
		// 0 1 2 3
		// 1 2 3 4
		// 2 3 4 5
		
		
		
	}	
	

}
