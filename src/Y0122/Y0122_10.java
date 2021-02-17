package Y0122;

class Arr{
	static int []con(int a[],int b[]){
	
		int arr[]=new int[a.length + b.length];
		
		for(int i=0;i<a.length; i++) {
			arr[i]=a[i];
			// arr에 1,2,3,4 저장
			for(int j=a.length ; j<a.length+b.length ; j++) {
				arr[j]=b[j-a.length];
				//arr에 5,6,7,8 저장
			}
		}
		return arr; //
	}
	static void pr(int a[]) {
		for(int i=0; i<a.length ; i++) {
			System.out.print(a[i]);
		}
		
		
	}
}

public class Y0122_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary1[]= {1,2,3,4};
		int ary2[]= {5,6,7,8};
		int ary3[]= Arr.con(ary1,ary2);
		Arr.pr(ary3);

	}

}
