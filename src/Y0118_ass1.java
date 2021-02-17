import java.io.PrintWriter;
public class Y0118_ass1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//占쏙옙占쏙옙 assignmnet. page 397 占쏙옙占쏙옙 27 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占싹울옙 占쏙옙占� 
		
		try {
			PrintWriter pw = new PrintWriter("gugu.txt"); // 주인공이면서 장식
			String str="";
			for(int i =1 ; i<=9 ; i++) {
				for(int j = 2 ; j<=9 ; j++) {
//					System.out.print(j+"*"+i+"="+(j*i)+"\t");// 占쏙옙占쏙옙占쏙옙
					str += j+"*"+i+"="+(j*i)+"\t";
					
				}
//				System.out.println();//占쏙옙占쏙옙占쏙옙
				str += "\n";
			}
			
			pw.println(str);
			pw.close();

		}catch(Exception e) {}
	


	}

}

