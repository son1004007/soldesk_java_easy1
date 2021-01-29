package Y0128;

//7. main()함수를 보고클래스 Book을 구현해라.
//main(){
//  Book b1=new Book(“자바”); 
//  b1.title();            //자바는 40000원
//  Book b2=new Book(“파이썬”, 30000);
//  b2.title();           //파이썬 30000원


class Book{
	String s;
	int n;
	Book(String s){
		this.s=s;
	}
	Book(String s, int n){
		this.s=s;
		this.n=n;
	}
	void title() {
		System.out.println(s+"는(은) "+n+"원");
	}
}
public class Y0128_1250 {

	public static void main(String[] args) {
	  Book b1=new Book("자바"); 
	  b1.title();            //자바는 40000원
	  Book b2=new Book("파이썬", 30000);
	  b2.title();           //파이썬 30000원
	}
}
