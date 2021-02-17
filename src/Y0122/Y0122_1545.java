package Y0122;

class In{
	private int num;
	In(int num){
		this.num=num;
	}
	public String toString() {
		return num+"";
	}
}
public class Y0122_1545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		In i = new In(4);
		System.out.println(i);  //객체의 메모리 코드. return 값을 추가해서 4로 변경

		
		
		Integer z = new Integer(10);
		Double x = new Double(3.14);
		System.out.println(z);
		System.out.println(x);
		///////////// unboxing
		
		Integer iz = new Integer(10); //boxing
		int i1 = iz.intValue(); // unboxing
		
		Character c = new Character('a');
		char c1=c.charValue();
		
		Boolean b = new Boolean(true);
		boolean b1=b.booleanValue();
		
		//문자열을 기본타입으로 변환
		int i2 =Integer.parseInt("123");
		boolean b2 = Boolean.parseBoolean("true");
		double d2 = Double.parseDouble("3.14");
		
		int i3 = Integer.valueOf("123");
		int i4 = Integer.valueOf("10")+Integer.valueOf("123");
		System.out.println(i4);
		
		String s = Integer.toString(123);
		//정수형 객체 123을 문자열로 변환
		// Integer i =100; Auto boxing
		
	}

}
