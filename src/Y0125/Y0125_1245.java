/*
 * package Y0125;


import java.util.Scanner;

class PhoneNum{
	String name;
	String phone;
	
	PhoneNum(String n, String p){
		name = n;
		phone = p;
	}
	void show() {
		System.out.println("�̸�" + name);
		System.out.println("����" + phone);
	}
}
class School extends PhoneNum{
	//���� �߰�
	String major;
	School(String n, String p, String major){
		super(n,p);
		this.major = major;
	}
	void show() {
		super.show();
		System.out.println("����" + major);
	}
}
class Worker extends PhoneNum{
	String grade;
	Worker(String n, String p, String g){
		super(n,p);
		this.grade = g;		
	}
	@Override
	void show() {
		super.show();
		System.out.println("����"+grade);
	}
	
}
class Arr{
	PhoneNum[] ary;
	int n;
	
	Arr(int n){ 		// ������ �ʱ�ȭ
		ary = new PhoneNum[n];
		n = 0;
	}
	void add(PhoneNum p) {
		ary[n++] = p; 	// ģ�� �߰�
	}
	void frined(char ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("��ȭ ��ȣ�� �Է��ϼ���");
		String num = sc.next();
		
		switch(ch) {
		case 'A' : // 
			System.out.println("���� �Է��ϼ���");
			String major = sc.next();
			//PhoneNum p = new School(name, num, major)
			add(new School(name, num, major));
			break;
		case 'B' : // 
			System.out.println("���� �Է��ϼ���");
			String grade = sc.next();
			//PhoneNum p = new Worker(name, num, grade)
			add(new Worker(name, num, grade));
			break;
		}
		sc.close();
	}
	void all() {
		for(int i = 0; i < ary.length ; i++) {
			ary[i].show();
		}
	}
}
public class Y0125_1245 {
	public static void main(String[] args) {
		
		//Arr class�� ��ü
		Arr ar = new Arr(5);
		while(true) {
			System.out.println("A �б� ģ�� ����");
			System.out.println("B ���� ���� ����");
			System.out.println("C ����");
			System.out.println("D ���");
			System.out.println("���� �Է�");
			
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			
			switch (c){
				case 'A' :
					ar.frined(c);
					break;
				case 'B' :
					ar.frined(c);
					break;
				case 'C' :
					System.out.println("����");
					return;
				case 'D' :
					ar.all();
			}
		}
	}
}
 */
