package Y0129;

public class Y0129_1749 {

	static <T> void show(T a[]){
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(T t: a) {
			System.out.println(t);
		}
		
	}
	public static void main(String[] args) {
		String[] str = new String[] {"안녕", "자바", "주말"};
		show(str);
	}
}
