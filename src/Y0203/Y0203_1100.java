package Y0203;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//3. HashMap�������̽� ����(�̸�, ����)<String, Integer>�� ������ ������ �� 3�� �ؽ��ʿ� �����Ѵ�. 
// ���� �� ��� ������ �ְ�����, �ְ� ������ ���� �̸��� ����ض�. 
//(entrySet, getKey, getValue �޼ҵ� �̿�)
//
//4. Double b[](wrapperŬ����)�� �Ǽ� 2���� �ְ� for-each������ ����ض�.
// Double b[] {3.4, 5.6};

public class Y0203_1100 {

	public static void main(String[] args) {
		
		System.out.println("3�� ����");
		Map<String, Integer> h = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		for(int i =0; i< 3; i++) {
			System.out.print((i+1)+"�� �̸� �Է�\t");
			name = sc.next();
			System.out.print((i+1)+"�� ���� �Է�\t");
			int score = sc.nextInt();
			h.put(name,  score);
		}
		
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		
		int max =0;
		String str ="";
		int sum=0;
		
		while(it.hasNext()) {
			name=it.next(); 
			int score=h.get(name);
			if(max<score) {
				max=score;
				str=name;
			}
		}
		
		System.out.println("hasNext		// �̸� : "+str+"\t�ְ� ���� : "+max);
		Set<Map.Entry<String, Integer>> s= h.entrySet();
		
		for(Map.Entry<String, Integer> e1 : s) {
			sum+=e1.getValue();
			if(e1.getValue() > max) {
				name =  e1.getKey();
				max = e1.getValue();
			}
			
		}
		double avg = sum/3.0;
		System.out.println("getValue, getKey	// ��� : "+avg+" �ְ� ���� : "+max + " �̸� :" + name);
		sc.close();
		
		System.out.println("4�� ����");
		Double d[] = {3.4, 5.6};
		for(Double b : d) {
			System.out.println(b);
		}
		
	}
}
