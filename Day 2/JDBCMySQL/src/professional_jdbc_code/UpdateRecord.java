package professional_jdbc_code;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateRecord {
	public void update() {
		 String update = 
		            "UPDATE Employees SET empname = 'Kiran Patil', empDepartment = 'HR' WHERE id = 101";

		        try {
		            JDBCConnection db = new JDBCConnection();
		            Connection con = db.connection();

		            Statement st = con.createStatement();

		            int count = st.executeUpdate(update);
		            System.out.println("Updated Record(s): " + count);

		        } catch (Exception e) {
		            System.out.println("Error updating record:");
		            e.printStackTrace();
		        }
	}
}
