package Y0128;

//7. main()�Լ��� ����Ŭ���� Book�� �����ض�.
//main(){
//  Book b1=new Book(���ڹ١�); 
//  b1.title();            //�ڹٴ� 40000��
//  Book b2=new Book(�����̽㡱, 30000);
//  b2.title();           //���̽� 30000��


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
		System.out.println(s+"��(��) "+n+"��");
	}
}
public class Y0128_1250 {

	public static void main(String[] args) {
	  Book b1=new Book("�ڹ�"); 
	  b1.title();            //�ڹٴ� 40000��
	  Book b2=new Book("���̽�", 30000);
	  b2.title();           //���̽� 30000��
	}
}
