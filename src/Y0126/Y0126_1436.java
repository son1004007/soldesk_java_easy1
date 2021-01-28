package Y0126;
class Th implements Runnable{
	String str;
	Th(String str){
		this.str=str;
	}
	public void run() {
		System.out.println(str);
	}
}
/*class Th extends Thread{
	String str;
	Th(String str){
		this.str=str;
	}
	public void run() {
		System.out.println(str);
	}
}*/
public class Y0126_1436 {
	public static void main(String[] args) {
		Th t=new Th("¾²·¹µå 1");
		Thread th=new Thread(t);
		th.start(); 
	}

}
