package Y0203;

class Sh {
	private int num = 0;
	
	public void add() {
		int n = num;
		Thread.yield();	// �ٸ� �����忡�� �纸 th1�� th2���� �纸
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
//	5. ���� Ŭ������ main()�� ���� �����带 �����ϴ� StudentŬ������ �ۼ��ض�
//	����� 10,20,30,����10�� ������Ű�Բ� �ض�.(add�޼ҵ带 ���� �ٲ��)-����ȭ

	public static void main(String[] args) {
		Sh sh = new Sh();
		Student th1 = new Student("jack", sh);
		Student th2 = new Student("tom", sh);
		try {
			th1.start();
			th1.join();	// ����ȭ
			th2.start();
			th2.join();
			}catch(Exception e) {}
	}


}


// NCS ���� ���� ; java �ҽ� �ڵ� ���� ����
// File > Export > General > Archive file > ��� ���� > browser : ���� ��ġ 