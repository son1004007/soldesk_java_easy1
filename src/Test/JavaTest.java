package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class JavaTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		// 1�� ����
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ������ �Է� : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.print("���� : " +(num1+num2));
		
		
		
		
//		// 2�� ����
//		Scanner sc = new Scanner(System.in);
//		Circle[] c = new Circle[5];
//		for (int i =0; i<c.length ; i++) {
//			System.out.print((1+i)+"��° ������ �Է� : ");
//			double r = sc.nextDouble();
//			c[i] = new Circle(r);
//		}
//		for (int i =0; i<c.length ; i++) {
//			System.out.println("���� : "+c[i].area());
//		}
		
		// 3�� ����
//		Num nb = new Num();
//		nb.add(7); 
//		nb.add(-1); 
//		nb.add(20); 
//		nb.add(5); // 4�� ���ڸ� �Է�
//		System.out.println("Sum = " + nb.getSum());   // 4�� ������ �հ�
//		System.out.println("Max = " + nb.getMax());   // 4�� ���� �� �ִ밪
		
		
		
//		// 4 ��
//		HashMap<String, Integer> h= new HashMap<String, Integer>();
//		h.put("name1", 1);
//		h.put("name2", 2);
//		h.put("name3", 3);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸� �Է� : ");
//		System.out.println("����� �̸� : name1, name2, name3");
//		String name = sc.next();
//		h.get(name);
//		System.out.println(h.get(name));
//		sc.close();
		
		
		
		// 5 ��
//		JFrame j = new JFrame();
//		j.setTitle("Dial");
//		j.setVisible(true);
//		j.setSize(200,200);
//		j.setLayout(new FlowLayout());
//		JButton[] btn = new JButton[9];
//		for (int i =0; i< 10 ; i++) {
//			btn[i] = new JButton(""+(i+1));
//			j.add(btn[i]);
//		}
		
		
		// 6 �� ����
		Student s = new Student("jack", "123", 20);
		s.show();
		try {
			ObjectOutputStream os = 
					new ObjectOutputStream(new FileOutputStream("java.txt"));
				os.writeObject(s.name);
				os.writeObject(s.sid);
				os.writeObject(s.age);
			
			
			ObjectInputStream is =
					new ObjectInputStream(new FileInputStream("java.txt"));
				is.readObject();
			
		}catch(Exception e) {}
	}
	
	
}
// 2�� ����
//class Circle{
//	private double r;
//	Circle(double r){
//		this.r = r;
//	}
//	double area() {
//		return 3.14*r*r;
//	}
//}


//3�� ����
//class Num{
//	// �Էµ� ������ �հ� �Է� ���� �� �ִ� ���� ���ϴ� Num 
//	int sum=0;
//	int max=0;
//	int n=0;
//	
//	Num(){
//		n = 0;
//	}
//	
//	Num(int n){
//		this.n=n;
//	}
//	
//	void add(int n) {
//		sum += n;
//		if(max < n) {
//			max = n ;
//		}
//	}
//	
//	int getSum() {
//		return sum;
//	}
//	
//	int getMax() {
//		return max;
//	}
//}


// 6�� ����
class Student{
	String name;
	String sid;
	int age;
	
	Student(String name, String sid, int age){
		this.name = name;
		this.sid = sid;
		this.age = age;
		
	}
	void show() {
		System.out.println(name+" "+sid+" "+age);
	}
}

