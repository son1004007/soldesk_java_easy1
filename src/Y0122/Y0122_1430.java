package Y0122;

interface A{ // �������̽� �̱� ������ ��ü������ �Ұ���(�߻� Ŭ������ ����)
	public void funcA(); // �߻� �޼���
}
interface B{
	public void funcB();
}

interface C extends A,B{ // ���� Ŭ���� ����� ���� interface ���
	public void funcC(); // �߻� �޼���
}

class D implements C{ //Ŭ������ �������̽��� ��� �������� implements �� ����.
	public void funcA() {
		System.out.println("funcA");
	}
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcC() {
		System.out.println("funcC");
	}
	
}

public class Y0122_1430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D(); //D Ŭ���� ��ü
		A a1=d1;	// �θ𿡰� �ڽ��� upcasting 
		a1.funcA(); // 
		
		B b1=d1;	// �θ𿡰� �ڽ��� upcasting 
		b1.funcB(); // 
		
		C c1=d1;	// �θ𿡰� �ڽ��� upcasting 
		c1.funcC(); // 
		

	}

}
