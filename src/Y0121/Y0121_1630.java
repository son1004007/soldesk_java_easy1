package Y0121;
import java.util.Scanner;
class Num extends Exception{ //Num Ŭ���� ��� �޴´�. API �⺻ ���̺귯�� Exception
	Num(){
		super("���� �Դϴ�.");
		// �θ� ������ ȣ��(Exception)
	}
}
public class Y0121_1630 {

	static Scanner tmp = new Scanner(System.in);
	
	static int in() throws Num {
		int a = tmp.nextInt();
		
		
		if(a<0) { // ���� ���� 
			Num n= new Num();
			throw n; // n�� Num�� ������.
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��� �Է�");
		try { // in() �޼ҵ尡 ������ �ƴ� ��츦 ó���ϱ� ���� ����ó�� 
			int n = in(); //���� �Է��ϴ� �Լ�
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
