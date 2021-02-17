package Y0125;
//4. 실수 9.5를 객체화(박싱) 시켜라.
//4.1) 객체화 시킨 9.5를 문자열로 변경해라.
//4.2) 문자열로 변경한 9.5를 기본형값으로 언박싱해라.


public class Y0125_1758 {
	public static void main(String[] args) {
		Double d = 9.5;
		String s = d.toString();
		double d2 = Double.parseDouble(s);
		double d3 = Double.valueOf(s);
	}
}
