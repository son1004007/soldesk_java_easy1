package Y0122;

import java.util.Scanner;
public class Y0122_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		6. ���� 10���� �������� �Է��Ͽ� ���������������Ľ��Ѽ� ����ض�.
//		�迭, ��������, �̿�
		
		int a[] = new int[5];
		System.out.println("�迭 �Է�");
		for (int i=0 ; i <a.length ; i++) {
			System.out.println((i+1)+"��° ������ �Է��ϼ���");
			a[i] = sc.nextInt();
		}
		System.out.println("�Է� �迭");
		for (int i=0 ; i <a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("���� ����. ���� ����");
		int tmp;
		
		for (int i=0 ; i < a.length ; i++) {
			for (int j=i+1 ; j < a.length ; j++) {
				if (a[i] > a[j]) {
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for (int i=0 ; i <a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		
		

	}

}
