package Y0203;

import java.util.Scanner;

//1. �̸��� id�� �Է¹޾� PersonŬ���� �ۼ��ϰ� �Է��� �� �� ����ض�.(��ü �迭�� ������ 3��)
//1.2 1���� �̾� ������ ���� �������� �������� �ڵ带 �߰��ض�. (Person��ü �迭 ����ض�.)

//������)
//�̸�, id�Է�: ȫ�浿 111
//�̸�, id�Է�: ��浿 222
//�̸�, id�Է�: �ڱ浿 333
//�̸�����? ȫ�浿
//��: 111
//�̸�����? �ֱ浿
//�̸�����.
//�̸�����? Stop

class Person{
	String name;
	String id;
	Person(String name, String id){
		this.name = name;
		this.id = id;
	}
	void show() {
		System.out.println(name + " "+ id);
	}
}

public class Y0203_1740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3];
		
		for(int i =0; i< p.length; i++) {
			System.out.println("�̸� id�� �Է��ϼ���");
			p[i]= new Person(sc.next(), sc.next());
		}
		System.out.println("��� ���");
		for(int i =0; i< p.length; i++) {
			p[i].show();
		}
		System.out.println("�̸����� id ���");
		do {
			System.out.print("�̸��� ����?");
			String name = sc.next();
			
			if(name.equals("stop")) {
				break;	
			}
			for(int i =0; i<p.length ; i++) {
				if(name.equals(p[i].name)) {
					System.out.println("�� : " + p[i].id);
					break;
				}
				else if (!name.equals(p[i].name) && i == 2) {
					System.out.println("�̸�����.");
				}
			}
		}while(true);
		sc.close();
	}
}

