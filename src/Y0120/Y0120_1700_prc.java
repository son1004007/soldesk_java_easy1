package Y0120;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//
//3. Scanner�� �Է� ���� �̸�(���ڿ�), id(���ڿ�)�� �� �ٸ��� ����(test02.txt)�� �����ض�.
//���׸��� �Է��ϸ� ������Ѷ�. ���׸��� �Է��ϱ� �������� ���ڿ��� ���Ͽ� �����ض�.(break, FileWriter ���)
//���� ���) ȫ�浿 hong    
//           �̱浿 lee
//           �׸�
//
//3. 1���� ���Ͽ� ������ �����͵��� ȭ�鿡 ����ض�.
//(FileReader���, int������ �ʱ�ȭ�ض�)
//

public class Y0120_1700_prc {
	public static void main(String[] args) throws IOException  {
	
	BufferedReader in=
			new BufferedReader(new InputStreamReader(System.in)); // 
	FileWriter out=new FileWriter("test02.txt");
//	BufferedWriter out1=new BufferedWriter(out);
	
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
	}
}