//1. 5���� 10������ ������ �����͸� �Է� �޾�5~10 �̿��� �������� �ԷµǸ� ���ٽ� �Է¡��̶�� ��� �Ѵ�. 
//�Է� ���� ���� ���� Calc class�� calculate()�Լ��� �̿��Ͽ� 1���� �Է� ���� ���ڱ��� Ȧ���� ���ϴ� ���α׷��� �ۼ� �ض�. 
//(calculate()�Լ���int�� ������ �Է� �޾� 1���� �Է� ���� ���ڱ��� Ȧ���� ���� ���Ͽ������ϴ� �Լ�)

package Y0129;

import java.util.Scanner;

class Calc0129_1045{
		
	int calculate(int a){
		int sum =0;
		for(int i =1 ; i< a;i+=2) {
			sum+=i;
			System.out.println(i);
		}
		return sum;
	}
}
public class Y0129_1045_prc1 {

	public static void main(String[] args) {
		
		Calc0129_1045 c =new Calc0129_1045();
		Scanner sc = new Scanner(System.in);
		System.out.println("5~10 ������ �Է��ϼ���.");
		int a = sc.nextInt();
		
		if(a <= 5 || a >= 10) {
			System.out.println("�ٽ� �Է�");
		}
		System.out.println(c.calculate(a));
		
		
	}
}
