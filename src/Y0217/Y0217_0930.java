package Y0217;

import java.util.HashMap;
import java.util.Scanner;

public class Y0217_0930 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("A", 4500);
		h.put("B", 5500);
		h.put("C", 6500);
		
		// 메뉴를 입력받으면, HashMap에서 검색하여 가격을 출력
		// 그만을 입력하면 반복문 끝냄
		
		
		while(true) {
			System.out.println("메뉴를 입력하세요");
			String menu = sc.next();
			if(menu.equals("F")) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println(h.get(menu));
		}
	}
}

/*강사꺼
 * Scanner sc=new Scanner(System.in);
		
		HashMap<String, Integer> h=
				new HashMap<String, Integer>();
		
		h.put("아메리카노", 4500);
		h.put("카푸치노", 5500);
		h.put("라떼", 5500);
		
		while(true) {
			Set<String> k=h.keySet();
			Iterator<String> it=k.iterator();
			
			System.out.println("메뉴 :");
			String s=sc.next();
			
			if(s.equals("그만")) {
				break;
			}
			while(it.hasNext()) {
				String str=it.next();
				if(s.equals(str)) {
					System.out.println(h.get(str)+"원");
					break;
				}
			}
 */
