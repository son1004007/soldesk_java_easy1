package Y0126;
class Circle126{
	int r;
	double z ;
	Circle126(int r){
		this.r=r;
	}
	public String toString() {
		return r+" ";
	}
	public boolean equals(Object ob) {
		if (this.r == ((Circle126)ob).r) { // �ٿ�ĳ����
			return true;
		}
		return false;
	}
	
}
public class Y0126_1050_test {

	public static void main(String[] args) {
//		5. equals(�� ���� ������ ������ ��),  toString�޼ҵ带 ����Ͽ� �ϼ����Ѷ�.
//		(�������� 30��)

		Circle126 a=new Circle126(30);
		Circle126 b=new Circle126(30);
		System.out.println("������ "+a);
		System.out.println("������ "+b);
		if(a.equals(b)) {//�޸��ּ��� ���� ���ϱ� ���� boolean �޼ҵ带 �ۼ��� 
			System.out.println("���� ��");
			}
		else{
			System.out.println("�ٸ� ��");
			}
	}
}
