package Y0125;

class Fruit{
	void fruit() {
		System.out.println("����");
	}
}
class Apple extends Fruit{
	void apple() {
		System.out.println("���");
	}
}
class PineApple extends Apple{
	void pineapple() {
		System.out.println("���� ����");
	}
}
public class Y0125_1749 {
	static void pr(Fruit f) {
		//Fruit f = new Apple();
		if(f instanceof PineApple) {
			((PineApple)f).pineapple();
			//�ٿ�ĳ�����Ҷ� Ŭ���� ��Ī
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
