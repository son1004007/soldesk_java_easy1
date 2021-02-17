package Y0125;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Y0125_test {
	public static void main(String[] args) {
		/*
		 * 3. 5�� ������ �Է¹޾� ���� ���ϴ� ���α׷�.
����, ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ� InputMismatchException���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �ۼ��ض�.
���� ���) 1��° ����: 1
         2��° ����: a
        �ٽ� �Է��ض�. �����ƴϴ�.
         2��° ���� : 2
         3��° ���� : 3
         4��° ����: 4
         5��° ����: 5           
         ����: 15
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum =0;
	
		for(int i=0 ; i<a.length ; i++) {
			System.out.println((i+1)+"��° ������ �Է��ϼ���");
			try {		
				a[i] = sc.nextInt();
				sum+=a[i];
			}
			catch(InputMismatchException e) {
				System.out.println("�ٽ� �Է��ض�. ������ �ƴϴ�.");
				i--;
				sc.nextLine();
			}
		}
		System.out.println("���� : "+sum);
		
		sc.close();
	}
}
