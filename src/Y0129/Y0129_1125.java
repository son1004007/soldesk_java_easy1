package Y0129;
//4. 다음 main()을 보고 Gen클래스를 만들어라.
//Gen<String> g=new Gen<String>(“seoul”,”busan”);
//System.out.println(g.one());   //seoul 출력
//System.out.println(g.two());   //busan 출력
//System.out.println(g.three(T t));  //false 출력 (두 문자열 비교) 

class Gen<T> {
	T a;
	T b;
	Gen(T a, T b){
		this.a = a;
		this.b = b;
	}
	T one(){
		return a;
	}
	T two(){
		return b;
	}

	boolean three() {
		return a.equals(b);
	}
}
public class Y0129_1125 {
	public static void main(String[] args) {
		
		Gen<String> g=new Gen<String>("seoul","busan");
		System.out.println(g.one());   //seoul 출력
		System.out.println(g.two());   //busan 출력
		System.out.println(g.three());  //false 출력 (두 문자열 비교) 

	}

}
