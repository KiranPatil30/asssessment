package professional_jdbc_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployee {
    public void insert() throws SQLException {
        String insertRecord = 
            "INSERT INTO Employees VALUES " +
            "(101,'Kiran', 'IT', 'Pune','200000')," +
            "(102, 'Ravi', 'Sales','Bangaluru','22000')," +
            "(103,'Abhi', 'HR', 'Mumbai', '200000')," +
            "(104, 'Virat', 'Marketing','Kolhapur','30000')," +
            "(105, 'Rahul', 'IT', 'Pune',' 70000')";

        try{
        	JDBCConnection db = new JDBCConnection();
        	Connection con = db.connection();
        	
			Statement st =	con.createStatement();
			
			int count = st.executeUpdate(insertRecord);
			System.out.println("Insert Record: "+ count);
			
			
        	
					

        } catch (SQLException e) {
            System.out.println("Error inserting records:");
            e.printStackTrace();
        }
    }
}
