package Y0128;

//7. Main()�� ���� �Լ� �����ض�. ( �迭 ����� ���)
//int [] arr={1,2,3,4,5};
//int [] r;
//r=add(arr,5)

public class Y0129_1220 {
	static int[] add(int a[], int b) {
		int sum=0;
		for(int i=0;i<b; i++) {
			sum +=a[i];
		}
		System.out.println(sum);
		return a;
	}
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5};
		int [] r;
		r=add(arr,5);
		System.out.println(r);
	}

}
