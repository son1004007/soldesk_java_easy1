package Y0126;
class Circle126{
	int r;
	double z ;
	Circle126(int r){
		this.r=r;
	}
	public String toString() {
		return r+" ";
	}
	public boolean equals(Object ob) {
		if (this.r == ((Circle126)ob).r) { // 다운캐스팅
			return true;
		}
		return false;
	}
	
}
public class Y0126_1050_test {

	public static void main(String[] args) {
//		5. equals(두 원의 면적이 같은지 비교),  toString메소드를 사용하여 완성시켜라.
//		(반지름이 30임)

		Circle126 a=new Circle126(30);
		Circle126 b=new Circle126(30);
		System.out.println("반지름 "+a);
		System.out.println("반지름 "+b);
		if(a.equals(b)) {//메모리주소의 값을 비교하기 위해 boolean 메소드를 작성함 
			System.out.println("같은 원");
			}
		else{
			System.out.println("다른 원");
			}
	}
}
