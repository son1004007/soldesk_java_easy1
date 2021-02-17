package Y0125;

class Fruit{
	void fruit() {
		System.out.println("과일");
	}
}
class Apple extends Fruit{
	void apple() {
		System.out.println("사과");
	}
}
class PineApple extends Apple{
	void pineapple() {
		System.out.println("파인 애플");
	}
}
public class Y0125_1749 {
	static void pr(Fruit f) {
		//Fruit f = new Apple();
		if(f instanceof PineApple) {
			((PineApple)f).pineapple();
			//다운캐스팅할때 클래스 명칭
		}
		else if(f instanceof Apple) {
			((Apple)f).apple();
		}
		else {
			f.fruit();
		}
	}

	public static void main(String[] args) {
		Fruit f=new Fruit();
		Apple a=new Apple();
		PineApple p=new PineApple();
		
		pr(f);
		pr(a);
		pr(p);
		
	}
}
