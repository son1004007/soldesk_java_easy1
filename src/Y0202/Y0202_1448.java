package Y0202;
//7. Runnable인터페이스를 이용하여 쓰레드를 생성해라. 
//쓰레드는작동 10초 후 종료하게끔 작성해라.

class Th implements Runnable{
	Th(){
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=10;i++) {
			System.out.println((i)+"초");
			
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		System.exit(0);
	}
	
}
public class Y0202_1448 {
	public static void main(String[] args) {
		Th t = new Th();
		Thread th = new Thread(t);
		th.start();
	}

}
