package Y0122;

interface Addin{
	public int add(int a, int b);
	public int add(int a); // ���� �ε�
}
class Add implements Addin{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a) {
		int sum =0;
		for(int i = 1 ; i<=a ; i++) {
			sum+=i;
		}
		return sum;
	}
}
public class Y0122_1530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		System.out.println(a.add(1,4)); // �� ���� ��
		System.out.println(a.add(10)); // 1���� 10���� ��

	}

}
