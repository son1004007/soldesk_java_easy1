package Y0120;
class Car1458{
	public int gas; // 필드
	public void up() {
		gas+=1;
		System.out.println("업. gas : "+gas);
	}
	public final void stop() { // 반환형 앞에 붙이면됨. 자식 클래스에서 재 정의 안됨.
		
		gas=0;
		System.out.println("스탑. gas : "+gas);
	}	
}

class SportsCar extends Car1458{
	public void up() { // 재정의 오버 라이딩
		gas+=100;
		System.out.println("업. gas : "+gas);
	}
//	public void stop() { // final로 고정되서 선언 못함.
//	}
}
public class Y0120_1458_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car1458 c = new Car1458();
		c.gas=0;
		
		c.stop();
		c.up();
		
		SportsCar s = new SportsCar();
		s.stop();

	}

}
