package Y0129;

import java.util.Vector;

public class Y0129_1430 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(5)); 	// ���� 5�� ��ü ���·� �Է�
		v.add(10); 				//�ڵ� ��ڽ�
		v.add(0,20); 			// index 0���� 20�� �ְڴ�.
		System.out.println(v.size());
		
		for(int i=0; i< v.size(); i++) {
			int n = v.get(i); 	// ���Ϳ��� ����
			System.out.println(n);
		}
	}

}
