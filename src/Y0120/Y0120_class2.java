package Y0120;
class Movie{
	String title;
	int price;
	Movie(String title){
		this.title = title;
	}
	Movie(String title, int price){
		this.title = title;
		this.price = price;
	}
}

public class Y0120_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		
		Movie m1 = new Movie("�ظ�����");
		Movie m2 = new Movie("�����", 2000);
		
		System.out.println(m1.title);
		System.out.println(m2.title+"" + m2.price);
	}

}
