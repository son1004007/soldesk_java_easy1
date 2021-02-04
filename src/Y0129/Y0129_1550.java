package Y0129;

import java.util.HashMap;

public class Y0129_1550 {
	public static void main(String[] args) {
		HashMap<Integer, String> h= new HashMap<Integer, String>();
		h.put(1, "A");
		h.put(2, "B");
		h.put(3, "C");
		
		System.out.println(h.get(2)); //키를 기준으로 값을 불러낸다.
		
	}
}
