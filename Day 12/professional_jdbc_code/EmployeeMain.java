package professional_jdbc_code;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		InsertEmployee insertObj = new InsertEmployee();
		DeletingRecord deleteObj = new DeletingRecord();
		UpdateRecord updateObj = new UpdateRecord();
		
		System.out.println("---Employee Menu");
		System.out.println("1. Insert Record");
		System.out.println("2. Delete Record");
		System.out.println("3. Update Record");
		System.out.println("4. Display Record");
		System.out.println("5. Exit");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice between 1 to 5:");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				insertObj.insert();
				break;
			}
			case 2:{
				deleteObj.delete();
				break;
			}
			case 3:{			
				updateObj.update();
				break;
			}
			case 4:{
				String selectQuery  = "select * from employees";
				JDBCConnection db = new JDBCConnection();
	        	Connection con = db.connection();

				Statement st =	con.createStatement();
				ResultSet  rs = st.executeQuery(selectQuery);
				try {
					while(rs.next()) {
						System.out.println(rs.getInt("id") + ", "+ rs.getString("empName")+", "+rs.getString("empDepartment")
						+", "+rs.getString("location")+", "+rs.getString("salary")
								);
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			case 5:
				System.out.println("Exits");
				System.exit(0);
				
			default:
				System.out.println("Choice invalid");
		}
		

	}

}
}
