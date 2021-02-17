package Y0121;

// 메소드를 배열로 생성. 객체 배열
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
//		Circle c4 = new Circle(); // 100개 생성! 못함.
		// 따라서 객체가 많으면 일괄처리 한다.
		Circle c[] = new Circle[100];
		
		for (int i=0 ; i<c.length ; i++) {
			c[i] = new Circle(i); // 객체 100개를 생성해서 배열에 저장
			System.out.print("반지름 : "+i+"\t");
			System.out.println("넓이 : "+ c[i].getarea());
		}

	}

}
