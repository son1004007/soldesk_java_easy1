package Y0129;

import java.util.Iterator;
import java.util.LinkedList;

public class Y0129_1540 {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("one");
		li.add("two");
		li.add("three");
		
		//���ͷ����ͷ� ������ ���� two��� �̸��� ������ two�� �����Ѵ�.
		//compareTo()
		Iterator<String> it = li.iterator();
		
		while(it.hasNext()) { // hasNext�� while�θ�.
			String s = it.next();
			
			if( s.compareTo("two") == 0) {
				it.remove();
			}
		}
		
		it=li.iterator();
		
		while(it.hasNext()) { // hasNext�� while�θ�.
			System.out.println(it.next());
		}
	}
}
