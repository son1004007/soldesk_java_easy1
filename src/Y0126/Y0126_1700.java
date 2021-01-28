package Y0126;

class Total{
	int sum;
	Total(){
	   sum=0; 
	   }
	void total(int n){
	  sum+=n; 
	  }
	int get(){
	  return sum; 
	  }
}
class AThread extends Thread{
	int a, b;
	Total t;
	AThread (Total t, int a, int b){
		this.t = t;
		this.a = a;
		this.b = b;
	}
	public void run() {
		for(int i =a; i<=b; i++) {
			t.total(i);
		}
		System.out.println(t.get());
	}
}
public class Y0126_1700 {
	public static void main(String[] args) {
		Total t = new Total();
		AThread a = new AThread(t, 1, 50); //1~50 합
		AThread b = new AThread(t, 51, 100); //51~100 합

		a.start();
		try {
			a.join();
			}catch(Exception e) {}
//		System.out.println(t.get());
		
		t.sum = 0;
		//sleep을 사용했으면 했다는 문제였음.
		
		b.start();
		try {
			b.join();
		}catch(Exception e) {}
		
//		System.out.println(t.get());
	}

}
