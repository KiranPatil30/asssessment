package pkg_employee_menu;

public class EmployeePersonalDetails {
		private String firstName;
		private String lastName;
		private int age;
		private String dob;
		private String contactNumber;
		
		
	
		public EmployeePersonalDetails(String firstName, String lastName, int age, String dob, String contactNumber) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.dob = dob;
			this.contactNumber = contactNumber;
		}



		public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public String getDob() {
			return dob;
		}



		public void setDob(String dob) {
			this.dob = dob;
		}



		public String getContactNumber() {
			return contactNumber;
		}



		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}



		public void display() {
			System.out.println("Employee Personal Details");
			System.out.println("First Name: "+ firstName);
			System.out.println("Last Name: "+ lastName);
			System.out.println("Age: "+ age);			
			System.out.println("Date of Birth: "+dob);
			System.out.println("Contact Number: "+contactNumber);
			
		}
		
		
		
}
