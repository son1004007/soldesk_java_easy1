package Y0125;
class Com{
	String a,b,c;
	Com(String a, String b, String c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
public class Y0125_1210 {
	public static void main(String[] args) {
		Com c[] = new Com[3];
		
		for(int i = 0; i < 3; i++) {
			c[i] = new Com("ÀÚ¹Ù","¤¸", "¤·");
			System.out.println(c[i].a);
		}
		
	}
}
