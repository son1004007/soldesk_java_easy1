package Y0127;
//1.������ ������ �ڵ�� �ۼ��ض�.
//1.1 Boolean �� false�� ��false����� ���ڿ��� ��ȯ�ض�.
//1.2 ���ڿ� ��36.5���� double Ÿ�� �Ǽ��� ��ȯ�ض�.
//1.3 ���ڿ� ��35���� ���� 35�� ��ȯ�ض�.

public class Y0127_1450 {
	
	public static void main(String[] args) {
		
		
		String b2= Boolean.toString(false);// answer
		boolean b = Boolean.parseBoolean("false");
		double d = Double.parseDouble("36.5");
		int i = Integer.parseInt("34");
		
		System.out.println(b2); //// answer
		System.out.println(b);
		System.out.println(d);
		System.out.println(i);
		
		
	}

}
