package Y0125;

import java.util.Scanner;
class PhoneNum{
	String name;
	String phone;
	PhoneNum(String n,String p){
		name=n;
		phone=p;
		}
	void show() {
		System.out.println("�̸�" +name);
		System.out.println("��ȣ" +phone);
		}
	}
class School extends PhoneNum{
	String major;
	School(String n,String p, String m){
	 super(n,p);
	 major=m;
	 
	}

 void show() { //�������̵�
	 super.show();
	 System.out.println("����" +major);
	 }
 }

class Worker extends PhoneNum{
	String grade;
	Worker(String n, String p, String g) {
		super(n, p);
		this.grade=g;
		}
	void show() {
		super.show();
		System.out.println("����" +grade);
		}
	}

////////////////////////////////////////////

class Arr{
	PhoneNum[] ary;
	int n;
	Arr(int n){  //�����ھȿ�
		ary=new PhoneNum[n]; //�迭 �����ڵ�
		n=0; 
		}
	void add(PhoneNum p) {
		ary[n++]=p; //ģ�� �߰�
		}

 void frined(char ch) {
	 Scanner s=new Scanner(System.in);
	 System.out.print("�̸� : ");
	 String name=s.next();
	 System.out.print("��ȣ : ");
	 String num=s.next();
	 switch(ch) {
	 case 'A':
		 System.out.print("����: ");
		 String major=s.next();
		 //PhoneNum p = new School(name,num,major);
		 add(new School(name,num,major));
		 break;
		 
	 case 'B':
		 System.out.print("����: ");
		 String grade=s.next();
		 //PhoneNum p = new School(name,num,major);
		 add(new Worker(name,num,grade));
		 break;
		 }
	 }
 void all() {
	 for(int i=0;i<ary.length;i++) {
		 ary[i].show();
		 }
	 }
 }
public class Y0125_1450 {
	public static void main(String[] args) {
		Arr ar=new Arr(5);
		while(true) {
			System.out.println("A.�б� ģ�� ����");
			System.out.println("B.���� ���� ����");
			System.out.println("C.����");
			System.out.println("D.���");
			System.out.println("���� �Է�");
			Scanner s=new Scanner(System.in);
			char c=s.next().charAt(0);
			switch(c) {
			case 'A':
				ar.frined(c);
				break;
			case 'B':
				ar.frined(c);
				break;
			case 'C':
				System.out.println("����");
				return;
				case 'D':
					ar.all();
					}
			} 
		}
}