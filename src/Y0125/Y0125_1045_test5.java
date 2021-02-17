package Y0125;
class XY{
	 private int x,y;
	 XY(int x, int y){
	    this.x=x; this.y=y; }
	 int getx(){
	     return x; }
	 int gety(){
	     return y;}
	 protected void move(int x, int y){
	   this.x=x;
	   this.y=y;

	}
}
class XYZ extends XY{
	int x,y;
	String z="";
	XYZ(int x, int y, String z){
		super(x,y);
		this.z=z;
	}
	void setxy(int x, int y){
		move(x,y);
		x=getx();
		y=gety();
		System.out.println(x+" "+y);
	}
	void setcolor(String z) {
		this.z = z;
		System.out.println(z);
	}
	void show() {
		System.out.println(x+" "+y+" "+z);
		System.out.println(getx()+" "+gety()+" "+z);
	}
	
}
public class Y0125_1045_test5 {
	public static void main(String[] args) {
		XYZ xyz= new XYZ(10,10, "red");
		xyz.setxy(20,30);
		xyz.setcolor("blue"); 
		xyz.show();
	}

}

/*
 * 5. main(), XY클래스를 보고 XY를 상속받는 XYZ 클래스를 작성해라.
class XY{
 private int x,y;
 XY(int x, int y){
    this.x=x; this.y=y; }
 int getx(){
     return x; }
 int gety(){
     return y;}
 protected void move(int x, int y){
   this.x=x;
   this.y=y;

}
}

main(){
XYZ xyz= new XYZ(10,10, “red”);
xyz.setxy(20,30);
xyz.setcolor(“blue”); 
xyz.show();
}
 */