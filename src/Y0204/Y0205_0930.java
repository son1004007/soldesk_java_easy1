package Y0204;

class Gen<T>{
	T a;
	T b;
	Gen(T a, T b){
		this.a = a;
		this.b =b;
	}
	T one() {
		return a;
	}
	T two() {
		return b;
	}
	boolean equal() {
		return a.equals(b);
	}
}
public class Y0205_0930 {
	public static void main(String[] args) {
		Gen<String> g = new Gen<String>("hello", "hi");
		
		System.out.println(g.one());	//hello
		System.out.println(g.two());	//hi
		System.out.println(g.equal());	//false
	}

}
