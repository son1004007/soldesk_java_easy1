package Y0127;

import java.util.Scanner;

//4. 3���� Circle ��ü �迭�� ����� 
//x, y, r���� �о� 3���� Circle��ü�� �����show()�Լ����� �� ����ض�. 

class Circle{
    private double x,y;
    private int r;
    Circle(double x, double y, int r){
           this.x=x;  
           this.y=y; 
           this.r=r; 
           }
    
    void show(){
      System.out.println(x + "\t" +y + "\t" +r);
      }
    }

public class Y0127_1545 {

	public static void main(String[] args) {
		Circle[] c = new Circle[3];

		Scanner s = new Scanner(System.in);
		for(int i =0 ; i<3; i++) {
			double a = s.nextDouble();
			double b = s.nextDouble();
			int c1 = s.nextInt();
			c[i]= new Circle(a,b,c1);
			c[i].show();
		}
	}
}
