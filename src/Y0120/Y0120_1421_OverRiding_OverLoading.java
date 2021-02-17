package Y0120;
class Number{
	static void show(int a) { // 오버 로딩
		System.out.println(a);
	}
	void show(double a) { 
		System.out.println(a);
	}
}
public class Y0120_1421_OverRiding_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number.show(20); //class 이름으로 접근해서 함수를 호출하기 때문에 
		//void show (int a) 앞에 static을 선언
		Number n = new Number();
		n.show(3.14);
	}

}
