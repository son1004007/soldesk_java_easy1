package Y0127;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//3. Main()�� ���� main()�� Object In, OutputStream�� �����, Ŭ������ ���� �����ض�.
//
//Person p=new Person(��Jack��, ��computer��, 20, 123); 
//p.show();   //������ �� ����ϴ� �Լ�

class Person implements Serializable{
	String a,b;
	int c,d;
	Person(String a, String b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void show(){
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}
}
public class Y0127_1540 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test127_1605.txt"));
		
		
//		ObjectOutputStream in = new ObjectInputStream(new FileInputStream("test127_1605.txt"));
		
		
		
		Person p = new Person("Jack", "computer", 20,123);
		p.show();
	}
}
