package Y0120;
class Number{
	static void show(int a) { // ���� �ε�
		System.out.println(a);
	}
	void show(double a) { 
		System.out.println(a);
	}
}
public class Y0120_1421_OverRiding_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number.show(20); //class �̸����� �����ؼ� �Լ��� ȣ���ϱ� ������ 
		//void show (int a) �տ� static�� ����
		Number n = new Number();
		n.show(3.14);
	}

}
