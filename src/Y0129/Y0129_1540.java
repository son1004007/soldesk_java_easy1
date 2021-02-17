package Y0129;

import java.util.Iterator;
import java.util.LinkedList;

public class Y0129_1540 {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("one");
		li.add("two");
		li.add("three");
		
		//이터레이터로 돌리는 도중 two라는 이름과 같으면 two를 제거한다.
		//compareTo()
		Iterator<String> it = li.iterator();
		
		while(it.hasNext()) { // hasNext는 while로만.
			String s = it.next();
			
			if( s.compareTo("two") == 0) {
				it.remove();
			}
		}
		
		it=li.iterator();
		
		while(it.hasNext()) { // hasNext는 while로만.
			System.out.println(it.next());
		}
	}
}
