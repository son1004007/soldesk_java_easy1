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
		
		
		// 1. 문자열을 파일로 저장하는 코드
		FileWriter fw = new FileWriter("i.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		// 버퍼에 적재해서 속도 차이를 극복
		
		bw.write("저장하는 문자열");
		bw.newLine();
		char a[]= new char[] {'월','화','수'}; // 
		bw.write(a); // 문자명 a(월, 화, 수 저장)
		bw.close();
		
		
		// 2. 파일의 문자열을 읽어오는 코드 : Buffered Reader 이용
		FileReader fr = new FileReader("i.txt");
		BufferedReader br = new BufferedReader(fr); // readLine을 사용하기 위해서
		
		String str;
		
		
		while(true) { // 무한 반복 
			str = br.readLine();
			System.out.println(str);
			if(str==null) { // 문자열이 없으면(null)
				break; // 무한루프 종료
			}
			
		}
		
		
		br.close();
		
		
		
		// 3. file input stream으로 읽기 > byte 배열을 이용해서, 문자열로 변경
		// page 367 실습 10-10
		
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
				
		

//		inputstream = -1 (byte 단위이기 때문에)
//		reader = null? (문자이기 때문에)
		// page 377 참고
		
		
		
		
		// 클래스 생성 명령 
		// class 클래스명 {} // class Car {};
		
		// 인스턴스 생성 명령 
		// 클래스명 변수명 = new 클래스명(); // Car mycar1 = new Car(); 
		
		// 인스턴스 필드에 값 대입하기 
		// 변수명.필드이름 = 값; // mycar1.color = "빨강"
		
		// 인스턴스 필드에 메소드 호출하기
		// 변수.메소드(); // mycar1.upspeed();
		
		
		
		//page 402 : 
		// public / protected / default / private
		// same class / same package / sub class / external class
		
		// package > class > method
		
		// page 404 내용 추가 
		// 클래스 안에 1개의 public class는 1개분이다.
		// public class 이름과 파일이름은 같아야 한다.
		// default class를 선언할때 default는 생략한다.

		// page 406 생성자(constructure)가 중요하다.
		// 1) class의 이름과 동일한 메소드 
		// 2) 초기화 할때 사용
		// 3) 리턴값이 없다.
		
		
		
//public class Y0119 {
//public static void main(String[] args) 위에 있음.
		
		Music m = new Music(); // 객체 생성
		m.title="VVS";
		m.price=30000;
		
		m.show();
		
		
		// Music2("Test", 9999) == 객체 생성자. 순서에 맞게끔 작성
		Music2 n = new Music2("VVS_Test", 9999); 
		n.show2();
		
		
		
		//class 연습
		
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
		System.out.println("class를 이용하는 중");
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
		System.out.println("class2를 이용하는 중");
		System.out.println(title+" "+price);
	}

}

class Rec{
	int a,b; // 필드(변수)
	Rec(int a, int b){
		this.a= a;	// this.a(메소드 Rec int a)를 클래스의 int a,b;에 입력한다. 
		this.b=b;	// this.b(메소드 Rec int b)를 클래스의 int a,b;에 입력한다.
		
	}
	void area(){ // 메소드(함수)
		System.out.println(a*b);
	}
	
}