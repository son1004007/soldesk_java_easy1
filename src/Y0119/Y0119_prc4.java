package Y0119;
class Book{
	String a=""; //  �ʵ�(����)
	int b;
	Book(String a, int b){ // �޼ҵ�(�Լ�)
		this.a = a; // �ʵ��� a�� �޼ҵ��� a�� �Է��Ѵ�. 
		this.b = b;
		
	}
	Book(String a){
//		this.a =a;
		this(a,2220); 
// this �뵵1. �ʵ� �̸��� �Ű����� �̸��� ���� ��, �ʵ� �̸� �տ� this
// this �뵵2. �ٸ�(���� �ִ�) ������ ȣ��
		
	}
	Book(){
		this("", 0);// ��(String a, int b) ������ ȣ��
		System.out.println("�⺻ ������ ȣ��"); // �⺻ �����ڰ� ���� ���� ȣ��Ǳ� ������ ������ ȣ���� ��µȴ�. 
	}
	
	void show() {
		System.out.println(a+" "+b);
	}
	
}
public class Y0119_prc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b 	= new Book("�ϸ�ǥ���", 30000);
		Book b1	= new Book("�ѱռ�");
		Book b2 = new Book();
		
		b.show(); //�ϸ�ǥ��� 30000
		b1.show(); //�ѱռ� 2220
		b2.show();
		
	}

}
