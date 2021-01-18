import java.util.Scanner;
public class Y0115_prc2 {

	
	 static int big(int array[][],int a,int b) {

		 int limit=array[0][0];
//		   for (int i=0; i< array.length;i++){
//			   for(int j=0 ; j< array[i].length; j++) {
		   for (int i=0; i< a;i++){
			   for(int j=0 ; j< b; j++) {	   
				   if (limit<array[i][j]) {
					   limit = array[i][j];
				   }
			   }
		   }
		  return limit;
		 }
	 
	 
	   static void show(int array[]) {
		   for (int i=0; i < array.length ; i++) {
				   System.out.print(array[i]+ " ");
		   }
	   }

	   static void show2(int array[][]) {
		   Scanner tmp = new Scanner(System.in);
		   for (int i=0 ; i<array.length ; i++) {
			   for(int j=0 ; j<array[i].length ; j++) {
				   array[i][j] = tmp.nextInt();
				   System.out.println(array[i][j]);
			   }
		   }
		   tmp.close();
		   
	   }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		   int grade[][]= {{55,44,66},{90,95,100}};
		   int max=big(grade,2,3);
		   System.out.println(max);
		   //배열안에서 최대값 찾아서 출력
		   
		   

		   int array2[]=new int[] {4,5,6,7,8};
		   show(array2);
		   
		   int array3[][]=new int[2][2];
		   show2(array3);


	}

}
