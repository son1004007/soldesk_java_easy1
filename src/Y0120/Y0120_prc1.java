package Y0120;
// �θ��� �⺻ �����ڰ� �켱�ȴ�.
// super(����)�� �Է��ϸ�, �⺻ �����ں��� �߰� �����ڰ� �켱�ȴ�.
// �߰� �����ڿ��� �⺻ �����ڸ� �ٽ� ȣ���ϱ� ���ؼ�, this()�� Book103�� ȣ�� �ߴ�.

class Book103{ 
	Book103(){ // Book�� �⺻ ������
		System.out.println("Book Ŭ���� $�⺻$ ������");
	}

	Book103(String a){ // Book�� �߰� ������
		this(); 
		// this�� �ڽ��� class�� ����Ų��. this() �𽺸޼ҵ�� Ŭ������ �⺻ �����ڸ� ����Ų��.
		// ���� this()�� Book103()�� ȣ��.
		System.out.println("Book Ŭ���� %�߰�% ������ "+a);
	}
}


class ComputerBook extends Book103{
	
	ComputerBook(String a){
		super(a); // �θ��� �߰� ������ ���� ȣ��.
		System.out.println("ComputerBook Ŭ���� $�⺻$ ������");
	}
}

public class Y0120_prc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerBook sedan1 = new ComputerBook("�� �ڹ�");

		
	}

}
