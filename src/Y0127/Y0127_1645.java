package Y0127;

import java.util.StringTokenizer;

public class Y0127_1645 {

	public static void main(String[] args) {
		String p ="1+2+3";
		StringTokenizer s = new StringTokenizer(p,"+");
		
		System.out.println(p);
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}
}
