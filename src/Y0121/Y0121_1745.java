package Y0121;
import java.util.Scanner;
//�߻� Ŭ���� Circle
abstract class Circle9{
	protected double r;
	Circle9(double r){
		this.r=r;
	}
	abstract double get();
}
class Cir extends Circle9{

	Cir(double r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	double get() {
		// TODO Auto-generated method stub
		return r;
	}
	
}
public class Y0121_1745 {
	public static void main(String[] args) {
	
		//Circle class�� ���� ��ü �迭 5�� ����
		Circle9 c1[] = new Circle9[5];
		
		Scanner tmp = new Scanner(System.in);
		for(int i=0 ; i<c1.length ; i++) {
			System.out.println("�������� �Է��ϼ���");
			double r = tmp.nextDouble();
			
			// ��ü �����ؼ� �迭�� ����
			c1[i] = new Cir(r);
			System.out.println(c1[i].get());
		}
		tmp.close();
	}
}
