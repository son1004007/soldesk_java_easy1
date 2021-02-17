package Y0128;

import java.util.ArrayList;
import java.util.Scanner;

public class Y0205_1110 {
	public static void main(String[] args) {
		 ArrayList<String> s= new ArrayList<String>();
		 Scanner sc = new Scanner(System.in);
		 
		 for (int i =0 ; i< 3 ; i++) {
			 System.out.println("문자열 입력해라");
			 String n = sc.next();
			 s.add(n);
			
		 }
		 for(int i =0; i<s.size(); i++) {
			 System.out.println(s.get(i));
		 }
		 
		 int max =0;
		 
		 for(int i =0; i<s.size(); i++) {
			 if(s.get(max).length() < s.get(i).length()) {
				 max = i;
			 }
		 }
		 System.out.println(s.get(max));
		 sc.close();
	}
}
