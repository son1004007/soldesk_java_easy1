package Y0122;

class Tv1521{
	public void on() {
		System.out.println("티비 켜기");
	}
}
interface Computer{
	public void m(); //추상 메소드. 구현할 꺼면 
}
class Com{
	public void m() {
		System.out.println("컴");
	}
}
class Ipad extends Tv1521 implements Computer{
	Com c= new Com(); // class Com의 객체
	public void m() { // interface Computer의 m
		c.m(); // class Com의 m
	}
	public void ip() {
		m(); //interface Computer의 m // implements 로 interface를 불러왔음.
		on(); // class Tv의 on
	}
	
}
public class Y0122_1500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad i = new Ipad();
		Tv1521 t = i; // upcasting
		Computer c = i; // upcasting
		
		i.ip();

	}

}
