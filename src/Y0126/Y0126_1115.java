package Y0126;
interface Po{
	abstract void pr(int a, String b); // abstract ���� ���� 
	abstract void pr(String b);
	
}
class Point implements Po{
	public void pr(int a, String b) {
		System.out.println(a+ " "+ b);
	}
	public void pr(String b) {
		System.out.println(b);
	}
}
public class Y0126_1115 {

	public static void main(String[] args) {
//		6. �������̽� Po�� ����� �߻�޼ҵ� pr�� ������. ��ӹ޾� �����ض�.
//		 main(){
//		Po p=new Point();
//		            p.pr(30000,"java");   
//		            p.pr("python"); }
//		���� ���) javaå��30000��
//		          python
		
		Po p=new Point();
        p.pr(30000,"java");   
        p.pr("python"); 

	}
}
