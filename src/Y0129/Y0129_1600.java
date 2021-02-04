package Y0129;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Y0129_1600 {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("봄", "Spring");
		h.put("여름", "Summer");
		h.put("가을", "Autumn");
		h.put("겨울", "Winter"); 			// put : 입력
		Set<String> season = h.keySet();		// 키들의 집합
		Iterator<String> it = season.iterator();
		
		while(it.hasNext()) { // hasNext는 while로만.
			String s1 = it.next();
			String s2 = h.get(s1);
			System.out.println(s1+"\t"+s2);
//			System.out.println(s2);
		}
		System.out.println(h.get("봄")); // get : 출력
	}
}
