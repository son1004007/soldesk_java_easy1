package Y0119;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Y0119_prc1 {
//	4.	배열을 역순으로 출력하는 show()함수를 정의해라.
	static void show(int array[]) {
		System.out.println("배열 역순");
		for (int j = array.length-1 ; j>=0 ; j--) {
	
			System.out.print(array[j]+ " ");
		}
		
	}
	
//	2.	복권의 번호와 추첨한 복권의 번호를 확인하여 일치하는 번호의 개수를 출력하는 프로그램. 
//	두 배열은 main함수에 선언하고 두 배열에서 일치하는 번호를 찾아 그 개수를 반환해라.
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
		System.out.println("일치 : "+count);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
//		1.	FileOutputStream을 이용하여 byte[] 배열 속에 들어있는 값을 test.txt파일에 저장해라.
//		byte b[]={4,6,7,8,-1,24};
//		1.2	FileInputStream을 이용하여 test.txt파일을 읽어 byte[] 속에 저장하고 화면에 출력해라.
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
		
		//1.2 빼먹음


		
		
		
		
//		2.	복권의 번호와 추첨한 복권의 번호를 확인하여 일치하는 번호의 개수를 출력하는 프로그램. 
//			두 배열은 main함수에 선언하고 두 배열에서 일치하는 번호를 찾아 그 개수를 반환해라.
//			main(){
		
			int lotto[]={4,10,25,30,45,47};
			int my[]={1,4,7,26,45,48};
			int r2=0;
			r2=same(lotto,my);
			
			System.out.printf("일치하는 번호의 개수: %d\n", r2);
			
			same2(lotto,my);
			
		
		
		
		
//		4.	배열을 역순으로 출력하는 show()함수를 정의해라.
//		main(){
//		 int ary[]{6,2,8,4,9};
//		 show(ary);}
//
			System.out.println("문제4");
			int ary[] = {6,2,8,4,9};
			
			show(ary);
			
//		5.	다음 배열의 전체 합과 평균 출력(소수점 첫째자리까지)
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
			System.out.println("전체 합"+ sum5);
			System.out.println("전체 평균 "+ (double)sum5/count5);
			System.out.printf("전체 평균의 소수점 첫째자리 : %.1f \n", ((double)sum5/count5));
			
//		6.	다섯명의 학생의 점수를 입력하여 유효 점수와 평균 출력하는 프로그램
//		유효점수는 최고점과 최저점을 제외한 점수이며 평균은 유효점수로 계산해라.
//		(for-if문 중첩, contine사용)
//		실행결과) 5명 학생 점수 입력 : 1 2 3 4 5
//		         유효 점수: 2 3 4
//		         평균: 3.0
//		미완료 	
			int array[] = new int[5];
			Scanner scr = new Scanner(System.in);
			int tmp;

			
			for (int i=0; i <array.length ; i++) {
				System.out.print((i+1)+"번째 학생의 점수를 입력하세요");
				array[i]=scr.nextInt();
				
			}
			for (int i=0; i <array.length ; i++) {
				System.out.print(array[i]+"\t");
			}

			System.out.println();
			System.out.println("배열 정렬 및 출력");
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
//		7.	Sample.txt파일에 “저는 자바를 좋아합니다”를 저장하고 파일을 읽어 화면에 출력해라.
//		(String [] 배열로 초기화해서 for문으로 읽기)



		
	}

}
