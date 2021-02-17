package Y0121;

import java.util.Scanner;
public class Y0121_1240 {
	static int get(int grade[][]) {
		int high=0;
		for(int i=0;i<grade.length; i++) {
			for(int j=0;j<grade[i].length ; j++) {
				if(grade[i][j] > high) {
					high = grade[i][j];
				}
			}
		}
		return high;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade[][]= {{55,60,65},{85,90,95}};
		int high=0;
		high = get(grade);

		System.out.println("가장 높은 점수는 "+high+"점 입니다.");
		
//		7. 두 개 배열에서 영어단어를 입력받아 한글을 출력하는 프로그램
//		String eng[]={“student”,”book”,”future”,”note”};
//		String kor[]={“학생”,”책”,”미래”,”노트”};
//		    “stop"을 입력하면 프로그램을 종료시켜라. (while(true), equals() 사용)
//		실행결과) 영어 단어 입력: book
//		책
//		     영어 단어 입력: stop
		//eng 배열의 값과 입력값이 같으면, eng 배열의 위치와 같은 kor 배열의 값을 출력.
		String eng[]={"student","book","future","note"};
		String kor[]={"학생","책","미래","노트"};
		Scanner tmp = new Scanner(System.in);
		while(true) {
			System.out.println("영어 단어 입력");
			String str = tmp.next();
			for (int i=0; i<eng.length ; i++) {
				if(eng[i].equals(str)) {
//				if(eng[i]==str) { 배열의 값과 문자열의 값이 같다고 인식하지 못한다. str이 참조 변수 이기 때문에 못함.
					System.out.println(kor[i]);
				}
			}
			if(str.equals("stop"))
				break;
			
		}
		tmp.close();

	}

}
