package professional_jdbc_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	Connection con = null;
	public Connection connection() throws SQLException {
		String url ="jdbc:mysql://localhost:3306/wipro_java_selenium";
		String username = "root";
		String password = "Ksp@3099";
		
		
		try {
			con = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			System.out.println("Conncetion error: "+ e);
		}
		
		return con;
		
			
			

	}
}
