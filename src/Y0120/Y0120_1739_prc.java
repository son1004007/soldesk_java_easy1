package Y0120;
class Circle1749{
	private int a;
	int get(){
		return a;
	}
	
	Circle1749(int a){ // �̺κ� class �� �ȹٲ��־���.
		
		this.a=a;
	}

}
class NCircle extends Circle1749{

	private String b;
	NCircle(int a, String b){
		super(a); // a�� ȣ��. �θ��� �߰�������(�⺻������x)�� ȣ���Ѵ�.
		this.b=b;
	}
	
	void show() {
		System.out.println("������ "+get()+" "+b+" ��"); // �����̺��̹Ƿ�, ȣ������ ���ϴϱ� get �Լ��� ����Ѵ�.
	}
}

public class Y0120_1739_prc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. �θ� Ŭ���� �̸��� Circle ����
		//2. �ڽ� Ŭ���� �̸��� NCircle 
		//3. �θ�Ŭ���� �ʵ忡 int�� 1��
		//4. �θ�Ŭ������ get()�Լ� ����� int���� ��ȯ�ϴ� �Լ�
		// ��� �ʵ�� private�� ����
		
		
		NCircle n = new NCircle(10,"red");
		n.show(); //������ 10 red ��

	}

}
