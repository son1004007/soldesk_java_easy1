package Y0120;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Y0120_Stu_Connect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectInputStream is = null;
		try {
			is = new ObjectInputStream(new FileInputStream("ob.txt"));
			
			Y0120_Stu s = (Y0120_Stu) is.readObject(); // ����ȯ. Object��(is)�� Stu��(s)���� ����ȯ
					
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getId());
		}catch(Exception e) {}

	}

}
