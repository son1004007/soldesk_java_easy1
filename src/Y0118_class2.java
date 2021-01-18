class Circle{
	private int r;
	private String name;
	//Circle class 에서만 사용가능
	
	double area() { // 메소드 (함수)
		return 3.14*r*r;
	}
	void show() { // 메소드 (함수) 
		System.out.println(name);
	}
}
public class Y0118_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir = new Circle();
//		cir.r = 10; // private이기 때문에 에러 발생
		
		System.out.println(cir.area());
		cir.show();
	}
	
	

}
