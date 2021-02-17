package Y0121;
class AA{
	static int a;
	static void pr() { // 메소드가 static이면, 사용하는 변수도 static 이어야 한다.
		System.out.println(a);
	}
}

public class Y0121_1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA a = new AA();
		a.a=30;
		a.pr();
	}

}
