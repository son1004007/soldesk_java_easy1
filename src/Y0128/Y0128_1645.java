package Y0128;

class Java {
	String title;
	Java(String t) {
		title = t;
	}
	void show() {
		System.out.println(title);
	}
}

class DB {
	int n;
	DB(int n) {
		this.n = n;
	}
	void pr() {
		System.out.println(n);
	}
}

class Program<T> { // 모형자 <>:제네릭 기호
	T t;
	void in(T t) { // void in(A a)
		this.t = t;
	}
	T get() {
		return t;
	}
}

public class Y0128_1645 {

	public static void main(String[] args) {
		Program<Java> p = new Program<Java>();
		p.in(new Java("java"));
		Java j = p.get();
		j.show();
		Program<DB> d = new Program<DB>();
		d.in(new DB(3));
		DB dd = d.get();
		dd.pr();
		// 제네릭(모형자) -> 템플릿(모형자)
		// generic < > angle blanket
		// 컬렉션 프레임워크(Vector, ArrayList, Map, Set)
	}

}