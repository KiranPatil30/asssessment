package pkg_employee_menu;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeePersonalDetails  personalDetails = new EmployeePersonalDetails("Kiran","Patil",24,"13/12/2001", "7756801304");
		ProfessionalDetails professionalDetails = new ProfessionalDetails(101,"IT","15/07/2025", "Pune", "Fulltime");
		SalaryDetails salaryDetails = new SalaryDetails(30000,5000,5000);
		EmployeeLeaves employeeLeaves = new EmployeeLeaves(12,8,20);
		String arr[] = {"Project1","Project2", "Project3"};
		EmloyeeProjectsUndertaken project = new EmloyeeProjectsUndertaken(arr);
		
		System.out.println("--Emoployee Menu--");

		System.out.println("1. Employee Personal Details: ");
		System.out.println("2. Professional Details: ");
		System.out.println("3. Salary Details: ");
		System.out.println("4. Employee Leaves: ");
		System.out.println("5. Emloyee Projects Undertaken: ");
		
		while(true) {
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
		case 1:{
			personalDetails.display();
			break;
		}
		case 2:{
			professionalDetails.display();
			break;
		}
		
		case 3:{
			salaryDetails.display();
			break;
		}
		
		case 4:{
			employeeLeaves.display();
			break;
		}
		case 5:{
			project.display();
			break;
		}
		default:
			System.out.println("Opetion not avialable!. ENter between 1 to 5");
			
		}
		}
		
	}

}
