import java.io.PrintWriter;
public class Y0118_ass1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//숙제 assignmnet. page 397 예제 27 구구단을 파일에 출력 
		
		try {
			PrintWriter pw = new PrintWriter("gugu.txt");
			String str="";
			for(int i =1 ; i<=9 ; i++) {
				for(int j = 2 ; j<=9 ; j++) {
//					System.out.print(j+"*"+i+"="+(j*i)+"\t");// 검증용
					str += j+"*"+i+"="+(j*i)+"\t";
					
				}
//				System.out.println();//검증용
				str += "\n";
			}
			
			pw.println(str);
			pw.close();

		}catch(Exception e) {}
	


	}

}

