package Y0125;
class Th2 implements Runnable{
	String str;
	Th2(String str){
		this.str = str;
	}
	public void run() {
		for(int i = 0; i <10 ; i++) {
			System.out.println(str);
		}
		try {
			Thread.sleep(100000);
		}catch(Exception e) {}
	}
	
}
public class Y0125_1640 {

		public static void main(String[] args) {
			Th2 t = new Th2("쓰레드");
			Thread t1 = new Thread("쓰레드");
			t1.start();
		}
		
}
