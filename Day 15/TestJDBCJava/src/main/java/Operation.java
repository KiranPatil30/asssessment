package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operation {
	String url ="jdbc:mysql://localhost:3306/wipro_java_selenium";
	String username = "root";
	String password = "Ksp@3099";
	
	Connection con;
	Statement st;
	public void connection() throws SQLException {
		con = DriverManager.getConnection(url, username, password);
		st = con.createStatement();
	}
	
	
	
	public int insert() throws SQLException {
		String insertRecord = """
			    INSERT INTO department (departmentId, departmentName, location, manageName, contactNumber) VALUES
					(1, 'HR', 'Mumbai', 'rahul', '987793649872'),
					(2, 'Sales', 'Pune', 'Sanket', '7892693762'),
					(3, 'IT', 'bangaluru', 'Shubham', '8767028843'),
					(4, 'Marketing', 'hydrabad', 'AJ', '976937893')

			    """;
		int count = st.executeUpdate(insertRecord);
		System.out.println("Record Inserted : "+ count);
		return count;
	}
	
	public int delete() throws SQLException {
		String deleteRecord = "DELETE from department where departmentId = 3";

		
		int count = st.executeUpdate(deleteRecord);
		System.out.println("Record deleted : "+ count);
		return count;

	}
	
	public int update() throws SQLException {
		String updateReord = "UPDATE department set location = 'delhi' where departmentId = 1 ";
		int count = st.executeUpdate(updateReord);
	
		System.out.println(" Record updated : "+ count);
		return count;
	}


	public void closeConnection() throws SQLException {
		con.close();
	}
	
}
