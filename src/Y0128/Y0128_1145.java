package Y0128;

import java.util.Scanner;

//3. 1~100���� �������Է¹޾� 3,6,9 �� �ϳ��� �ִ� ��� ��¦��, �� �� �ִ� ��� ��¦¦��,
//�ϳ��� ������ ������������ض�. 
//(�������� 39��� �� ��, n/10=3, n%10=9 �� ���´�.   (/, % ������ Ȱ��))
//���� ���) �Է�:39                
//¦¦


//4.  ����Ʈ���� ������ ���������� �ϰ�, Ok, Cancel ��ư�������� frame�ϳ� ������
// Ok��ư�� ������ ��Ȯ�Ρ�, Cancel�� ������ ��ư�� ��Ȱ��ȭ ���Ѷ�. 
//(MouseAdapter�� ����)

public class Y0128_1145 {
	public static void main(String[] args) {
		System.out.println("1~100 ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("������ �ȵ˴ϴ�.");
		}
		else if(n>100) {
			System.out.println("100���� ũ�� �ȵ˴ϴ�.");
		}
		if (n/10 ==3 || n/10 == 6 || n/10 == 9) {
			System.out.print("¦");
			if(n%10 == 9 || n%10 == 6 || n%10 == 3) {
				System.out.print("¦");
			}
		}
	}

}
