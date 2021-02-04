package Y0129;

import java.util.Vector;

public class Y0129_1430 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(5)); 	// 정수 5를 객체 형태로 입력
		v.add(10); 				//자동 언박싱
		v.add(0,20); 			// index 0에다 20을 넣겠다.
		System.out.println(v.size());
		
		for(int i=0; i< v.size(); i++) {
			int n = v.get(i); 	// 벡터에서 꺼냄
			System.out.println(n);
		}
	}

}
