package Y0122;

import java.util.Scanner;
public class Y0122_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		6. 정수 10개를 무작위로 입력하여 오름차순으로정렬시켜서 출력해라.
//		배열, 버블정렬, 이용
		
		int a[] = new int[5];
		System.out.println("배열 입력");
		for (int i=0 ; i <a.length ; i++) {
			System.out.println((i+1)+"번째 정수를 입력하세요");
			a[i] = sc.nextInt();
		}
		System.out.println("입력 배열");
		for (int i=0 ; i <a.length ; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("버블 정렬. 오름 차순");
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
