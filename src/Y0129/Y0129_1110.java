package Y0129;

import java.util.Scanner;

//3. ���� main()�� ���� �ڵ带 �ۼ��ض�. (Cal�� �������̽�, a,b,�� �� ������ �Է¹޾� a���� b���� ����)
//Cal c= new Show();
//System.out.println(c.cal(a,b));

//4. ���� main()�� ���� GenŬ������ ������.
//Gen<String> g=new Gen<String>(��seoul��,��busan��);
//System.out.println(g.one());   //seoul ���
//System.out.println(g.two());   //busan ���
//System.out.println(g.three(T t));  //false ��� (�� ���ڿ� ��) 
interface Cal{
	public int cal(int a, int b);
}
class Show implements Cal{
	
	public int cal(int a, int b) {
		
		int sum =0;
		if(a<b) {
			for(int i=a; i<b ; i++) {
				sum +=i;
			}
		}
		else {
			for(int i=b; i<a ; i++) {
				sum +=i;
			}
		}
		return sum;
	}
}

public class Y0129_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Cal c = new Show();
		System.out.println(c.cal(a, b));
	}

}
