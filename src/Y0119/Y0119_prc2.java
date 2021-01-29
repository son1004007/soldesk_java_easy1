package Y0119;
class Color{
	String a,b="black";
	Color(String a){
		this.a=a;
	}
	Color(String a, String b){
		this.a=a;
		this.b=b;
		
	}
	
	void show() {
		System.out.println(a+"╢б "+b);
	}
	
}

public class Y0119_prc2 {

	public static void main(String[] args) {
		Color c1= new Color("╫беб");
		Color c2= new Color("а╓╧н", "red");
	
		c1.show(); // ╫беб╢б black
		c2.show(); // а╓╧ню╨ red
	}
}


//