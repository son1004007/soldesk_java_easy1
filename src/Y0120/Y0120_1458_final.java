package Y0120;
class Car1458{
	public int gas; // �ʵ�
	public void up() {
		gas+=1;
		System.out.println("��. gas : "+gas);
	}
	public final void stop() { // ��ȯ�� �տ� ���̸��. �ڽ� Ŭ�������� �� ���� �ȵ�.
		
		gas=0;
		System.out.println("��ž. gas : "+gas);
	}	
}

class SportsCar extends Car1458{
	public void up() { // ������ ���� ���̵�
		gas+=100;
		System.out.println("��. gas : "+gas);
	}
//	public void stop() { // final�� �����Ǽ� ���� ����.
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
