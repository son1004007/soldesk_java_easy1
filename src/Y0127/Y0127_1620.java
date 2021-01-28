package Y0127;
//6. 다음 main()를 보고 추상 클래스와 추상메소드 작성해라.
//(total 함수는 배열 값(1,2,3,4,5) 총합 리턴받는 함수)
//main(){
//Ab c=new Cd();
//System.out.println(c.total(new int []{1,2,3,4,5}));

abstract class Ab{
	abstract int total(int[] a);
}
class Cd extends Ab{

	int[] a;
	int total(int[] a){
		this.a=a;
		int sum=0;
		for(int i =0 ; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}

public class Y0127_1620 {
	public static void main(String[] args) {
		Ab c = (Ab) new Cd(); // 업캐스팅
		System.out.println(c.total(new int []{1,2,3,4,5}));
	}

}
