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
class Ipad extends Note{ // ���߻���� �Ұ���. ���� �������̽��� ���� �ִ�.
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
		//Ipad ��ü ����
		Ipad i1 = new Ipad("white", 1, 10);
		// show�� ����
//		e1.show();
		i1.show();

	}

}
