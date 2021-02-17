package Y0121;

class Elec{
	String color;
	Elec(String c){
		this.color=c;
	}
	
}
class Note extends Elec{
	int number;
	Note(String c, int n){
		super(c);
		number=n;
	}
}
class Ipad extends Note{ // 다중상속이 불가능. 이후 인터페이스를 배울수 있다.
	int size;
	Ipad(String c, int n, int s){
		super(c,n);
		size=s;
	}
	void show() {
		System.out.println(color +" "+number+" "+size);
	}
}


public class Y0121_1500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elec e1 = new Note("red", 10);
		//Ipad 객체 생성
		Ipad i1 = new Ipad("white", 1, 10);
		// show에 접근
//		e1.show();
		i1.show();

	}

}
