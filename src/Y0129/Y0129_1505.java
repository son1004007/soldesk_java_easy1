package Y0129;

import java.util.ArrayList;

public class Y0129_1505 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		
		for(int i =0; i< a.size() ; i++) {
			String s = a.get(i);
			System.out.println(s);
		}
	}
}
