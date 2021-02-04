package Y0129;

import java.util.Iterator;
import java.util.Vector;

public class Y0129_1510 {

	public static void main(String[] args) {
		// 정수만 들어갈 수 있는 벡터
		// 정수 세개 저장
		Vector<Integer> v = new Vector<Integer>();
		v.add(new Integer(1));
		v.add(2);
		v.add(3);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) { // hasNext는 while로만.
			int n = it.next();
			System.out.println(n);
		}
	}
}
