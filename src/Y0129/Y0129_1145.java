//5. FileOutputStream�� �̿��Ͽ� byte[]�迭 �ӿ� ����ִ� ���̳ʸ� ���� fi.txt���Ͽ� �����ض�. 
//(byte b[]={1,2,3,4,5}; ���ʱ�ȭ)
//5.1 ������ �� ���� �о�ͼ� ����ض�.

//6.�̹��� ������ �ٿ�޾������ӿ� �����ض�.(for�� ����ؼ� ����)

//7. Main()�� ���� �Լ� �����ض�. ( �迭 ����� ���)
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

//		���ϴ� ��
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
