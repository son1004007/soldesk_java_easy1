package Y0122;

class Tv1521{
	public void on() {
		System.out.println("Ƽ�� �ѱ�");
	}
}
interface Computer{
	public void m(); //�߻� �޼ҵ�. ������ ���� 
}
class Com{
	public void m() {
		System.out.println("��");
	}
}
class Ipad extends Tv1521 implements Computer{
	Com c= new Com(); // class Com�� ��ü
	public void m() { // interface Computer�� m
		c.m(); // class Com�� m
	}
	public void ip() {
		m(); //interface Computer�� m // implements �� interface�� �ҷ�����.
		on(); // class Tv�� on
	}
	
}
public class Y0122_1500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad i = new Ipad();
		Tv1521 t = i; // upcasting
		Computer c = i; // upcasting
		
		i.ip();

	}

}
