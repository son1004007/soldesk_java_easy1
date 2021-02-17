package Y0122;



import java.util.Scanner;

class Tv{
	String str;
	int y,s;
	Tv(String str, int y, int s){
		this.str = str;
		this.y=y;
		this.s=s;
	}
	void show(){
		System.out.println(y+"년에 "+str+"에서 나온 "+s+"인치 TV");
	}
}
class Score{
	Scanner scr = new Scanner(System.in);
	int m,e,c;
	Score(int m, int e, int c){
		System.out.println("수학 점수를 입력하세요");
		m=scr.nextInt();
		System.out.println("영어 점수를 입력하세요");
		e=scr.nextInt();
		System.out.println("컴터 점수를 입력하세요");
		c=scr.nextInt();
		
		this.m=m;
		this.e=e;
		this.c=c;
	}
	double avg(){
		return (m+e+c)/3.0;
		
	}
}
public class Y0122_1030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Main()를 보고 클래스를 구현해라.
//		main(){
//		   Tv t = new Tv(“삼성”, 2020, 20);
//		   t.show();   //2020년에 삼성에서 나온 20인치 Tv 출력
//
		   Tv t = new Tv("삼성", 2020, 20);
		   t.show();   //2020년에 삼성에서 나온 20인치 Tv 출력
		   
//		2. Main()를 보고 클래스를 구현해라.
//		(math, eng, com점수를 입력받아 구현)
//		Score s= new Score(math, eng, com);
//		System.out.println(“평균은” + s.avg());
		   
		int math=0, eng=0, com=0;
		Score s= new Score(math, eng, com);
		System.out.println("평균은" + s.avg());
		
		
	}

}
