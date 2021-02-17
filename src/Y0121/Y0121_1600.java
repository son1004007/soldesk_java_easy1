package Y0121;

abstract class Ca{
	abstract int add(int a, int b);
	abstract double avg(int a[]);
	
}
class Cal2 extends Ca{
	int add(int a, int b) {
		return a+b;
	}
	
	
	double avg(int a[]) {
		int sum=0;		
		for(int i=0; i<a.length ; i++) {
			sum += a[i];
			
		}
		double avg = sum/a.length;
		return avg;
	}
}
public class Y0121_1600 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal2 c = new Cal2();
		System.out.println(c.add(3, 7));
		System.out.println(c.avg(new int[] {1,2,3}));

	}

}
