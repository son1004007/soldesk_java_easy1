package Y0121;
class AA{
	static int a;
	static void pr() { // �޼ҵ尡 static�̸�, ����ϴ� ������ static �̾�� �Ѵ�.
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
