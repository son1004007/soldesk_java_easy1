package Y0127;
//1.다음을 한줄의 코드로 작성해라.
//1.1 Boolean 값 false를 “false”라는 문자열로 변환해라.
//1.2 문자열 “36.5”를 double 타입 실수로 변환해라.
//1.3 문자열 “35”를 정수 35로 변환해라.

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
