package Y0121;
abstract class Car{		// �߻� Ŭ����
	String name;
	void run() {		// �Ϲ� �޼ҵ�
		System.out.println("���� �����δ�.");
	}
	abstract void stop(); {// �߻� �޼ҵ�(�󲮵��� �Լ�). �߻� �޼ҵ尡 ������ Ŭ������ �ݵ�� �߻� Ŭ�������� �Ѵ�.
		// ������ �Է��� �� ����.
	}
}
class Sedan1 extends Car{
	Sedan1(){
		name="���̸�";
	}
	void stop(){
		System.out.println("stop ");
	}
	
}
//�߻� Ŭ�����ȿ��� �Ϲ����� �޼ҵ�, �߻� �޼ҵ� �Ѵ� ����
//�߻�18

public class Y0121_1545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
