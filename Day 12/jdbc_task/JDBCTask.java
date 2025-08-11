package jdbc_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mysql
		String url ="jdbc:mysql://localhost:3306/wipro_java_selenium";
		String username = "root";
		String password = "Ksp@3099";
		
		String createTable = """
			    CREATE TABLE Student (
			        id INT,
			        name VARCHAR(40),
			        age INT,
			        email VARCHAR(40),
			        address VARCHAR(50),
			        gender VARCHAR(10),
			        phone VARCHAR(12),
			        department VARCHAR(20),
			        yearOfPassing VARCHAR(20),
			        cgpa VARCHAR(10)
			    )
			    """;

		
		String insertRecord = """
			    INSERT INTO student VALUES 
			        (101, 'Kiran', 23, 'kiran@gmail.com', 'pune', 'male', '7756801304', 'CSE', '2024', '7.8'),
			        (102, 'Ravi', 24, 'ravi@gmail.com', 'mumbai', 'male', '8309780370', 'CSE(AI)', '2025', '8.8'),
			        (103, 'Abhi', 23, 'abhi@gmail.com', 'bangaluru', 'male', '78972913', 'ENTC', '2024', '8.3'),
			        (104, 'Sanket', 20, 'sanket@gmail.com', 'kolhapur', 'male', '897202322', 'IT', '2022', '7.50'),
			        (105, 'Adharsh', 21, 'adharsh@gmail.com', 'satara', 'male', '08078092903', 'Mechanical', '2023', '7.7'),
			        (106, 'Vishal', 22, 'vishal@gmail.com', 'sangli', 'male', '870389034', 'CSE', '2021', '8.90'),
			        (107, 'Atish', 24, 'atish@gmail.com', 'solapur', 'male', '929727981', 'ENTC', '2020', '8.60'),
			        (108, 'Tushar', 25, 'tushar@gmail.com', 'kolhapur', 'male', '98927893', 'CSE', '2024', '7.5'),
			        (109, 'Basu', 26, 'basu@gmail.com', 'kolhapur', 'male', '76098708', 'ENTC', '2025', '9.50'),
			        (110, 'Poonam', 24, 'poonam@gmail.com', 'ichalkaranji', 'female', '798269874', 'CSE(AI)', '2021', '8.20')
			    """;

		
		String deleteRecord = "DELETE from student where id IN (102, 104)";
		
		String updateReord = "UPDATE student set age = 20,phone= '7756801304',yearOfPassing = '2020' where id = 105 ";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
//			int count = st.executeUpdate(createTable);
//			System.out.println("Table Created: "+ count);
			
			
//			int count = st.executeUpdate(insertRecord);
//			System.out.println("10 Record Inserted : "+ count);
			// 10 Record Inserted : 10
		
			
//			int count = st.executeUpdate(deleteRecord);
//			System.out.println(" 2nd and 4th Record deleted : "+ count);
			//2nd and 4th Record deleted : 2
			
			
			int count = st.executeUpdate(updateReord);
			System.out.println(" 5th Record updated : "+ count);
			//  5th Record updated : 1
			
			
			// Display student record 
			String selectQuery  = "select * from student";
			ResultSet  rs = st.executeQuery(selectQuery);
			try {
				while(rs.next()) {
					System.out.println(rs.getInt("id") + ", "+ rs.getString("name")+", "+rs.getString("email"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			st.close();
			con.close();
			
			
		}catch(SQLException e) {
			System.out.println("Error :"+e);
		}
		
	
		

	}

}
