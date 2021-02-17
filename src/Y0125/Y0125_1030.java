package Y0125;

class Tv{
	
	private int size;
	Tv(int size) {
		this.size=size; 
		}
	protected int getsize() {
		return size; 
		}
}
class Tv1 extends Tv {

	String b;
	Tv1(int a, String b) {
		super(a);
		this.b = b;
	}
	void show(){
		System.out.println(b+" "+getsize()+"인치 Tv");
	}
}
public class Y0125_1030 {
	public static void main(String[] args) {		/*
		 * 3. Tv클래스와main()를 보고 Tv클래스를 상속받은 Tv1클래스를작성해라.
class Tv{
private int size;
Tv(int size){
  This.size=size; }
protected int getsize(){
   Return size; }
}

main(){
 Tv1 t=new Tv1(20, “삼성”); 
t.show();}  //삼성 20인치 Tv 출력
*/
		
		 Tv1 t= new Tv1(20, "삼성"); 
    	 t.show();

	}
}