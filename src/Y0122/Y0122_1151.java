package Y0122;

//		5. ���� CircleŬ������ Ȱ���Ͽ� Circle ��ü �迭�� �����ϰ�, 
//		5���� �� �������� �Է¹޾� �迭�������� ��, 
//		���� ������ ���� ����ض�.
import java.util.Scanner;
class Circle122{
	private double r;
	Circle122(double r){
		this.r=r;
		}
		
	double area(){
	return 3.14*r*r;
	}

}
		
public class Y0122_1151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tmp = new Scanner(System.in);
		Circle122 s[] = new Circle122[5];
		
		double sum=0;
		for(int i=0 ; i<5 ; i++) {
			System.out.println((i+1)+"��° ���� �������� �Է��ϼ���");
			double r = tmp.nextDouble();
			s[i] = new Circle122(r);
			sum+=s[i].area();
			
		}
		System.out.println(sum);
	}

}
