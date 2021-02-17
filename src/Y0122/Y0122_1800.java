package Y0122;

import java.util.Scanner;
class Profile{
	String name, id;
	Profile(String name, String id){
		this.name = name;
		this.id = id;
	}
}
public class Y0122_1800 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Profile p[]=new Profile[2];
		
		

		//name, id
		String name, id;
		for(int i=0; i<p.length ; i++) {
			System.out.println("name 입력하세요");
			name = s.next();
			System.out.println("id 입력하세요");
			id = s.next();
			p[i]=new Profile(name, id);
		}
		for(int i=0; i<p.length ; i++) {
			System.out.println(p[i].name +" "+ p[i].id);
		}
	}

}
