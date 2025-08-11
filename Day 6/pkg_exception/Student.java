package pkg_exception;
import java.util.Scanner;

public class Student {
	
	public void  validateGrade(double  grade) throws InvalidGradeException {
		if(grade < 0 || grade > 100) {
			throw new InvalidGradeException("Invalid Grade Exception. Grade Must Between 0 to 100");
		} 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter a number of Student:");
		int noOfStudent = sc.nextInt();
		
		try {
			for(int i=0;i<noOfStudent;i++) {
				System.out.println("Enter your name:");
				String name = sc.next();
				
				System.out.println("Enter your Grade:");
				double grade = sc.nextDouble();
				
				System.out.println("Name: " + name);
				try {
					student.validateGrade(grade);
					 System.out.println("Grade: " + grade);
					
				} catch(InvalidGradeException e){
					System.out.println("Caught exception: " + e);
				}
				
			}
		} 
		
		catch(Exception e) {
			System.out.println("Exception: "+ e);
		}
		finally {
			System.out.println("Done");
		}	
		
		sc.close();
		
	}
}
