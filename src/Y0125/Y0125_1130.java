package Y0125;

import java.util.StringTokenizer;

public class Y0125_1130 {
	public static void main(String[] args) {
		String str = "id=123#name=gildong#addr=seoul";
		//#�� �������� ���ڿ� ������
		StringTokenizer s = new StringTokenizer(str, "#");
		
		int n = s.countTokens();
		System.out.println(n);
		
		while(s.hasMoreTokens()) {
			String a = s.nextToken();
			System.out.println(a);
		}
		
	}
}
