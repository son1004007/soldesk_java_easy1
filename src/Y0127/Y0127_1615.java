package Y0127;
//5. ������ Person�������̽��̴�. Worker, StudentŬ���� �ۼ��ض�.
//interface Person{
//    String work(); }
//public class Ŭ������{
// static void pr(Person p){
//    System.out.println(p.work()); }
//main(){
//pr(new Worker());     // ���Ѵ�
//pr(new Student());    //�����Ѵ� ���

interface Person123{
	String work();
}


class Worker implements Person123{

	public String work() {
		String w = "���Ѵ�.";
		return w ;
	}
}
class Student implements Person123{

	public String work() {
		String s = "�����Ѵ�.";
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
