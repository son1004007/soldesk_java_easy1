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
			System.out.println("ID �Է��ض�");
			String id = sc.next();
			
			System.out.println("PW �Է��ض�");
			String pw = sc.next();
			
			if(!h.containsKey(id)) { // id ���� ���
				System.out.println("id�� �������� �ʽ��ϴ�.");
				// ID �Է��ض� �� ���ư������� continue;
				continue;
				
			}
			else {// id �ִ� ���
				if(!(h.get(id).equals(pw))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
				else {
					System.out.println("�α��� ����");
					break; // while(true) ����
				}
			}
			
		}
	}
}
