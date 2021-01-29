package Y0120;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//
//3. Scanner로 입력 받은 이름(문자열), id(문자열)를 한 줄마다 파일(test02.txt)에 저장해라.
//“그만” 입력하면 종료시켜라. “그만” 입력하기 전까지의 문자열을 파일에 저장해라.(break, FileWriter 사용)
//실행 결과) 홍길동 hong    
//           이길동 lee
//           그만
//
//3. 1에서 파일에 저장한 데이터들을 화면에 출력해라.
//(FileReader사용, int값으로 초기화해라)
//

public class Y0120_1700_prc {
	public static void main(String[] args) throws IOException  {
	
	BufferedReader in=
			new BufferedReader(new InputStreamReader(System.in)); // 
	FileWriter out=new FileWriter("test02.txt");
//	BufferedWriter out1=new BufferedWriter(out);
	
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
	}
}