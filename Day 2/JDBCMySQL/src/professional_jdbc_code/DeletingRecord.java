package professional_jdbc_code;

import java.sql.Connection;
import java.sql.Statement;

public class DeletingRecord {
	public void delete() {
		try {
			JDBCConnection db = new JDBCConnection();
			Connection con = db.connection();
			
			String deleteRecord = 
					"DELETE from Employees where id = 101";
			
			
			Statement st = con.createStatement();
        	
            int count =  st.executeUpdate(deleteRecord);
            System.out.println("Records deleted: " + count);
			
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
	}
}
