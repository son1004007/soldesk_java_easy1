package Y0203;

class Sh {
	private int num = 0;
	
	public void add() {
		int n = num;
		Thread.yield();	// 다른 스레드에게 양보 th1이 th2에게 양보
		n += 10;
		num = n;
		System.out.println(num);
		}
}

class Student extends Thread {
	String name;
	Sh s;
	Student(String name, Sh s){
		this.name = name;
		this.s = s;
	}
	public void run() {
		try {
		for(int i=0; i< 10; i++) {
			s.add();
			Thread.sleep(1000);
		}
		}catch(Exception e) {}
		
	}
	
}

public class Y0203_1145 {
//	5. 다음 클래스와 main()을 보고 쓰레드를 생성하는 Student클래스를 작성해라
//	출력이 10,20,30,……10씩 증가시키게끔 해라.(add메소드를 조금 바꿔라)-동기화

	public static void main(String[] args) {
		Sh sh = new Sh();
		Student th1 = new Student("jack", sh);
		Student th2 = new Student("tom", sh);
		try {
			th1.start();
			th1.join();	// 동기화
			th2.start();
			th2.join();
			}catch(Exception e) {}
	}


}


// NCS 시험 문제 ; java 소스 코드 압축 전송
// File > Export > General > Archive file > 모두 선택 > browser : 저장 위치 