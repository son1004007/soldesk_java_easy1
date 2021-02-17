package Y0125;

public class Y0125_0955_Test2 {
	
	public static void main(String[] args) {
/*
4. main()를 보고 클래스 작성해라.
main(){
Shape s = new Shape();
Shape s1 = new Shape(2,5);
s.pr(“@”); 
s1.pr(“#”);
s1.show();	//@@@-> 1행 3열로 출력
s1.show();	//#####->2행 5열로 출력
			//#####
		 */
		 Shape s = new Shape();
		 Shape s1 = new Shape(2,5);
		 s.pr("@"); 
		 s1.pr("#");
		 s1.show();	//@@@-> 1행 3열로 출력
		 s1.show();	//#####->2행 5열로 출력
		 			//#####
	}
	
}
//생성자 new Shape(2,5) , pr함수
class Shape{
	int a, b;
	String c;
	Shape(){
//		this(1,3);
		a = 1;
		b = 3;
	}
	Shape(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	void pr(String c) {
		this.c = c;
	}
	void show() {
		for(int i=0 ; i < a; i++) {
			for(int j=0 ; j<b ; j++) {
				System.out.print(c);	
			}
			System.out.println();
		}
	}
}
