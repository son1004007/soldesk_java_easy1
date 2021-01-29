package Y0120;
class AAA{
	void ride() {
		System.out.println("오버 라이딩 a");
	}
	void load() {
		System.out.println("오버 로딩 a");
	}
}

class BBB extends AAA{
	void ride() { // 오버라이딩 : 부모의 함수를 재정의
		System.out.println("오버 라이딩 b");
	}
	void load(int a) { // 오버 로딩 :  함수 이름이 같지만, 필드(매개변수)값이 다르기 때문에 호출된다.
		System.out.println("오버 로딩 b"+a);
	}
}
public class Y0120_OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a=new AAA();
		a.ride();
		a.load();
		
		BBB b = new BBB();
		b.ride();
		b.load(10);
	}

}
