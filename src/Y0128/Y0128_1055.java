package Y0128;
//1. ���� main�Լ��� ���� �ۼ��ض�.
//main(){
// Thread th1=new MovieThread();
// th1.start();
// Thread th2=new Thread(new MusicThread());
// th2.start();
//������) ��ȭ�� ����մϴ�.��ȭ�� ����մϴ�. ��ȭ�� ����մϴ�.
//            ������ ����մϴ�. ������ ����մϴ�. ������ ����մϴ�.
//(th2�� ���� ���ü��� ����, ������ ���)
//

class MovieThread extends Thread{
	String a = "��ȭ�� ����մϴ�.";
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println(a);
		}
	}
}
class MusicThread implements Runnable{

	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println("������ ����մϴ�");
		}
	}
}
public class Y0128_1055 {

	
	public static void main(String[] args) {
		 Thread th1=new MovieThread();
		 th1.start();
		 Thread th2=new Thread(new MusicThread());
		 th2.start();
	}

}
