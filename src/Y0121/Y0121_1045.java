package Y0121;
import java.util.Scanner;
class Song{
	String name, title;
	
	Song(String name, String title){ // 생성자(=추가 클래스)
		this.name = name;
		this.title = title;
	}
}
public class Y0121_1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Song so[] = new Song[2];
		
		String name, title;
		
		for(int i=0; i<so.length ; i++) {
			System.out.println("가수 입력");
			name = s.next();
						
			System.out.println("제목 입력");
			title = s.next();
			
			so[i] = new Song(name, title);
		}
		
		for(int j=0; j<2; j++) {
			System.out.println(so[j].name+" "+so[j].title);
		}
	}

}
