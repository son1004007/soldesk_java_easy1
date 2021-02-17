package Y0125;
interface Re{
	default void show() {
		System.out.println("사각형!!");
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
		r.show();         		//"사각형!!" 출력
		System.out.println("면적" + r.area());
		
	/*
	 * 6. main()를 보고 인터페이스를 작성해라. (인터페이스명은 Re, 모든 메소들들을 인터페이스안에서 선언하고 show함수는 default로 설정,area는 abstract로 설정)

main(){
Re r=new Rec(10,20);
r.show();         //"사각형!!" 출력
System.out.println("면적" + r.area());

실행결과) 사각형!!
면적 200  
	 */
		

	}
}
