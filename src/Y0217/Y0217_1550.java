package Y0217;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Y0217_1550 {
	public static void main(String[] args) throws SQLException {
		Connection conn=null; // DB�� �����ϴ� �������̽�
		PreparedStatement pstm = null; //sql�� ��ü
		ResultSet r = null; // sql�� ���� ��ȯ(���� ���࿡ ���� ����� ����);
		
		try {
			String que ="select * from emp";
			
			conn=Y0217_1500_ojdbcTest.get();
			pstm = conn.prepareStatement(que);
			r=pstm.executeQuery();
			System.out.println("EMPNO\tENAME\tJOB\t\tMGR\tHIREDATE\tSAL\tCOMM\tDEPTNO");
			while(r.next()) {
//				int empno=r.getInt(4);
				String empno=r.getString(1);
				String ename=r.getString(2);
				String job = r.getString(3);
				int mgr=r.getInt(4);
				
				java.sql.Date hiredate = r.getDate(5);
				int sal=r.getInt(6);
				int comm=r.getInt(7);
				int deptno=r.getInt(8);
				
				
				System.out.println(empno+"\t"+ename+"\t"+job+"     \t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno);
			}
		}catch (SQLException e) {
			System.out.println("����Ŭ ���� ����");
		}
		r.close();
		pstm.close();
		conn.close();
		
		
	}

}
