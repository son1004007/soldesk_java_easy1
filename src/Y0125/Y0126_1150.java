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
		
		Music m=new Music("���� ���");
		m.start(); //10��
		
		Movie m1=new Movie("��ȭ ���");
		Thread t=new Thread(m1);
		t.start();
		
		try {
			m.join();
			t.join();
			
		}catch(Exception e) {}
	}
}

/*����ȭ ���
 * 1 synchronized
 * 2 wait notify
 * 3 join
 */
