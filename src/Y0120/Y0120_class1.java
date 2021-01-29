package Y0120;
class Car9{
	String color="red";
	int speed=0;
	int count1=0; // 클래스 안에서 공유하지 않음.
	static int count9=0; // 클래스 안에서 공유함. 따라서 갯수가 누적됨.
	
	Car9(){
		count1++;
		count9++;
	}

	Car9(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
		System.out.println(color+""+speed);
	}
	
}

public class Y0120_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9 c1 = new Car9();
//		Car9 c2 = new Car9("red", 200);
		Car9 c2 = new Car9();
		Car9 c3 = new Car9();
		
//		System.out.println("Count1 : "+c1.count1);
//		System.out.println("Count1 : "+c2.count1);
//		System.out.println("Count1 : "+c3.count1); // 클래스로 부터 호출이 가능하다.
		System.out.println("Count9 : "+c1.count9);
//		System.out.println("Count9 : "+c2.count9);
//		System.out.println("Count9 : "+c3.count9); // 클래스로 부터 호출이 가능하다.
	
	}

}
