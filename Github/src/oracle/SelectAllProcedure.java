package oracle;

import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

public class SelectAllProcedure extends DBConnection {

	public SelectAllProcedure() {}
	public void selectAllStart() {
		try {
			getConnection();
			
			sql = "{call book_all_select(?)}";
			
			cstmt = con.prepareCall(sql);
			
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			// 실행
			cstmt.executeLargeUpdate();
			
			// 첫번째 ? 담긴레코드를 꺼낸다.
			rs=(ResultSet)cstmt.getObject(1);
			
			while(rs.next()) {
				System.out.printf("%d, %s, %d, %s, %s, %s, %s, %s\n", 
						rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
	}

	public static void main(String[] args) {
		new SelectAllProcedure().selectAllStart();

	}

}
