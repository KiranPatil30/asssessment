package pkg_employee_menu;

public class EmployeeLeaves {
	private int earnedLeaves;
	private int casualLeaves;
	private int totalLeaves;
	public EmployeeLeaves(int earnedLeaves, int casualLeaves, int totalLeaves) {
		super();
		this.earnedLeaves = earnedLeaves;
		this.casualLeaves = casualLeaves;
		this.totalLeaves = totalLeaves;
	}
	public int getEarnedLeaves() {
		return earnedLeaves;
	}
	public void setEarnedLeaves(int earnedLeaves) {
		this.earnedLeaves = earnedLeaves;
	}
	public int getCasualLeaves() {
		return casualLeaves;
	}
	public void setCasualLeaves(int casualLeaves) {
		this.casualLeaves = casualLeaves;
	}
	public int getTotalLeaves() {
		return totalLeaves;
	}
	public void setTotalLeaves(int totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	public void display() {
		System.out.println("Employee Leaves");
		System.out.println("Earned Leaves: "+ earnedLeaves);
		System.out.println("Casual Leaves: "+ casualLeaves);

		System.out.println("Total Leaves "+ totalLeaves);
	}
	
	
}
