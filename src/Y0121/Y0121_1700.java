package Y0121;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rec implements Serializable{
	//��ü�� ���Ͽ� �����ϴ� ���� : ����ȭ
	//������ ��ü�� �ҷ����� ���� : ������ȭ
	int a,b;
	Rec(int a, int b){
		this.a=a;
		this.b=b;
	}
	void show(){
		System.out.println(a+" "+b);
	}
	
}
public class Y0121_1700 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		

//
//		ObjectOutputStream os;
//		os= new ObjectOutputStream(new FileOutputStream("obj.dat"));
//		
//		Rec c = new Rec(5, 6);
//		Rec x = new Rec(8, 5);
//		os.writeObject(c);
//		os.writeObject(x);
		
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.dat"));
		Rec r1 = (Rec)in.readObject();
		String r3 = (String)in.readObject();
		
//		��ü�� �̿��ؼ� ����Լ��� ����
		
		r1.show();
		System.out.println(r3);
		in.close();
	}

}
