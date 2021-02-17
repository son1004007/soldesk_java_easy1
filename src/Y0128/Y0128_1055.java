package Y0128;
//1. 다음 main함수를 보고 작성해라.
//main(){
// Thread th1=new MovieThread();
// th1.start();
// Thread th2=new Thread(new MusicThread());
// th2.start();
//실행결과) 영화를 재생합니다.영화를 재생합니다. 영화를 재생합니다.
//            음악을 재생합니다. 음악을 재생합니다. 음악을 재생합니다.
//(th2가 먼저 나올수도 있음, 세번씩 출력)
//

class MovieThread extends Thread{
	String a = "영화를 재생합니다.";
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println(a);
		}
	}
}
class MusicThread implements Runnable{

	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println("음악을 재생합니다");
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
