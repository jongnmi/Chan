

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	// 변수
	protected Connection con = null;
	protected PreparedStatement pstmt = null;
	protected CallableStatement cstmt = null;
	protected ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String username = "scott";
	String password = "tiger";
	
	protected String sql = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("드라이브로딩 예외 발생..");
		}
	}
	// DB 연결
	public void getConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			System.out.println("DB연결예외 발생..");
			e.printStackTrace();
		}
	}
	
	// DB 닫기
	public void dbClose() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(cstmt!=null) cstmt.close();
			if(con!=null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
