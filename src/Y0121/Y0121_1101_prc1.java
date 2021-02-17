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

//		1. 입력받은 텍스트를 java.txt파일에 저장하는 프로그램을 작성해라. (InputStreamReader, FileWriter 사용)
		
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
			 System.out.println("입출력 오류");
		 }

		

		
		
		
		
		
//		2.main()를 보고 클래스를 작성해라.
//		Student s1=new Student(“김길동”, “kim”);
//		Student s2=new Student(“이길동”, “lee”);
//		s1.pr(); s2.pr();         //모든 데이터 출력




			Student s1=new Student("김길동", "kim");
			Student s2=new Student("이길동", "lee");
				s1.pr();
				s2.pr(); //모든 데이터 출력
		
	}

}
