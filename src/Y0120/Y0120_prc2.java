package Y0120;
import java.io.*;
import java.util.Scanner;

//4��
//main(){
//  Rectangle rec = new Rectangle();
//  rec.width=5;
//  rec.height=6;
//  System.out.println(���簢�� ������ + rec.area( ));

class Rectangle{
	int width, height;
	double area() {
		double area = width*height;
		return area;
	}
}

//5. main()�� ���� SongŬ������ �ۼ��ض�.
//main(){
//Song s1 = new Song(��On��);
//Song s2 = new Song(��00:00��);
//System.outprintln(�������ϴ� �뷡�� + s1.getsong());
//System.outprintln(���� �뷡�� + s2.getsong());
//���� ���) �����ϴ� �뷡 On
//         �� �뷡 00:00

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
		
//		1.	 while���� �̿��� �Ǽ��� ���� �� �Է¹ް� ��� ���.
//		(-1�� �ԷµǸ� �Է��� ������Ѷ�.)
/*		

		
		double sum=0, avg;
		int count=0;
		
		double a=0;
		Scanner tmp = new Scanner(System.in);
		while (a!= -1) {
			System.out.println("�Ǽ��� �Է��ϼ���.");
			a = tmp.nextDouble();
			sum +=a;
			count++;
		}
		sum += 1;
		avg = sum/count;
		System.out.println("���� : "+ sum);
		System.out.println("��� : "+avg);

		
		
		
//		2.  Hi 
//		���� �ڹٸ� �����ϰ� ���մϴ�.
//		������ �� ������ ������ ���Դϴ�.
//		�� ���ڿ��� test01.txt ���Ͽ� �����ض�.
		
		FileWriter fw = new FileWriter("test01.txt"); // ���Ͽ� ����
		BufferedWriter in = new BufferedWriter(fw); 
		in.write("Hi"); 
		in.newLine(); // ����(>����) ������ �ѱ��
		in.write("���� �ڹٸ� �����ϰ� ���մϴ�."); 
		in.newLine(); // ����(>����) ������ �ѱ��
		in.write("������ �� ������ ������ ���Դϴ�."); 
		in.close();
		System.out.println("����2�Ϸ�");
		
//
//		3. Scanner�� �Է� ���� �̸�(���ڿ�), id(���ڿ�)�� �� �ٸ��� ����(test02.txt)�� �����ض�.
//		���׸��� �Է��ϸ� ������Ѷ�. ���׸��� �Է��ϱ� �������� ���ڿ��� ���Ͽ� �����ض�.(break, FileWriter ���)
//		���� ���) ȫ�浿 hong    
//		           �̱浿 lee
//		           �׸�
//
//		3. 1���� ���Ͽ� ������ �����͵��� ȭ�鿡 ����ض�.
//		(FileReader���, int������ �ʱ�ȭ�ض�)
//
		BufferedReader bu3=null;
		PrintWriter pr3=null;
		InputStreamReader in3 = new InputStreamReader(System.in);
		
		bu3 = new BufferedReader(in3);
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		FileWriter fw3 = new FileWriter("test02.txt");
		pr3 = new PrintWriter(fw3);
		
		String str3 = null;
		while((str3 = bu3.readLine()) != "�׸�") {
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
		System.out.println("�̸�");
		str=in.readLine();
		if(str.equals("�׸�")) {
			break;
		}
	}
	out.close();
	in.close();
		
//		3. 1���� ���Ͽ� ������ �����͵��� ȭ�鿡 ����ض�.
//		(FileReader���, int������ �ʱ�ȭ�ض�)
//
 *  ��ǰ
 */
//		4. ���� main()�� ���� Ŭ���� �ۼ��ض�.
//		   main(){
		     Rectangle rec = new Rectangle();
		     rec.width=5;
		     rec.height=6;
		     System.out.println("�簢�� ����" + rec.area( ));

		
		
		
		
//		 5. main()�� ���� SongŬ������ �ۼ��ض�.
//		main(){
		Song s1 = new Song("On");
		Song s2 = new Song("00:00");
		System.out.println("�����ϴ� �뷡" + s1.getsong());
		System.out.println("�� �뷡" + s2.getsong());
//		���� ���) �����ϴ� �뷡 On
//		          �� �뷡 00:00


		


	}

}
