package Y0125;
interface Re{
	default void show() {
		System.out.println("�簢��!!");
	}
	abstract int area();
}
class Rec implements Re{

	int a,b;
	Rec(int a, int b){
		this.a=a;
		this.b=b;
	}
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

public class Y0125_1100_Test6 {
	public static void main(String[] args) {
		Re r=new Rec(10,20);	//upcasting
		r.show();         		//"�簢��!!" ���
		System.out.println("����" + r.area());
		
	/*
	 * 6. main()�� ���� �������̽��� �ۼ��ض�. (�������̽����� Re, ��� �޼ҵ���� �������̽��ȿ��� �����ϰ� show�Լ��� default�� ����,area�� abstract�� ����)

main(){
Re r=new Rec(10,20);
r.show();         //"�簢��!!" ���
System.out.println("����" + r.area());

������) �簢��!!
���� 200  
	 */
		

	}
}
