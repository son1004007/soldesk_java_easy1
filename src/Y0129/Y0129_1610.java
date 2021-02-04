package Y0129;

import java.util.HashMap;
import java.util.Scanner;

public class Y0129_1610 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("ID1", "PW1");
		h.put("ID2", "PW2");
		h.put("ID3", "PW3");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ID 입력해라");
			String id = sc.next();
			
			System.out.println("PW 입력해라");
			String pw = sc.next();
			
			if(!h.containsKey(id)) { // id 없는 경우
				System.out.println("id가 존재하지 않습니다.");
				// ID 입력해라 로 돌아가기위한 continue;
				continue;
				
			}
			else {// id 있는 경우
				if(!(h.get(id).equals(pw))) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				else {
					System.out.println("로그인 성공");
					break; // while(true) 종료
				}
			}
			
		}
	}
}
