/*
 * package Y0125;


import java.util.Scanner;

class PhoneNum{
	String name;
	String phone;
	
	PhoneNum(String n, String p){
		name = n;
		phone = p;
	}
	void show() {
		System.out.println("이름" + name);
		System.out.println("전번" + phone);
	}
}
class School extends PhoneNum{
	//전공 추가
	String major;
	School(String n, String p, String major){
		super(n,p);
		this.major = major;
	}
	void show() {
		super.show();
		System.out.println("전공" + major);
	}
}
class Worker extends PhoneNum{
	String grade;
	Worker(String n, String p, String g){
		super(n,p);
		this.grade = g;		
	}
	@Override
	void show() {
		super.show();
		System.out.println("직급"+grade);
	}
	
}
class Arr{
	PhoneNum[] ary;
	int n;
	
	Arr(int n){ 		// 생성자 초기화
		ary = new PhoneNum[n];
		n = 0;
	}
	void add(PhoneNum p) {
		ary[n++] = p; 	// 친구 추가
	}
	void frined(char ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("전화 번호를 입력하세요");
		String num = sc.next();
		
		switch(ch) {
		case 'A' : // 
			System.out.println("전공 입력하세요");
			String major = sc.next();
			//PhoneNum p = new School(name, num, major)
			add(new School(name, num, major));
			break;
		case 'B' : // 
			System.out.println("전공 입력하세요");
			String grade = sc.next();
			//PhoneNum p = new Worker(name, num, grade)
			add(new Worker(name, num, grade));
			break;
		}
		sc.close();
	}
	void all() {
		for(int i = 0; i < ary.length ; i++) {
			ary[i].show();
		}
	}
}
public class Y0125_1245 {
	public static void main(String[] args) {
		
		//Arr class의 객체
		Arr ar = new Arr(5);
		while(true) {
			System.out.println("A 학교 친구 정보");
			System.out.println("B 직장 동료 정보");
			System.out.println("C 종료");
			System.out.println("D 출력");
			System.out.println("문자 입력");
			
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			
			switch (c){
				case 'A' :
					ar.frined(c);
					break;
				case 'B' :
					ar.frined(c);
					break;
				case 'C' :
					System.out.println("종료");
					return;
				case 'D' :
					ar.all();
			}
		}
	}
}
 */
