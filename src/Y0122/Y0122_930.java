package Y0122;

class Circle{
	private double r;
	Circle(double r){
		this.r=r;
	}
	double get() {
		return r;
	}
}
class Cir extends Circle{
	String str;
	Cir(double r, String str) {
		super(r);
		this.str=str;
	}
	void pr(){
		System.out.println(get()*get()*3.14 +" "+str);
	}

}
public class Y0122_930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cir c = new Cir(2.5, "circle");
		c.pr(); //2.5ÀÎ circle Ãâ·Â

	}

}
