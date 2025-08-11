package pkg_employee_menu;

public class ProfessionalDetails {
		private int employeeId;
		private String department;
		private String dateOfJoining;
		private String workLocation;
		private String employmentType;
		
		
		
		public ProfessionalDetails(int employeeId, String department, String dateOfJoining, String workLocation,
				String employmentType) {
			super();
			this.employeeId = employeeId;
			this.department = department;
			this.dateOfJoining = dateOfJoining;
			this.workLocation = workLocation;
			this.employmentType = employmentType;
		}



		public int getEmployeeId() {
			return employeeId;
		}



		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}



		public String getDepartment() {
			return department;
		}



		public void setDepartment(String department) {
			this.department = department;
		}



		public String getDateOfJoining() {
			return dateOfJoining;
		}



		public void setDateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}



		public String getWorkLocation() {
			return workLocation;
		}



		public void setWorkLocation(String workLocation) {
			this.workLocation = workLocation;
		}



		public String getEmploymentType() {
			return employmentType;
		}



		public void setEmploymentType(String employmentType) {
			this.employmentType = employmentType;
		}



		public void display() {
			System.out.println("Professinal Details");
			System.out.println("Employee Id: "+ employeeId);
			System.out.println("Department: "+ department);
			System.out.println("Date of Joining: "+ dateOfJoining);
		}
		
		
}
