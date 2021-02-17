package Y0119;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Y0119 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// 1. ���ڿ��� ���Ϸ� �����ϴ� �ڵ�
		FileWriter fw = new FileWriter("i.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		// ���ۿ� �����ؼ� �ӵ� ���̸� �غ�
		
		bw.write("�����ϴ� ���ڿ�");
		bw.newLine();
		char a[]= new char[] {'��','ȭ','��'}; // 
		bw.write(a); // ���ڸ� a(��, ȭ, �� ����)
		bw.close();
		
		
		// 2. ������ ���ڿ��� �о���� �ڵ� : Buffered Reader �̿�
		FileReader fr = new FileReader("i.txt");
		BufferedReader br = new BufferedReader(fr); // readLine�� ����ϱ� ���ؼ�
		
		String str;
		
		
		while(true) { // ���� �ݺ� 
			str = br.readLine();
			System.out.println(str);
			if(str==null) { // ���ڿ��� ������(null)
				break; // ���ѷ��� ����
			}
			
		}
		
		
		br.close();
		
		
		
		// 3. file input stream���� �б� > byte �迭�� �̿��ؼ�, ���ڿ��� ����
		// page 367 �ǽ� 10-10
		
		FileInputStream fis = new FileInputStream("i.txt");
		
		int ch;
		byte bt[] = new byte[1024];
		
		int i = 0;
		while((ch = fis.read())!= -1) {
			bt[i] = (byte) ch;
			i++;
		}
		
		System.out.println(new String(bt));
		fis.close();
				
		

//		inputstream = -1 (byte �����̱� ������)
//		reader = null? (�����̱� ������)
		// page 377 ����
		
		
		
		
		// Ŭ���� ���� ��� 
		// class Ŭ������ {} // class Car {};
		
		// �ν��Ͻ� ���� ��� 
		// Ŭ������ ������ = new Ŭ������(); // Car mycar1 = new Car(); 
		
		// �ν��Ͻ� �ʵ忡 �� �����ϱ� 
		// ������.�ʵ��̸� = ��; // mycar1.color = "����"
		
		// �ν��Ͻ� �ʵ忡 �޼ҵ� ȣ���ϱ�
		// ����.�޼ҵ�(); // mycar1.upspeed();
		
		
		
		//page 402 : 
		// public / protected / default / private
		// same class / same package / sub class / external class
		
		// package > class > method
		
		// page 404 ���� �߰� 
		// Ŭ���� �ȿ� 1���� public class�� 1�����̴�.
		// public class �̸��� �����̸��� ���ƾ� �Ѵ�.
		// default class�� �����Ҷ� default�� �����Ѵ�.

		// page 406 ������(constructure)�� �߿��ϴ�.
		// 1) class�� �̸��� ������ �޼ҵ� 
		// 2) �ʱ�ȭ �Ҷ� ���
		// 3) ���ϰ��� ����.
		
		
		
//public class Y0119 {
//public static void main(String[] args) ���� ����.
		
		Music m = new Music(); // ��ü ����
		m.title="VVS";
		m.price=30000;
		
		m.show();
		
		
		// Music2("Test", 9999) == ��ü ������. ������ �°Բ� �ۼ�
		Music2 n = new Music2("VVS_Test", 9999); 
		n.show2();
		
		
		
		//class ����
		
		Rec r1=new Rec(4,7);
		Rec r2=new Rec(7,9);

		r1.area();
		r2.area();
		
		
		System.out.println((r1.a)*(r1.b));
		System.out.println((r2.a)*(r2.b));
		
		
		
	}
}

class Music{
	String title;
	int price;
	void show() {
		System.out.println("class�� �̿��ϴ� ��");
		System.out.println(title+" "+price);
	}
}

class Music2{
	String title;
	int price;
	
	Music2(String t, int p){
		title = t;
		price = p;
	}
	
	void show2() {
		System.out.println("class2�� �̿��ϴ� ��");
		System.out.println(title+" "+price);
	}

}

class Rec{
	int a,b; // �ʵ�(����)
	Rec(int a, int b){
		this.a= a;	// this.a(�޼ҵ� Rec int a)�� Ŭ������ int a,b;�� �Է��Ѵ�. 
		this.b=b;	// this.b(�޼ҵ� Rec int b)�� Ŭ������ int a,b;�� �Է��Ѵ�.
		
	}
	void area(){ // �޼ҵ�(�Լ�)
		System.out.println(a*b);
	}
	
}