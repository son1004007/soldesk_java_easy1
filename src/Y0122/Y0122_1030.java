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
		System.out.println(y+"�⿡ "+str+"���� ���� "+s+"��ġ TV");
	}
}
class Score{
	Scanner scr = new Scanner(System.in);
	int m,e,c;
	Score(int m, int e, int c){
		System.out.println("���� ������ �Է��ϼ���");
		m=scr.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		e=scr.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
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

//		1. Main()�� ���� Ŭ������ �����ض�.
//		main(){
//		   Tv t = new Tv(���Ｚ��, 2020, 20);
//		   t.show();   //2020�⿡ �Ｚ���� ���� 20��ġ Tv ���
//
		   Tv t = new Tv("�Ｚ", 2020, 20);
		   t.show();   //2020�⿡ �Ｚ���� ���� 20��ġ Tv ���
		   
//		2. Main()�� ���� Ŭ������ �����ض�.
//		(math, eng, com������ �Է¹޾� ����)
//		Score s= new Score(math, eng, com);
//		System.out.println(��������� + s.avg());
		   
		int math=0, eng=0, com=0;
		Score s= new Score(math, eng, com);
		System.out.println("�����" + s.avg());
		
		
	}

}
