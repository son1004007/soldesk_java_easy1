package Y0125;
class Book{
	String a,b;
	
	Book(String a, String b){
		this.a=a;
		this.b=b;
	}

	Book(String a){
//		this.a=a;
//		b = "�۰� �̻�";
		this(a,"�۰� �̻�"); // a, b ���� �����ϴ� �ͺ��� �̰� �� ���(�޸� ������ ����)�Ѵ�.
	}
	
	Book(){
		this("������ ȣ��", ""); // a, b���� �����ϴ� �ͺ��� �̰� �� ����ϴ�.
//		a = "������";
//		b = "ȣ��!!!";
	}
	void show() {
		System.out.println(a + " " + b);
	}
}

public class Y0125_1500_test {
	
	public static void main(String[] args) {
		//����1 main�Լ��� ���� �ۼ��ض�.
		Book b1 = new Book("���� ����", "�ô��� �佽��");
		Book b2 = new Book("�� �غ�");
		Book b3 = new Book();
		
		b1.show();
		b2.show();
		b3.show();
		
//		���� ���) ���� �ż��� �ô��� �佽��
//      �� �غ� �۰� �̻�
//      ������ ȣ��!! 
		
	}
}
