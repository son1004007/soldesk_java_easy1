package Y0203;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//3. HashMap인터페이스 구조(이름, 성적)<String, Integer>로 설정해 임의의 값 3개 해쉬맵에 저장한다. 
// 저장 후 평균 점수와 최고점수, 최고 점수를 받은 이름을 출력해라. 
//(entrySet, getKey, getValue 메소드 이용)
//
//4. Double b[](wrapper클래스)에 실수 2개를 넣고 for-each문으로 출력해라.
// Double b[] {3.4, 5.6};

public class Y0203_1100 {

	public static void main(String[] args) {
		
		System.out.println("3번 문제");
		Map<String, Integer> h = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		for(int i =0; i< 3; i++) {
			System.out.print((i+1)+"번 이름 입력\t");
			name = sc.next();
			System.out.print((i+1)+"번 점수 입력\t");
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
		
		System.out.println("hasNext		// 이름 : "+str+"\t최고 점수 : "+max);
		Set<Map.Entry<String, Integer>> s= h.entrySet();
		
		for(Map.Entry<String, Integer> e1 : s) {
			sum+=e1.getValue();
			if(e1.getValue() > max) {
				name =  e1.getKey();
				max = e1.getValue();
			}
			
		}
		double avg = sum/3.0;
		System.out.println("getValue, getKey	// 평균 : "+avg+" 최고 점수 : "+max + " 이름 :" + name);
		sc.close();
		
		System.out.println("4번 문제");
		Double d[] = {3.4, 5.6};
		for(Double b : d) {
			System.out.println(b);
		}
		
	}
}
