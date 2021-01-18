import java.util.Scanner;
public class Y0118_prc2 {

	//문제 7번
	static void pr(int array[], int a) {
		
		for (int i =0 ; i<a ; i++) {
			int j=array[i]/a, k;
			System.out.println("score/a = "+j);
			for(k=0 ; k<j ; k++) {
				System.out.print("#");
			}
			System.out.println();

		}
		
		
	}
	
	//문제 8번
	static String show(char a, int b) {
		System.out.println("문자 누적시켜 문자열 출력");
		String str="";
		for(int c=0; c<b ; c++ ) {
			str+=a;
		}
		return str;
	}
	
	static String show2(String a, int b) {
		System.out.println("문자열에 이어 붙이기");
		String str="";
		for(int c=0; c<b ; c++ ) {
			str=str.concat(a);
		}
		return str;
	}
	public static void main(String[] args) {
//		7. 다섯 과목 점수가 저장된 배열의 값에 따라 #출력 (#은 5점당 하나씩 출력하며 남는 점수는 버리기. pr함수를 작성
//
//		main(){
//			int score[]=new int[] {58, 60, 86, 90, 84};
//			pr(score, 5) }

		int score[]=new int[] {58, 60, 86, 90, 84};
		pr(score, 5);
		
				 

//		8. 다음 main함수를 보고 반환형을 String값으로 주고 출력해라.
//		main(){
		
//			System.out.println(show(‘$’ , 10));
		System.out.println(show('$', 10));
		// 뭐짜라는건지 이해못함.

		System.out.println(show2("$", 10));
		// 설명 듣고 작성
		
//		9. “공부는 어렵지만, 재밌네요”라는 문자열을 str에 저장한 후,
//		","를 기준으로 문자열을 구분해보고, 인덱스 6에 있는 한 글자를 출력, “공부는” 출력
		
		Scanner tmp = new Scanner(System.in);
		String str = "공부는 어렵지만, 재밌네요";
		String str2[] = str.split(",");
		
		for (String s:str2) {
			System.out.println(s);	
		}
		
		
		System.out.println(str.substring(6,7));
		
		
		if(str.contains("공부는")) {
			System.out.println("공부는");
		}
		

		   //문자열 복습
//			length 길이비교
//			replace 문자열 교체
//			substring 문자열 추출
//			split 문자열 분리
//			trim 앞뒤 공백 제거
//			compareTo 문자열 비교
//			contains 문자열 포함 확인
//			concat 앞 문자열과 문자열 연결
		
		
		
	}

}
