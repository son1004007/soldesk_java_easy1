package Y0125;

class Th extends Thread{
	String str;
	Th(String str){
		this.str = str;
	}
	public void run() {
		for(int i = 0; i <10 ; i++) {
			System.out.println(str);
		}
		try {
			sleep(100000000);
		}catch(Exception e) {}
	}
	
}
public class Y0125_1615 {
	public static void main(String[] args) {
		Th t = new Th("¾²·¹µå");
		t.start();
	}
	
}
