package Y0127;
//5. 다음은 Person인터페이스이다. Worker, Student클래스 작성해라.
//interface Person{
//    String work(); }
//public class 클래스명{
// static void pr(Person p){
//    System.out.println(p.work()); }
//main(){
//pr(new Worker());     // 일한다
//pr(new Student());    //공부한다 출력

interface Person123{
	String work();
}


class Worker implements Person123{

	public String work() {
		String w = "일한다.";
		return w ;
	}
}
class Student implements Person123{

	public String work() {
		String s = "공부한다.";
		return s;
	}
	
}

public class Y0127_1615 {
	
	static void pr(Person123 p) {
		System.out.println(p.work());
	}
	
	public static void main(String[] args) {
		pr(new Worker());
		pr(new Student());
		
	}

}
