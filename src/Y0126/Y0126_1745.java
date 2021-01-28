package Y0126;

interface Figure{
	public void circle_area();
	public void rec_area();
}

class Circle123 implements Figure{

	int a,b;
	Circle123(int a){
		this.a=a;
	}
	public void circle_area() {
		
		// TODO Auto-generated method stub
		System.out.println(a*a*3.14);
		
	}
	@Override
	public void rec_area() {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	
}
class Rec123 implements Figure{


	int a,b;
	Rec123(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void rec_area() {
		System.out.println(a*b);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void circle_area() {
		// TODO Auto-generated method stub
		System.out.println(a*a*3.14);
	}
	
}
public class Y0126_1745 {

	public static void main(String[] args) {
		
		//Figure 인터페이스 만들어 circle_area()에는 원면적
		//rec_area()에는 사각면적을 출력하라
		
		Figure f1 = new Circle123(5); //3.14*5*5
		Figure f2 = new Rec123(2,5); // 2*5
		f1.circle_area();
		f2.rec_area();
	}
}
