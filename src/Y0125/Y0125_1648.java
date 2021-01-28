package Y0125;
class Th3 extends Thread{
	String str;
	Th3(String str, int n){
		this.str = str;
		setPriority(n); // 쓰레드 우선순위 셋팅
	}
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(str);
			System.out.println(getPriority());
			// 쓰레드 우선순위 얻어냄
		}
	}
}
public class Y0125_1648 {
	public static void main(String[] args) {
		// 쓰레드 우선순위
		Th3 t1 = new Th3("일번", Thread.MAX_PRIORITY);
		Th3 t2 = new Th3("이번", Thread.NORM_PRIORITY);
		Th3 t3 = new Th3("삼번", Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
