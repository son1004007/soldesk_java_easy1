package Y0203;

public class Y0203_1055 {

	public static void main(String[] args) {
		Number.pr(100);	//100 출력
		Number n = new Number();
		n.show(3.14);	// 3.14 출력
		// Number는 클래스명, pr, show()
	}
}
class Number{
	Number(){
		
	}
	static void pr(int a) {
		System.out.println("static void pr(int a) : " +a);
		
	}
	void show(double d) {
		System.out.println("void show(double d) :"+ d);
	}
}