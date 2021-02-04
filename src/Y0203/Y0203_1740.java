package Y0203;

import java.util.Scanner;

//1. 이름과 id를 입력받아 Person클래스 작성하고 입력한 값 다 출력해라.(객체 배열의 개수는 3개)
//1.2 1번에 이어 다음과 같은 실행결과가 나오도록 코드를 추가해라. (Person객체 배열 사용해라.)

//실행결과)
//이름, id입력: 홍길동 111
//이름, id입력: 김길동 222
//이름, id입력: 박길동 333
//이름뭐니? 홍길동
//답: 111
//이름뭐니? 최길동
//이름없다.
//이름뭐니? Stop

class Person{
	String name;
	String id;
	Person(String name, String id){
		this.name = name;
		this.id = id;
	}
	void show() {
		System.out.println(name + " "+ id);
	}
}

public class Y0203_1740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3];
		
		for(int i =0; i< p.length; i++) {
			System.out.println("이름 id를 입력하세요");
			p[i]= new Person(sc.next(), sc.next());
		}
		System.out.println("모두 출력");
		for(int i =0; i< p.length; i++) {
			p[i].show();
		}
		System.out.println("이름으로 id 출력");
		do {
			System.out.print("이름이 뭐니?");
			String name = sc.next();
			
			if(name.equals("stop")) {
				break;	
			}
			for(int i =0; i<p.length ; i++) {
				if(name.equals(p[i].name)) {
					System.out.println("답 : " + p[i].id);
					break;
				}
				else if (!name.equals(p[i].name) && i == 2) {
					System.out.println("이름없다.");
				}
			}
		}while(true);
		sc.close();
	}
}

