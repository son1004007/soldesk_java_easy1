package Y0125;

import java.util.Scanner;
class PhoneNum{
	String name;
	String phone;
	PhoneNum(String n,String p){
		name=n;
		phone=p;
		}
	void show() {
		System.out.println("이름" +name);
		System.out.println("번호" +phone);
		}
	}
class School extends PhoneNum{
	String major;
	School(String n,String p, String m){
	 super(n,p);
	 major=m;
	 
	}

 void show() { //오버라이딩
	 super.show();
	 System.out.println("전공" +major);
	 }
 }

class Worker extends PhoneNum{
	String grade;
	Worker(String n, String p, String g) {
		super(n, p);
		this.grade=g;
		}
	void show() {
		super.show();
		System.out.println("직급" +grade);
		}
	}

////////////////////////////////////////////

class Arr{
	PhoneNum[] ary;
	int n;
	Arr(int n){  //생성자안에
		ary=new PhoneNum[n]; //배열 생성코드
		n=0; 
		}
	void add(PhoneNum p) {
		ary[n++]=p; //친구 추가
		}

 void frined(char ch) {
	 Scanner s=new Scanner(System.in);
	 System.out.print("이름 : ");
	 String name=s.next();
	 System.out.print("번호 : ");
	 String num=s.next();
	 switch(ch) {
	 case 'A':
		 System.out.print("전공: ");
		 String major=s.next();
		 //PhoneNum p = new School(name,num,major);
		 add(new School(name,num,major));
		 break;
		 
	 case 'B':
		 System.out.print("직급: ");
		 String grade=s.next();
		 //PhoneNum p = new School(name,num,major);
		 add(new Worker(name,num,grade));
		 break;
		 }
	 }
 void all() {
	 for(int i=0;i<ary.length;i++) {
		 ary[i].show();
		 }
	 }
 }
public class Y0125_1450 {
	public static void main(String[] args) {
		Arr ar=new Arr(5);
		while(true) {
			System.out.println("A.학교 친구 정보");
			System.out.println("B.직장 동료 정보");
			System.out.println("C.종료");
			System.out.println("D.출력");
			System.out.println("문자 입력");
			Scanner s=new Scanner(System.in);
			char c=s.next().charAt(0);
			switch(c) {
			case 'A':
				ar.frined(c);
				break;
			case 'B':
				ar.frined(c);
				break;
			case 'C':
				System.out.println("종료");
				return;
				case 'D':
					ar.all();
					}
			} 
		}
}