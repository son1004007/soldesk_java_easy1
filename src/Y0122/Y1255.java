package Y0122;
// Person (Student, Worker(ITWorker))
class Person{}
class Student extends Person{}
class Worker extends Person{}
class ITWorker extends Worker{}

public class Y1255 {

	static void show(Person p) {
		
		if(p instanceof Person) {
			System.out.println("Person");
		}
		if(p instanceof Student) {
			System.out.println("Student");
		}
		if(p instanceof Worker) {
			System.out.println("Worker");
		}
		if(p instanceof ITWorker) {
			System.out.println("ITWorker");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person (Student, Worker(ITWorker))
		
		//Person p = new Person();
		//Student s = new Student();
		//Worker w = new Worker();
		//ITWorker i = new ITWorker();
		
		//Person p = new Student(); �ڽ��� �θ�� ����ȯ up casting
		//Person p = new Worker();
		//Person p = new ITWorker();
		
		show(new Student()); // Person�� ��� �޾Ƽ�, Person�� ��°���� Student ��°���� ���
		show(new Worker()); // Person�� ��� �޾Ƽ�, Person�� ��°���� Worker ��°���� ���
		show(new ITWorker()); // Person�� Worker�� ��� �޾Ƽ�, Person�� Worker ��°���� ITWorker ��°���� ���
		
	}

}
