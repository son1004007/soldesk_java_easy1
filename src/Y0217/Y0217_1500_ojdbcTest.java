package Y0217;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Y0217_1500_ojdbcTest {

	public static Connection con;
	public static Connection get() {
		Connection conn=null;
		try {
			String id="sys as sysdba";
			String pw="oracle";
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			// JDBC ����̹��� �ε��ϴ� �ڵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//����̹����� ������ �ڵ� ��ü �����Ǹ鼭 DriverManager�� ��ϵ�
			conn=DriverManager.getConnection(url,id,pw);
			//DriverManager : Connection ��ü�� �����ϴ� ��
			System.out.println("�����ͺ��̽��� ����ƴ�.");
		}catch(Exception e){ System.out.println("�ε� ����");}
		return conn;
	} //���ǳ���
	
//	public static void main(String[] args) {
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "sys as sysdba";
//		String password = "oracle";
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver �ε� ����");
//			DriverManager.getConnection(url, user, password);
//			System.out.println("����Ŭ ���� ����");
//		} catch (ClassNotFoundException e) {
//			System.out.println("jdbc driver �ε� ����");
//		} catch (SQLException e) {
//			System.out.println("����Ŭ ���� ����");
//		}
//	} // ���ͳ� ���� ����
	// ���� URL1 ���� : https://m.blog.naver.com/heartflow89/221003777591
	// ���� URL2 ���� �׽�Ʈ �ҽ��ڵ� : https://blog.kuby.co.kr/36
}
