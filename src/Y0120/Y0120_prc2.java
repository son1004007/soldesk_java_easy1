package Y0120;
import java.io.*;
import java.util.Scanner;

//4번
//main(){
//  Rectangle rec = new Rectangle();
//  rec.width=5;
//  rec.height=6;
//  System.out.println(“사각형 면적” + rec.area( ));

class Rectangle{
	int width, height;
	double area() {
		double area = width*height;
		return area;
	}
}

//5. main()를 보고 Song클래스를 작성해라.
//main(){
//Song s1 = new Song(“On”);
//Song s2 = new Song(“00:00”);
//System.outprintln(“좋아하는 노래” + s1.getsong());
//System.outprintln(“내 노래” + s2.getsong());
//실행 결과) 좋아하는 노래 On
//         내 노래 00:00

class Song{
	String a=null;
	Song(String a){
		this.a = a;
	}
	
	String getsong() {
		return a;
	}
}

public class Y0120_prc2 {
 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		1.	 while문을 이용해 실수를 여러 개 입력받고 평균 출력.
//		(-1이 입력되면 입력을 종료시켜라.)
/*		

		
		double sum=0, avg;
		int count=0;
		
		double a=0;
		Scanner tmp = new Scanner(System.in);
		while (a!= -1) {
			System.out.println("실수를 입력하세요.");
			a = tmp.nextDouble();
			sum +=a;
			count++;
		}
		sum += 1;
		avg = sum/count;
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+avg);

		
		
		
//		2.  Hi 
//		저는 자바를 좋아하고 잘합니다.
//		앞으로 더 열심히 공부할 것입니다.
//		이 문자열을 test01.txt 파일에 저장해라.
		
		FileWriter fw = new FileWriter("test01.txt"); // 파일에 쓰기
		BufferedWriter in = new BufferedWriter(fw); 
		in.write("Hi"); 
		in.newLine(); // 버퍼(>파일) 다음줄 넘기기
		in.write("저는 자바를 좋아하고 잘합니다."); 
		in.newLine(); // 버퍼(>파일) 다음줄 넘기기
		in.write("앞으로 더 열심히 공부할 것입니다."); 
		in.close();
		System.out.println("문제2완료");
		
//
//		3. Scanner로 입력 받은 이름(문자열), id(문자열)를 한 줄마다 파일(test02.txt)에 저장해라.
//		“그만” 입력하면 종료시켜라. “그만” 입력하기 전까지의 문자열을 파일에 저장해라.(break, FileWriter 사용)
//		실행 결과) 홍길동 hong    
//		           이길동 lee
//		           그만
//
//		3. 1에서 파일에 저장한 데이터들을 화면에 출력해라.
//		(FileReader사용, int값으로 초기화해라)
//
		BufferedReader bu3=null;
		PrintWriter pr3=null;
		InputStreamReader in3 = new InputStreamReader(System.in);
		
		bu3 = new BufferedReader(in3);
		System.out.println("문자열을 입력하세요.");
		
		FileWriter fw3 = new FileWriter("test02.txt");
		pr3 = new PrintWriter(fw3);
		
		String str3 = null;
		while((str3 = bu3.readLine()) != "그만") {
			pr3.println(str3);
			
		}
		
		bu3.close();
		
	
	
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0106 {
	public static void main(String[] args) throws IOException  {
	
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	FileWriter out=new FileWriter("test02.txt");
	BufferedWriter out1=new BufferedWriter(out);
	
	String str;
	while(true) {
		System.out.println("이름");
		str=in.readLine();
		if(str.equals("그만")) {
			break;
		}
	}
	out.close();
	in.close();
		
//		3. 1에서 파일에 저장한 데이터들을 화면에 출력해라.
//		(FileReader사용, int값으로 초기화해라)
//
 *  못품
 */
//		4. 다음 main()를 보고 클래스 작성해라.
//		   main(){
		     Rectangle rec = new Rectangle();
		     rec.width=5;
		     rec.height=6;
		     System.out.println("사각형 면적" + rec.area( ));

		
		
		
		
//		 5. main()를 보고 Song클래스를 작성해라.
//		main(){
		Song s1 = new Song("On");
		Song s2 = new Song("00:00");
		System.out.println("좋아하는 노래" + s1.getsong());
		System.out.println("내 노래" + s2.getsong());
//		실행 결과) 좋아하는 노래 On
//		          내 노래 00:00


		


	}

}
