package Y0129;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Y0129_1600 {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("��", "Spring");
		h.put("����", "Summer");
		h.put("����", "Autumn");
		h.put("�ܿ�", "Winter"); 			// put : �Է�
		Set<String> season = h.keySet();		// Ű���� ����
		Iterator<String> it = season.iterator();
		
		while(it.hasNext()) { // hasNext�� while�θ�.
			String s1 = it.next();
			String s2 = h.get(s1);
			System.out.println(s1+"\t"+s2);
//			System.out.println(s2);
		}
		System.out.println(h.get("��")); // get : ���
	}
}
