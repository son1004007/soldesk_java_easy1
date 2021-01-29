package Y0119;
class Car{
	private String color; // 문자열 필드
	private int speed; // 정수형 필드
	
//	Car(){
//		color = "빨강";
//		speed = 0;
//	}
	
//	Car(String c, int s){ // 필드
//		color = "빨강"; // 매개변수
//		speed = 0;
//	}
	Car(String color, int speed){ // 필드
		this.color = color; // 매개변수
		this.speed = speed;
	}

	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
}


public class Y0119_page407 {

	public static void main(String[] args) {
//		Car myCar1 = new Car(); // 생성자는 Car() 이며, 기본생성자 이다.
		Car myCar1 = new Car("노랑", 100); // 파라미터가 있는 생성자 이다. 매개변수에 값이 있다. 생성자 호출.
		Car myCar2 = new Car(null, 0); // 생성자 
		
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+ "이며, 현재속도는 "+myCar1.getSpeed()+"km 입니다.");
		
	}
}
