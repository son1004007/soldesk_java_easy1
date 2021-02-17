package Y0125;

class Num{
	int a;
	Num(int a){
		this.a = a;
	}
	int get() {
		return a;
	}
}
public class Y0125_1200 {
	public static void main(String[] args) {
		
		Num[] ary = new Num[] {new Num(1), new Num(2), new Num(3)};

		for(int i=0 ; i<ary.length ; i++) {
			System.out.println(ary[i].a);
		}
		
		for(Num a:ary) {
			System.out.println(a.get());
		}
	}
}
