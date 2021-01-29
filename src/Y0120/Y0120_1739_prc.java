package Y0120;
class Circle1749{
	private int a;
	int get(){
		return a;
	}
	
	Circle1749(int a){ // 이부분 class 명 안바껴있었음.
		
		this.a=a;
	}

}
class NCircle extends Circle1749{

	private String b;
	NCircle(int a, String b){
		super(a); // a를 호출. 부모의 추가생성자(기본생성자x)를 호출한다.
		this.b=b;
	}
	
	void show() {
		System.out.println("반지름 "+get()+" "+b+" 색"); // 프라이빗이므로, 호출하지 못하니까 get 함수를 사용한다.
	}
}

public class Y0120_1739_prc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 부모 클래스 이름은 Circle 설정
		//2. 자식 클래스 이름은 NCircle 
		//3. 부모클래스 필드에 int값 1개
		//4. 부모클래스에 get()함수 만들어 int값을 반환하는 함수
		// 모든 필드는 private로 설정
		
		
		NCircle n = new NCircle(10,"red");
		n.show(); //반지름 10 red 색

	}

}
