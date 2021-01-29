package Y0119;
// page 418 29번 실습
class Pet{
	String a, m="움직"; 
	int g;
	Pet(String a){
		this.a=a;

	}
	Pet(String a, int g){
		this.a=a;
		this.g=g;
	}
	void show(){
		System.out.println(a+"가 "+m+"입니다.");
	}
	void age(){
		System.out.println(a+"가 "+g+"개월 입니다.");
	}
}
public class Y0119_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet p1 = new Pet("강아지",8);
		Pet p2 = new Pet("고양이",13);
		
		p1.show();
		p2.show();
		p1.age();
		p2.age();

	}

}
