package Y0126;
class Timer extends Thread {
	public void run() {
		for (int i=0; i<=10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class Y0126_1643 {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.start();
		// 0~10���� 1�ʵ��� ���� �� �� ������ / 01234567889 10
	}

}
