package Y0122;

interface IT{
	public void java();
}

class Student2{
	public void study(IT x) {
		x.java();
	}
}

class ITStudent implements IT{
	public void java() {
		System.out.println("�ڹ� ����");
		System.out.println("DB ����");
	}
}
class DBStudent implements IT{
	public void java() {
		System.out.println("�ڹ� ����");
		System.out.println("DB ����");
	}
}

public class Y0122_1750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student2 s=new Student2();
		  ITStudent i=new ITStudent();
		  DBStudent d=new DBStudent();
		  //IT i = new ITStudent();
		  s.study(i); 
		  s.study(d);

	}

}
