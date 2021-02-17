package Y0121;
class Music{
	String title, singer, time;

	Music (String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	Music (String time){	
		this(time,"방탄");
	}
}
class Cal{
	int a,b;
	static int add(int a, int b) {
		return a+b;
	}
	static int div(int a, int b) {
		return a/b;
	}
		
}



//// 문제 6
//int grade[][]= {{55,60,65},{85,90,95}};
//int high;
//high = get(grade);
//System.out.println("가장 높은 점수는 "+high+"점 입니다.");


public class Y0121_1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//아래 메인을 참고해서 class를 작성해라.
		
		Music m = new Music("On", "BTS");
		System.out.println(m.title+ " "+m.singer);

		Music m1 = new Music("00:00");
		System.out.println(m1.title+ " "+m1.singer);
		
//		문제 4
//		add, div메소드 구현해라. (클래스이름은 Cal이다)
//		main(){
		int a=Cal.add(10,5); //합
		int b=Cal.div(10,5); //몫
		System.out.println(a +" " +b);
		
//		이러한 모양 출력해라
//5.    NNN0        공백 3(j) 숫자 1(n) 0줄(i)
//      NN012		공백 2(j) 숫자 3(n) 1줄(i)
//      N01234		공백 1(j) 숫자 5(n) 2줄(i)
//      0123456		공백 0(j) 숫자 7(n) 3줄(i)
//					
		
		for(int i=0; i<4; i++) {
			for(int j=0 ; j<3-i; j++) {
				System.out.print(" ");
			}
			int n =0;
			for(int j=0; j<(2*i)+1 ; j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}

		}
}





