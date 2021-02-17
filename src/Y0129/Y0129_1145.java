//5. FileOutputStream을 이용하여 byte[]배열 속에 들어있는 바이너리 값을 fi.txt파일에 저장해라. 
//(byte b[]={1,2,3,4,5}; 로초기화)
//5.1 저장한 후 값을 읽어와서 출력해라.

//6.이미지 세개를 다운받아프레임에 부착해라.(for문 사용해서 부착)

//7. Main()을 보고 함수 구현해라. ( 배열 요소합 출력)
//int [] arr={1,2,3,4,5};
//int [] r;
//r=add(arr,5)

package Y0129;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Y0129_1145 {

//	public static void main(String[] args) throws IOException {
//		ByteArrayInputStream in=null;
//		FileOutputStream out = null;
//		try {
//			byte[] b=new byte[] {1,2,3,4,5};
//			in=new ByteArrayInputStream(b);
//			out=new FileOutputStream("fi.txt");
//			   
//			int r=-1;
//			while((r=in.read())!=-1) {
//				out.write(r);
//		   }
//
//		}catch(Exception e) {}
//		out.close();
//		in.close();
//
//	}
	


	public static void main(String[] args) throws IOException  {

		FileInputStream in=null;

		ByteArrayOutputStream out=null;

		try {

			in=new FileInputStream("fi.txt");
			out=new ByteArrayOutputStream();
			int r=-1;
			while((r=in.read())!=-1) {
				out.write(r);
				}
			byte [] b=out.toByteArray();
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
				}
			}catch(Exception e) {}
		out.close();
		in.close();
		}
}

//		원하는 답
//public static void main(String[] args) throws IOException {
//byte b[] = {1,2,3,4,5};
//	FileOutputStream out = new FileOutputStream("fi.txt");
//	out.write(b);
//	out.close();

//	int r;
//	FileinputStream in = new FileinputStream("fi.txt");
//	while((r=in.read()!=-1){
//		System.out.println(r);
//	}
//}
