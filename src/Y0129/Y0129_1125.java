package Y0129;
//4. ���� main()�� ���� GenŬ������ ������.
//Gen<String> g=new Gen<String>(��seoul��,��busan��);
//System.out.println(g.one());   //seoul ���
//System.out.println(g.two());   //busan ���
//System.out.println(g.three(T t));  //false ��� (�� ���ڿ� ��) 

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
		System.out.println(g.one());   //seoul ���
		System.out.println(g.two());   //busan ���
		System.out.println(g.three());  //false ��� (�� ���ڿ� ��) 

	}

}
