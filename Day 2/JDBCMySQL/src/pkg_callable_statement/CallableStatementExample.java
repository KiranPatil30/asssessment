package pkg_callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementExample {
	
	static Connection con = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url ="jdbc:mysql://localhost:3306/wipro_java_selenium";
			String username = "root";
			String password = "Ksp@3099";
			
			con = DriverManager.getConnection(url, username, password);
			
			CallableStatement cst = con.prepareCall("{call empProcedure(? ,? ,?)}");
			
			
			System.out.println("Enter how many emp you need to insert: ");
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.println("Enter a employee name: ");
				String name = sc.next();
				
				cst.setString(1, name);
				System.out.println("Enter a employee salary: ");
				int salary = sc.nextInt();
				
				cst.setInt(2,salary);
				System.out.println("Enter a employee location: ");
				String location = sc.next();
				
				cst.setString(3,location);
				cst.execute();
				
			}
			
			
			System.out.println("Rows inserted ....");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
