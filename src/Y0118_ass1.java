import java.io.PrintWriter;
public class Y0118_ass1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���� assignmnet. page 397 ���� 27 �������� ���Ͽ� ��� 
		
		try {
			PrintWriter pw = new PrintWriter("gugu.txt");
			String str="";
			for(int i =1 ; i<=9 ; i++) {
				for(int j = 2 ; j<=9 ; j++) {
					System.out.print(j+"*"+i+"="+(j*i)+"\t");// ������
//					str += j+"*"+i+"="+(j*i)+"\t";
					
				}
				System.out.println();//������
//				str += "\n";
			}
			
//			pw.println(str);
//			pw.close();

		}catch(Exception e) {}
	


	}

}

