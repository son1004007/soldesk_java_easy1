package Y0122;

//		5. 다음 Circle클래스를 활용하여 Circle 객체 배열을 생성하고, 
//		5개의 원 반지름을 입력받아 배열에저장한 후, 
//		원의 면적의 합을 출력해라.
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
			System.out.println((i+1)+"번째 원의 반지름을 입력하세요");
			double r = tmp.nextDouble();
			s[i] = new Circle122(r);
			sum+=s[i].area();
			
		}
		System.out.println(sum);
	}

}
