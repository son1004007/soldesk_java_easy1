package Y0120;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Y0120_Stu_Connect {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ObjectOutputStream os = null;

		try {
			os = new ObjectOutputStream(new FileOutputStream("ob.txt"));
			
			// ��ü���� s
			
			Y0120_Stu s = new Y0120_Stu(); // Stu ȣ��
			s.setName("�ձ⼮");
			s.setAge(99);
			s.setId("sonkk");
			
			os.writeObject(s);
			
		}catch(Exception e) {}
		os.close();
	}

}
