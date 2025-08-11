package pkg_employee_menu;

public class SalaryDetails {
	private double salary;
	private double houseRentAllownce;
	private double bonus;
	
	public SalaryDetails(double salary, double houseRentAllownce, double bonus) {
		super();
		this.salary = salary;
		this.houseRentAllownce = houseRentAllownce;
		this.bonus = bonus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getHouseRentAllownce() {
		return houseRentAllownce;
	}
	public void setHouseRentAllownce(double houseRentAllownce) {
		this.houseRentAllownce = houseRentAllownce;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void display() {
		System.out.println("Salary Details");
		System.out.println("Salary: "+ salary);
		System.out.println("House Rent Allownce: "+ houseRentAllownce);
		System.out.println("Bonus: "+ bonus);
	}
	
	
}
