import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;



public class Y0118 {



	static void FileW() throws IOException { // 파일에 문자를 1byte씩 쓰기
		System.out.println("FileW");
		FileWriter fw = new FileWriter("test1234.txt"); // 파일에 쓰기
		BufferedWriter out = new BufferedWriter(fw); // 버퍼(out)에 있는 내용을 파일(fw)에 쓰기
		
		
		out.write("안녕"); // 버퍼(>파일)에 안녕 입력
		out.newLine(); // 버퍼(>파일) 다음줄넘기기
		out.write("오늘은 월요일"); // 버퍼(>파일)에 오늘은 월요일 입력
		out.newLine(); // 버퍼(>파일) 다음줄 넘기기
		out.write("aaa.naver.com"); // 버퍼(>파일)에 aaa.naver.com
		
		out.close();
		
		
	}
	static void FileR() throws IOException { // 파일의 문자를 1byte씩 읽기
		// 파일 문자 출력 1byte씩
		BufferedReader in = new BufferedReader(new FileReader("test1234.txt")); // 파일을 읽어서 버퍼 in에 적제
		// BufferedReader 클래스는 1바이트씩 저장
		System.out.println("FileR");
		
		String str;
		while(true) { // 무한 반복 
			str = in.readLine(); // 버퍼의 1줄을 문자열에 입력
			if(str==null) { // 문자열이 없으면(null)
				break; // 무한루프 종료
			}
			
		}
		
		System.out.println(str);
		
		in.close();
	}
	
	// test5.dat 를 읽어와서 바이트 배열에 다시 저장
	static void FileIS() throws IOException {
		FileInputStream in = null; // 파일 입력값 비우기 
		ByteArrayOutputStream out = null; // 출력값 비우기
		
		try { // 예외처리 시작
			in = new FileInputStream("test5.dat"); // 객체명 in에 파일(test5.dat)을 들여온다.
			out= new ByteArrayOutputStream(); // 객체명 out이라는 배열 생성
			int r = -1; // 정수형 -1
				while((r=in.read()) != -1) { // r은 in파일을 읽는 객체로, -1이(읽을 값이) 아닐때(없을때)까지 반복
				out.write(r); // 배열에 r을 쓰기
				} // in 파일을 읽어서 out 배열에 쓰기
				byte b[] = out.toByteArray(); // byte형 b 배열에 out 배열을 입력(초기화)
				
				for(int i =0; i<b.length;i++) { // b 배열의 크기만큼 반복
					System.out.print(b[i]+" "); // b 배열 출력
				}
			}catch(Exception e) {} // 예외 처리 없음
	
		out.close(); // 참조형 매개변수 끝
		in.close(); // 참조형 매개변수 끝
		return ; // 반환
		
		
		
	}
	static void FileOS() throws IOException {
		ByteArrayInputStream in2 = null;
		FileOutputStream out2 = null;
		
		try {
			byte b[] = new byte[] {1,2,3,5,6};
			in2 = new ByteArrayInputStream(b);
			out2 = new FileOutputStream("test5.dat"); // 파일을 내보낸다.
		
			int r2 = -1;
			while((r2=in2.read()) != -1) {
				out2.write(r2);
			}
		}catch(Exception e) {}
		out2.close();
		in2.close();
		return ;

	}
	static void FIS2() throws IOException {
		DataInputStream in = null;
		try {
			FileInputStream fis = new FileInputStream("h.txt");
			in = new DataInputStream(fis);
			
			int a=in.readInt();
			double b=in.readDouble();
			boolean c = in.readBoolean();
			
			System.out.println(a+" "+b+" "+c);
			
			
		}catch(Exception e) {}
		in.close();
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//예외처리 try catch ?
		// 파일 문자 입력 1바이트씩 
/*		
		FileWriter fw = new FileWriter("test123.txt");
		BufferedWriter out = new BufferedWriter(fw);
		System.out.println("저장할 문자열");
		
		out.write("안녕");
		out.newLine();
		out.write("오늘은 월요일");
		out.newLine();
		out.write("aaa.naver.com");
		
		out.close();
*/		
/*		
		// 파일 문자 출력 1byte씩
		BufferedReader in = new BufferedReader(new FileReader("test123.txt"));
		// BufferedReader 클래스는 1바이트씩 저장
		
		String str;
		while(true) { // 무한 반복 
			str = in.readLine();
			if(str==null) { // 문자열이 없으면(null)
				break; // 무한루프 종료
			}
			
		}
		
		System.out.println(str);
		
		in.close();
*/		
		
//		FileW(); // 파일에 1바이트씩 입력
//		FileR(); // 파일에 1바이트씩 출력
		
/*		
		// 연습.
		// 콘솔(버퍼)에 문자열을 입력한다.
		// 입력한 문자열을 txt 파일에 저장한다.
		// txt 파일에 저장한 문자열을 입력한다.
		
		BufferedReader bu=null;
		PrintWriter pr=null;
		
		try {
			
			InputStreamReader in = new InputStreamReader(System.in);
			
			//효율성을 극대화하려면 BufferedReader 내에서 InputStreamReader를 래핑하는 것이 좋습니다.
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			bu = new BufferedReader(in);
			// 버퍼(콘솔)에 입력
			
			System.out.println("문자열을 입력하세요.");
			FileWriter fw = new FileWriter("test1102.txt");
			pr = new PrintWriter(fw);
			
			String str=null;
			while((str=bu.readLine())!=null) {
				pr.println(str);
			}
			bu.close();
			
		}catch(Exception e) {}
		
		finally {
			System.out.println("File에 저장됩니다.");
			pr.close();
		}
		
		// ctr+z 로 종료

*/		

/*
		// f.txt에 입력값 저장
		InputStreamReader isr = new InputStreamReader(System.in); // 입력 객체 isr
		FileWriter fw = null; // 출력 객체 fw
		
		int r; // r 까지
		try {
			fw=new FileWriter("f.txt");
			while((r=isr.read()) != -1) {
				fw.write(r);
			}
			isr.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
			
		
		}
		
*/	
/*		
		byte in[] = {1,2,3,4,5};
		byte out[] = null;
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		System.out.println(in);
		System.out.println(out);
		System.out.println(input);
		System.out.println(output);
		
		output = new ByteArrayOutputStream();
		// ByteArrayOutputStream output = new ByteArrayOutputStream(); 
		
		input = new ByteArrayInputStream(in);
		//ByteArrayInputStream input = new ByteArrayInputStream(in);
		
		//byte 배열 12345를 읽어와서 output stream에 저장
		int r =0;
		while((r=input.read())!=-1) {
			 System.out.println(r);
			 output.write(r);
		}
		out = output.toByteArray();
		System.out.println(in); // 배열의 주소
		System.out.println(out); // 배열의 주소
		System.out.println(Arrays.toString(in)); // 객체(in 배열)를 문자열로 변경
		System.out.println(Arrays.toString(out)); // 객체(out 배열)를 문자열로 변경
*/
		//오늘 파일 입출력 클래스를 (계속 만들어서)연습해서 외워라
		
/*		// 위에 메소드로 똑같이 만듬.
		// 바이트 배열은 널로 초기화해서 써라
		// byte b 배열에 test5.dat 파일로 저장해라.
		ByteArrayInputStream in2 = null;
		FileOutputStream out2 = null;
		
		try {
			byte b[] = new byte[] {1,2,3,5,6};
			in2 = new ByteArrayInputStream(b);
			out2 = new FileOutputStream("test5.dat");
		
			int r2 = -1;
			while((r2=in2.read()) != -1) {
				out2.write(r2);
			}
		}catch(Exception e) {}
		out2.close();
		in2.close();
*/
		
		
		FileIS(); // test5.dat 를 읽어와서 바이트 배열에 다시 저장. 
		
		FileOS(); // File Output Stream. 
		
		//page 375 실습 10-15 파일을 이용한 출력3
		//page 377 
		
		//숙제 assignmnet. page 397 예제 27 구구단을 파일에 출력 
		
		
		
		//DataOutputStream : 기본 자료형의 값을 저장
		//h.txt에 int, double, boolean 자료형의 값을 저장
		System.out.println();
		System.out.println("File Output Stream");
		
		DataOutputStream out = null;
		try {
			int a =5;
			double b=1.5;
			boolean c = true;
			
			FileOutputStream fos = new FileOutputStream("h.txt");
			out=new DataOutputStream(fos);
			
			out.writeInt(a);
			out.writeDouble(b);
			out.writeBoolean(c);
			
			
		}catch(Exception e) {}
		out.close();
		
		System.out.println("File Input Stream");
		FIS2();

		
		
		//CLASS 시작
//		FileWriter // 파일에 쓴다.
//		BufferedWriter // 버퍼에 쓴다.
//
//		FileReader // 파일을 읽는다.
//		BufferedReader // 버퍼에 읽는다.
//
//		FileInputStream // 파일을 들여온다.(읽어온다.)
//		ByteArrayOutputStream // 바이트 배열을 출력한다.
//
//		FileOutputStream // 파일에 내보낸다.(쓴다.)
//		ByteArrayInputStream // 바이트 배열을 읽어온다.
//
//		DataInputStream // 데이터를 들여온다.
//
//
//		InputStreamReader // 내용을 읽어서 들여온다.
//		
	}
	
	
}
