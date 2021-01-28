package Y0125;
class Friend{
	private String name;
	private String phone;

	Friend(String name, String phone){
		this.name=name;  this.phone=phone;
		}

	String get(){
		return name+" "+phone;
		}
}

class ITFriend extends Friend{
	String c;
	ITFriend(String a, String b, String c){
		super(a,b);
		this.c=c;
	}
	void show() {
		System.out.println(super.get()+ " " + c);
	}
}

public class Y0125_1535 {
	public static void main(String[] args) {
		ITFriend it = new ITFriend("홍길동", "010-111-1111", "컴퓨터");
		it.show();         
	}
}
