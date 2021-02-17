package Y0204;

import java.util.HashSet;
import java.util.Iterator;


class Simple{
	int num;
	Simple(int num){
		this.num = num;
	}
	public String toString() {
		return Integer.toString(num);
	}
}
public class Y0205_1700 {

	public static void main(String[] args) {
		HashSet<Simple> h = new HashSet<Simple>();
		h.add(new Simple(30));
		h.add(new Simple(30));
		h.add(new Simple(40));
		
		// 괄호안에 있는 값들 출력
		// iterator
		
		Iterator<Simple> it = h.iterator();

		while(it.hasNext()) {
			
			System.out.println(it.next());
//			Simple s = it.next();
//			System.out.println(s.num);
		}
		
	}
}
