package Y0128;

import java.util.StringTokenizer;


//2. ���ڿ� ��1+2+3+4+5���� ��+���� �����ؼ� ���� 15�� ����ض�
//(StringTokenizer,parseInt, trim() �� ���)

public class Y0128_1100 {
	
	public static void main(String[] args) {
		String str = "1+2+3+4+5";
		StringTokenizer s = new StringTokenizer(str, "+");
		//���ڿ� s : "1" "2" "3" "4" "5" 
		
		int sum = 0;
		while(s.hasMoreTokens()) {
			String a = s.nextToken(); //"1" "2" "3" "4" "5" 
			String b = a.trim(); //"12345"
			sum+=Integer.parseInt(b);
//			sum+=Integer.parseInt(s.nextToken());
			
		}
		System.out.println(sum);
		
	}
}
