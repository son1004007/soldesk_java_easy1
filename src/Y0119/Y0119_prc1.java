package Y0119;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Y0119_prc1 {
//	4.	�迭�� �������� ����ϴ� show()�Լ��� �����ض�.
	static void show(int array[]) {
		System.out.println("�迭 ����");
		for (int j = array.length-1 ; j>=0 ; j--) {
	
			System.out.print(array[j]+ " ");
		}
		
	}
	
//	2.	������ ��ȣ�� ��÷�� ������ ��ȣ�� Ȯ���Ͽ� ��ġ�ϴ� ��ȣ�� ������ ����ϴ� ���α׷�. 
//	�� �迭�� main�Լ��� �����ϰ� �� �迭���� ��ġ�ϴ� ��ȣ�� ã�� �� ������ ��ȯ�ض�.
	static int same(int a1[], int a2[]) {
		int count=0;
		for (int i=0; i < a1.length ; i++) {
			for(int j=0 ; j < a2.length ; j++) {
				if (a1[i] == a2[j]) {
					count ++;
				}
			}
		}
		return count;
	}
	static void same2(int a1[], int a2[]) {
		int count=0;
		for (int i=0; i < a1.length ; i++) {
			for(int j=0 ; j < a2.length ; j++) {
				if (a1[i] == a2[j]) {
					count ++;
				}
			}
		}
		System.out.println("��ġ : "+count);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
//		1.	FileOutputStream�� �̿��Ͽ� byte[] �迭 �ӿ� ����ִ� ���� test.txt���Ͽ� �����ض�.
//		byte b[]={4,6,7,8,-1,24};
//		1.2	FileInputStream�� �̿��Ͽ� test.txt������ �о� byte[] �ӿ� �����ϰ� ȭ�鿡 ����ض�.
//
		
		
		byte b[]={4,6,7,8,-1,24};
		FileOutputStream fos = new FileOutputStream("202210119_fios1.txt");
		ByteArrayInputStream bai = new ByteArrayInputStream(b);

		int r;
		while((r=bai.read()) != -1) {
			fos.write(r);
		}
		bai.close();
		fos.close();
		
		//1.2 ������


		
		
		
		
//		2.	������ ��ȣ�� ��÷�� ������ ��ȣ�� Ȯ���Ͽ� ��ġ�ϴ� ��ȣ�� ������ ����ϴ� ���α׷�. 
//			�� �迭�� main�Լ��� �����ϰ� �� �迭���� ��ġ�ϴ� ��ȣ�� ã�� �� ������ ��ȯ�ض�.
//			main(){
		
			int lotto[]={4,10,25,30,45,47};
			int my[]={1,4,7,26,45,48};
			int r2=0;
			r2=same(lotto,my);
			
			System.out.printf("��ġ�ϴ� ��ȣ�� ����: %d\n", r2);
			
			same2(lotto,my);
			
		
		
		
		
//		4.	�迭�� �������� ����ϴ� show()�Լ��� �����ض�.
//		main(){
//		 int ary[]{6,2,8,4,9};
//		 show(ary);}
//
			System.out.println("����4");
			int ary[] = {6,2,8,4,9};
			
			show(ary);
			
//		5.	���� �迭�� ��ü �հ� ��� ���(�Ҽ��� ù°�ڸ�����)
//		main(){
//		  int [][]ary ={{43,97},{34,77,87},{100,95,38,89}}; }
//
			
			
			int ary5[][] = {{43,97},{34,77,87},{100,95,38,89}};
			
			int sum5=0;
			int count5=0;
			for (int i=0 ; i<ary5.length ; i++) {
				for(int j=0; j<ary5[i].length ; j++) {
					sum5 += ary5[i][j];
					count5++;
				}
			}
			System.out.println("��ü ��"+ sum5);
			System.out.println("��ü ��� "+ (double)sum5/count5);
			System.out.printf("��ü ����� �Ҽ��� ù°�ڸ� : %.1f \n", ((double)sum5/count5));
			
//		6.	�ټ����� �л��� ������ �Է��Ͽ� ��ȿ ������ ��� ����ϴ� ���α׷�
//		��ȿ������ �ְ����� �������� ������ �����̸� ����� ��ȿ������ ����ض�.
//		(for-if�� ��ø, contine���)
//		������) 5�� �л� ���� �Է� : 1 2 3 4 5
//		         ��ȿ ����: 2 3 4
//		         ���: 3.0
//		�̿Ϸ� 	
			int array[] = new int[5];
			Scanner scr = new Scanner(System.in);
			int tmp;

			
			for (int i=0; i <array.length ; i++) {
				System.out.print((i+1)+"��° �л��� ������ �Է��ϼ���");
				array[i]=scr.nextInt();
				
			}
			for (int i=0; i <array.length ; i++) {
				System.out.print(array[i]+"\t");
			}

			System.out.println();
			System.out.println("�迭 ���� �� ���");
			Arrays.sort(array);
			for (int i=0; i <array.length ; i++) {
				System.out.print(array[i]+"\t");
				
			}
			
//			for (int i=1; i <array.length ; i++) {
//				
//				if(array[i] > array[i-1]) {
//					tmp = array[i-1];
//					array[i-1] = array[i];
//					array[i]= tmp;
//				}
//				
//			}
			
			for (int i=0; i <array.length ; i++) {
				System.out.print(array[i]+"\t");
			}

			
			
//
//		7.	Sample.txt���Ͽ� ������ �ڹٸ� �����մϴ١��� �����ϰ� ������ �о� ȭ�鿡 ����ض�.
//		(String [] �迭�� �ʱ�ȭ�ؼ� for������ �б�)



		
	}

}
