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



	static void FileW() throws IOException { // ���Ͽ� ���ڸ� 1byte�� ����
		System.out.println("FileW");
		FileWriter fw = new FileWriter("test1234.txt"); // ���Ͽ� ����
		BufferedWriter out = new BufferedWriter(fw); // ����(out)�� �ִ� ������ ����(fw)�� ����
		
		
		out.write("�ȳ�"); // ����(>����)�� �ȳ� �Է�
		out.newLine(); // ����(>����) �����ٳѱ��
		out.write("������ ������"); // ����(>����)�� ������ ������ �Է�
		out.newLine(); // ����(>����) ������ �ѱ��
		out.write("aaa.naver.com"); // ����(>����)�� aaa.naver.com
		
		out.close();
		
		
	}
	static void FileR() throws IOException { // ������ ���ڸ� 1byte�� �б�
		// ���� ���� ��� 1byte��
		BufferedReader in = new BufferedReader(new FileReader("test1234.txt")); // ������ �о ���� in�� ����
		// BufferedReader Ŭ������ 1����Ʈ�� ����
		System.out.println("FileR");
		
		String str;
		while(true) { // ���� �ݺ� 
			str = in.readLine(); // ������ 1���� ���ڿ��� �Է�
			if(str==null) { // ���ڿ��� ������(null)
				break; // ���ѷ��� ����
			}
			
		}
		
		System.out.println(str);
		
		in.close();
	}
	
	// test5.dat �� �о�ͼ� ����Ʈ �迭�� �ٽ� ����
	static void FileIS() throws IOException {
		FileInputStream in = null; // ���� �Է°� ���� 
		ByteArrayOutputStream out = null; // ��°� ����
		
		try { // ����ó�� ����
			in = new FileInputStream("test5.dat"); // ��ü�� in�� ����(test5.dat)�� �鿩�´�.
			out= new ByteArrayOutputStream(); // ��ü�� out�̶�� �迭 ����
			int r = -1; // ������ -1
				while((r=in.read()) != -1) { // r�� in������ �д� ��ü��, -1��(���� ����) �ƴҶ�(������)���� �ݺ�
				out.write(r); // �迭�� r�� ����
				} // in ������ �о out �迭�� ����
				byte b[] = out.toByteArray(); // byte�� b �迭�� out �迭�� �Է�(�ʱ�ȭ)
				
				for(int i =0; i<b.length;i++) { // b �迭�� ũ�⸸ŭ �ݺ�
					System.out.print(b[i]+" "); // b �迭 ���
				}
			}catch(Exception e) {} // ���� ó�� ����
	
		out.close(); // ������ �Ű����� ��
		in.close(); // ������ �Ű����� ��
		return ; // ��ȯ
		
		
		
	}
	static void FileOS() throws IOException {
		ByteArrayInputStream in2 = null;
		FileOutputStream out2 = null;
		
		try {
			byte b[] = new byte[] {1,2,3,5,6};
			in2 = new ByteArrayInputStream(b);
			out2 = new FileOutputStream("test5.dat"); // ������ ��������.
		
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

		
		//����ó�� try catch ?
		// ���� ���� �Է� 1����Ʈ�� 
/*		
		FileWriter fw = new FileWriter("test123.txt");
		BufferedWriter out = new BufferedWriter(fw);
		System.out.println("������ ���ڿ�");
		
		out.write("�ȳ�");
		out.newLine();
		out.write("������ ������");
		out.newLine();
		out.write("aaa.naver.com");
		
		out.close();
*/		
/*		
		// ���� ���� ��� 1byte��
		BufferedReader in = new BufferedReader(new FileReader("test123.txt"));
		// BufferedReader Ŭ������ 1����Ʈ�� ����
		
		String str;
		while(true) { // ���� �ݺ� 
			str = in.readLine();
			if(str==null) { // ���ڿ��� ������(null)
				break; // ���ѷ��� ����
			}
			
		}
		
		System.out.println(str);
		
		in.close();
*/		
		
//		FileW(); // ���Ͽ� 1����Ʈ�� �Է�
//		FileR(); // ���Ͽ� 1����Ʈ�� ���
		
/*		
		// ����.
		// �ܼ�(����)�� ���ڿ��� �Է��Ѵ�.
		// �Է��� ���ڿ��� txt ���Ͽ� �����Ѵ�.
		// txt ���Ͽ� ������ ���ڿ��� �Է��Ѵ�.
		
		BufferedReader bu=null;
		PrintWriter pr=null;
		
		try {
			
			InputStreamReader in = new InputStreamReader(System.in);
			
			//ȿ������ �ش�ȭ�Ϸ��� BufferedReader ������ InputStreamReader�� �����ϴ� ���� �����ϴ�.
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			bu = new BufferedReader(in);
			// ����(�ܼ�)�� �Է�
			
			System.out.println("���ڿ��� �Է��ϼ���.");
			FileWriter fw = new FileWriter("test1102.txt");
			pr = new PrintWriter(fw);
			
			String str=null;
			while((str=bu.readLine())!=null) {
				pr.println(str);
			}
			bu.close();
			
		}catch(Exception e) {}
		
		finally {
			System.out.println("File�� ����˴ϴ�.");
			pr.close();
		}
		
		// ctr+z �� ����

*/		

/*
		// f.txt�� �Է°� ����
		InputStreamReader isr = new InputStreamReader(System.in); // �Է� ��ü isr
		FileWriter fw = null; // ��� ��ü fw
		
		int r; // r ����
		try {
			fw=new FileWriter("f.txt");
			while((r=isr.read()) != -1) {
				fw.write(r);
			}
			isr.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("����� ����");
			
		
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
		
		//byte �迭 12345�� �о�ͼ� output stream�� ����
		int r =0;
		while((r=input.read())!=-1) {
			 System.out.println(r);
			 output.write(r);
		}
		out = output.toByteArray();
		System.out.println(in); // �迭�� �ּ�
		System.out.println(out); // �迭�� �ּ�
		System.out.println(Arrays.toString(in)); // ��ü(in �迭)�� ���ڿ��� ����
		System.out.println(Arrays.toString(out)); // ��ü(out �迭)�� ���ڿ��� ����
*/
		//���� ���� ����� Ŭ������ (��� ����)�����ؼ� �ܿ���
		
/*		// ���� �޼ҵ�� �Ȱ��� ����.
		// ����Ʈ �迭�� �η� �ʱ�ȭ�ؼ� ���
		// byte b �迭�� test5.dat ���Ϸ� �����ض�.
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
		
		
		FileIS(); // test5.dat �� �о�ͼ� ����Ʈ �迭�� �ٽ� ����. 
		
		FileOS(); // File Output Stream. 
		
		//page 375 �ǽ� 10-15 ������ �̿��� ���3
		//page 377 
		
		//���� assignmnet. page 397 ���� 27 �������� ���Ͽ� ��� 
		
		
		
		//DataOutputStream : �⺻ �ڷ����� ���� ����
		//h.txt�� int, double, boolean �ڷ����� ���� ����
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

		
		
		//CLASS ����
//		FileWriter // ���Ͽ� ����.
//		BufferedWriter // ���ۿ� ����.
//
//		FileReader // ������ �д´�.
//		BufferedReader // ���ۿ� �д´�.
//
//		FileInputStream // ������ �鿩�´�.(�о�´�.)
//		ByteArrayOutputStream // ����Ʈ �迭�� ����Ѵ�.
//
//		FileOutputStream // ���Ͽ� ��������.(����.)
//		ByteArrayInputStream // ����Ʈ �迭�� �о�´�.
//
//		DataInputStream // �����͸� �鿩�´�.
//
//
//		InputStreamReader // ������ �о �鿩�´�.
//		
	}
	
	
}
