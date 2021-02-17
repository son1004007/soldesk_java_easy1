package Y0126;
interface Po{
	abstract void pr(int a, String b); // abstract 생략 가능 
	abstract void pr(String b);
	
}
class Point implements Po{
	public void pr(int a, String b) {
		System.out.println(a+ " "+ b);
	}
	public void pr(String b) {
		System.out.println(b);
	}
}
public class Y0126_1115 {

	public static void main(String[] args) {
//		6. 인터페이스 Po를 만들고 추상메소드 pr을 만들어라. 상속받아 구현해라.
//		 main(){
//		Po p=new Point();
//		            p.pr(30000,"java");   
//		            p.pr("python"); }
//		실행 결과) java책은30000원
//		          python
		
		Po p=new Point();
        p.pr(30000,"java");   
        p.pr("python"); 

	}
}
