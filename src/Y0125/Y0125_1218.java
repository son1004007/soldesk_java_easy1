package Y0125;

abstract class Com0{
	abstract int add(int a, int b);
	
}
class Note extends Com0{

	@Override
	int add(int a, int b) {
		return a+b;
	}
}

public class Y0125_1218 {
	public static void main(String[] args) {
		// 1. Com c = new Com(); // 추상이라 안됨
		// 2. Note n = new Note();
		// 3. Com c1 = new Note();
		
		Com0 c1 = new Note();
		System.out.println(c1.add(3,9));
		
		Note n = new Note();
		System.out.println(n.add(9, 12));
		
	}
}
