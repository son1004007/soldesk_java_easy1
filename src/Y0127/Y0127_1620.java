package Y0127;
//6. ���� main()�� ���� �߻� Ŭ������ �߻�޼ҵ� �ۼ��ض�.
//(total �Լ��� �迭 ��(1,2,3,4,5) ���� ���Ϲ޴� �Լ�)
//main(){
//Ab c=new Cd();
//System.out.println(c.total(new int []{1,2,3,4,5}));

abstract class Ab{
	abstract int total(int[] a);
}
class Cd extends Ab{

	int[] a;
	int total(int[] a){
		this.a=a;
		int sum=0;
		for(int i =0 ; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}

public class Y0127_1620 {
	public static void main(String[] args) {
		Ab c = (Ab) new Cd(); // ��ĳ����
		System.out.println(c.total(new int []{1,2,3,4,5}));
	}

}
