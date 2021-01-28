package Y0127;

import java.util.Scanner;

//4. 3개의 Circle 객체 배열을 만들고 
//x, y, r값을 읽어 3개의 Circle객체를 만들어show()함수에서 다 출력해라. 

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
