package Y0120;
class AAA{
	void ride() {
		System.out.println("���� ���̵� a");
	}
	void load() {
		System.out.println("���� �ε� a");
	}
}

class BBB extends AAA{
	void ride() { // �������̵� : �θ��� �Լ��� ������
		System.out.println("���� ���̵� b");
	}
	void load(int a) { // ���� �ε� :  �Լ� �̸��� ������, �ʵ�(�Ű�����)���� �ٸ��� ������ ȣ��ȴ�.
		System.out.println("���� �ε� b"+a);
	}
}
public class Y0120_OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a=new AAA();
		a.ride();
		a.load();
		
		BBB b = new BBB();
		b.ride();
		b.load(10);
	}

}
