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
		
		//Person p = new Student(); 자식을 부모로 형변환 up casting
		//Person p = new Worker();
		//Person p = new ITWorker();
		
		show(new Student()); // Person을 상속 받아서, Person을 출력결과와 Student 출력결과를 출력
		show(new Worker()); // Person을 상속 받아서, Person을 출력결과와 Worker 출력결과를 출력
		show(new ITWorker()); // Person과 Worker를 상속 받아서, Person과 Worker 출력결과와 ITWorker 출력결과를 출력
		
	}

}
