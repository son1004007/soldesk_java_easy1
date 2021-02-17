package Y0125;

public class Y0125_1709 {
	public static void main(String[] args) {
		//StringBuffer
		//문자의 개수에 따라 버퍼의 크기를 자동으로 조절할 수 있다.
		//문자열이 길거나 문자열 작업이 많은 경우
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" is very good");
		// 맨끝에 추가한다.
		sb.insert(0, "A ");
		sb.replace(2, 6, "Html");
		System.out.println(sb);
	}
}
