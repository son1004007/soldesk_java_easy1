package Y0121;

// �޼ҵ带 �迭�� ����. ��ü �迭
class Circle{
	int r;
	Circle(int r){
		this.r=r;
	}
	double getarea() {
		return r*r*3.14;
	}
}
public class Y0121_1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Circle c1 = new Circle();
//		Circle c2 = new Circle();
//		Circle c3 = new Circle();
//		Circle c4 = new Circle(); // 100�� ����! ����.
		// ���� ��ü�� ������ �ϰ�ó�� �Ѵ�.
		Circle c[] = new Circle[100];
		
		for (int i=0 ; i<c.length ; i++) {
			c[i] = new Circle(i); // ��ü 100���� �����ؼ� �迭�� ����
			System.out.print("������ : "+i+"\t");
			System.out.println("���� : "+ c[i].getarea());
		}

	}

}
