package Y0122;

import java.util.Scanner;

class XY{
	int a,b;
	void set(int a, int b){
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+""+b);
	}
}
class XYZ extends XY{
	String s;
	void color(String s) {
		this.s=s;
	}
	void show() {
		//System.out.println(a+""+b+""+s); �پȹٲٷ��� ����.
		super.show();
		System.out.println(s);
	}

}
public class Y0122_1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3. Main()�� ���� Ŭ���� �����ض�
//		(XY�� ����Ŭ����, XYZ�� ����Ŭ����)
//		main(){
		 XY x= new XY();
		 x.set(1,2);
		 x.show();         //1,2 ���

		 XYZ xy=new XYZ();
		 xy.set(4,5);
		 xy.color("blue");
		 xy.show();       //4,5,blue ���   

		 

//		4. �� ����� ������������ �Ѵ�. ����,����,�� �� �ϳ��� ���ڿ��� �Է¹޾� ���� �̰���� �Ǵ��ϴ� ���α׷����ۼ��ض�.
//		(��ø if�� ����ؾ���, ���ڿ� ��) 
//		������) ���� : ����
//		        ö�� : ��
//		       ö���� �̰��.
		 
		 String a="����", b="����", c="��", d, e;
		 
		 Scanner tmp = new Scanner(System.in);
		 
		 System.out.println("���� :" );
		 d = tmp.next();
		 if (d.equals("����")) {
			 e=tmp.next();
			 if(e.equals("����")) {
				 System.out.println("���");
			 }
			 else if(e.equals("����")) {
				 System.out.println("��");
			 }
			 else {
				 System.out.println("�̱�");
			 }
			 
		 }
		 
		 
		 
	}

}
