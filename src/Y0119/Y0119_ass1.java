package Y0119;
// page 418 29�� �ǽ�
class Pet{
	String a, m="����"; 
	int g;
	Pet(String a){
		this.a=a;

	}
	Pet(String a, int g){
		this.a=a;
		this.g=g;
	}
	void show(){
		System.out.println(a+"�� "+m+"�Դϴ�.");
	}
	void age(){
		System.out.println(a+"�� "+g+"���� �Դϴ�.");
	}
}
public class Y0119_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet p1 = new Pet("������",8);
		Pet p2 = new Pet("�����",13);
		
		p1.show();
		p2.show();
		p1.age();
		p2.age();

	}

}
