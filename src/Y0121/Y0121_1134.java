package Y0121;
class Music{
	String title, singer, time;

	Music (String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	Music (String time){	
		this(time,"��ź");
	}
}
class Cal{
	int a,b;
	static int add(int a, int b) {
		return a+b;
	}
	static int div(int a, int b) {
		return a/b;
	}
		
}



//// ���� 6
//int grade[][]= {{55,60,65},{85,90,95}};
//int high;
//high = get(grade);
//System.out.println("���� ���� ������ "+high+"�� �Դϴ�.");


public class Y0121_1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ʒ� ������ �����ؼ� class�� �ۼ��ض�.
		
		Music m = new Music("On", "BTS");
		System.out.println(m.title+ " "+m.singer);

		Music m1 = new Music("00:00");
		System.out.println(m1.title+ " "+m1.singer);
		
//		���� 4
//		add, div�޼ҵ� �����ض�. (Ŭ�����̸��� Cal�̴�)
//		main(){
		int a=Cal.add(10,5); //��
		int b=Cal.div(10,5); //��
		System.out.println(a +" " +b);
		
//		�̷��� ��� ����ض�
//5.    NNN0        ���� 3(j) ���� 1(n) 0��(i)
//      NN012		���� 2(j) ���� 3(n) 1��(i)
//      N01234		���� 1(j) ���� 5(n) 2��(i)
//      0123456		���� 0(j) ���� 7(n) 3��(i)
//					
		
		for(int i=0; i<4; i++) {
			for(int j=0 ; j<3-i; j++) {
				System.out.print(" ");
			}
			int n =0;
			for(int j=0; j<(2*i)+1 ; j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}

		}
}





