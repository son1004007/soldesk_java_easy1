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
		System.out.println(b+" "+getsize()+"��ġ Tv");
	}
}
public class Y0125_1030 {
	public static void main(String[] args) {		/*
		 * 3. TvŬ������main()�� ���� TvŬ������ ��ӹ��� Tv1Ŭ�������ۼ��ض�.
class Tv{
private int size;
Tv(int size){
  This.size=size; }
protected int getsize(){
   Return size; }
}

main(){
 Tv1 t=new Tv1(20, ���Ｚ��); 
t.show();}  //�Ｚ 20��ġ Tv ���
*/
		
		 Tv1 t= new Tv1(20, "�Ｚ"); 
    	 t.show();

	}
}