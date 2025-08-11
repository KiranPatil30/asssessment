package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCImpl {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/wipro_java_selenium";
		String username = "root";
		String password = "Ksp@3099";
		
		String query
        = "INSERT INTO employee(empid, ename,salary) VALUES (1008, 'Harry',950000)";
		
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
			int count = st.executeUpdate(query);
			System.out.println("Number of rows effected by this query :"+count);
		}
		catch(SQLException e) {
			System.out.println("SQL Error: "+ e.getMessage());
		}
		
		

	}

}
