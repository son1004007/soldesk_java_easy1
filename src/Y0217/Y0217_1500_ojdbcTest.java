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
			// JDBC 드라이버를 로딩하는 코드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//드라이버들이 읽히면 자동 객체 생성되면서 DriverManager에 등록됨
			conn=DriverManager.getConnection(url,id,pw);
			//DriverManager : Connection 객체를 연결하는 것
			System.out.println("데이터베이스에 연결됐다.");
		}catch(Exception e){ System.out.println("로딩 실패");}
		return conn;
	} //강의내용
	
//	public static void main(String[] args) {
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "sys as sysdba";
//		String password = "oracle";
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver 로딩 성공");
//			DriverManager.getConnection(url, user, password);
//			System.out.println("오라클 연결 성공");
//		} catch (ClassNotFoundException e) {
//			System.out.println("jdbc driver 로딩 실패");
//		} catch (SQLException e) {
//			System.out.println("오라클 연결 실패");
//		}
//	} // 인터넷 참고 내용
	// 참고 URL1 연동 : https://m.blog.naver.com/heartflow89/221003777591
	// 참고 URL2 연동 테스트 소스코드 : https://blog.kuby.co.kr/36
}
