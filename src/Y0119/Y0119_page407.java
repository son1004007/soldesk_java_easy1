package Y0119;
class Car{
	private String color; // ���ڿ� �ʵ�
	private int speed; // ������ �ʵ�
	
//	Car(){
//		color = "����";
//		speed = 0;
//	}
	
//	Car(String c, int s){ // �ʵ�
//		color = "����"; // �Ű�����
//		speed = 0;
//	}
	Car(String color, int speed){ // �ʵ�
		this.color = color; // �Ű�����
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
//		Car myCar1 = new Car(); // �����ڴ� Car() �̸�, �⺻������ �̴�.
		Car myCar1 = new Car("���", 100); // �Ķ���Ͱ� �ִ� ������ �̴�. �Ű������� ���� �ִ�. ������ ȣ��.
		Car myCar2 = new Car(null, 0); // ������ 
		
		System.out.println("�ڵ���1�� ������ "+myCar1.getColor()+ "�̸�, ����ӵ��� "+myCar1.getSpeed()+"km �Դϴ�.");
		
	}
}
