package Y0125;

class Animal{
	String a;
	Animal(String a){
		this.a = a;
	}
	String ani(){
		return a;
	}
}
// 자식 클래스 구현
class Dog extends Animal{
		String b;
		Dog(String a, String b){
			super(a);
			this.b=b;
		}
		String ani() {
			return ani();
		}
		
}

public class Y0125_1226 {
	public static void main(String[] args) {
		Animal a1 = new Dog("강아지", "푸들");
		System.out.println(a1.ani());
				
	}
}
