package Y0121;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Student{
	String a,b;
	public Student(String a, String b) {
		this.a=a;
		this.b=b;
	}
	void pr() {
		System.out.println(a+" "+b);
	}
}

public class Y0121_1101_prc1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		1. �Է¹��� �ؽ�Ʈ�� java.txt���Ͽ� �����ϴ� ���α׷��� �ۼ��ض�. (InputStreamReader, FileWriter ���)
		
		InputStreamReader isr=new InputStreamReader(System.in);
		FileWriter fw=null;
		int a;
		try {
			 fw=new FileWriter("java.txt");
			 while((a=isr.read())!=-1) {
				 fw.write(a);
			 }
			 isr.close();
			 fw.close();
		 }catch(IOException e) {
			 System.out.println("����� ����");
		 }

		

		
		
		
		
		
//		2.main()�� ���� Ŭ������ �ۼ��ض�.
//		Student s1=new Student(����浿��, ��kim��);
//		Student s2=new Student(���̱浿��, ��lee��);
//		s1.pr(); s2.pr();         //��� ������ ���




			Student s1=new Student("��浿", "kim");
			Student s2=new Student("�̱浿", "lee");
				s1.pr();
				s2.pr(); //��� ������ ���
		
	}

}
