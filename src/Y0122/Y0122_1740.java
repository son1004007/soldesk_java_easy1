package Y0122;

interface Food2{
	String name();

	class Pizza implements Food2{
		public String name() {
			return "피자";
		}	
	}
	class Steak implements Food2{
		public String name() {
			return "스테이크";
		}
}

public class Y0122_1740 {

	static void pr(Food2 f) {
		System.out.println(f.name());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pr(new Pizza());
		pr(new Steak());

	}

}
}
