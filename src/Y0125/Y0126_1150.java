package Y0125;

class Music extends Thread{
	String a;
	Music(String a){this.a=a;}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(a);
		}
	}
}
class Movie implements Runnable{
	String a;
	Movie(String a){this.a=a;}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(a);
		}
	}
}
public class Y0126_1150 {
	public static void main(String[] args) {
		
		Music m=new Music("음악 재생");
		m.start(); //10번
		
		Movie m1=new Movie("영화 재생");
		Thread t=new Thread(m1);
		t.start();
		
		try {
			m.join();
			t.join();
			
		}catch(Exception e) {}
	}
}

/*동기화 방법
 * 1 synchronized
 * 2 wait notify
 * 3 join
 */
