class AA943{
	int x,y;
	AA943(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void pr1() {
		System.out.println(x+" "+y);
	}
}
public class Y0121_938 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA943 a = new AA943(30,40);
		
//		a.x = 30;
//		a.y = 40;
//		System.out.println(a.x + " "+a.y);
		a.pr1();
		

		
//		오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
//		오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 상요한다



	}

}
