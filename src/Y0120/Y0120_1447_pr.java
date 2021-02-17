package Y0120;
class Score{
	
	void show(int a[][]) {
		int sum=0, count=0;
		double avg;
		for (int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				sum += a[i][j];
				count++;
			}
		}
		avg= sum/count;
		System.out.println("ÃÑÇÕ : "+sum);
		System.out.println("Æò±Õ : "+avg);
		
	}
}
public class Y0120_1447_pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] grade= {{90,100,80},
	            {70,95,87},
	            {80,90,70},
	            {90,100,100}};
		
		Score s = new Score();
		s.show(grade); // ÀÌÂ÷¿ø¹è¿­ÀÇ Æò±Õ Ãâ·Â
	}

}
