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
		
		// �޴��� �Է¹�����, HashMap���� �˻��Ͽ� ������ ���
		// �׸��� �Է��ϸ� �ݺ��� ����
		
		
		while(true) {
			System.out.println("�޴��� �Է��ϼ���");
			String menu = sc.next();
			if(menu.equals("F")) {
				System.out.println("�����մϴ�.");
				break;
			}
			System.out.println(h.get(menu));
		}
	}
}

/*���粨
 * Scanner sc=new Scanner(System.in);
		
		HashMap<String, Integer> h=
				new HashMap<String, Integer>();
		
		h.put("�Ƹ޸�ī��", 4500);
		h.put("īǪġ��", 5500);
		h.put("��", 5500);
		
		while(true) {
			Set<String> k=h.keySet();
			Iterator<String> it=k.iterator();
			
			System.out.println("�޴� :");
			String s=sc.next();
			
			if(s.equals("�׸�")) {
				break;
			}
			while(it.hasNext()) {
				String str=it.next();
				if(s.equals(str)) {
					System.out.println(h.get(str)+"��");
					break;
				}
			}
 */
