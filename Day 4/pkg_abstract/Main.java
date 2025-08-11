package pkg_abstract;

public class Main {
	public static void main(String args[]) {
		Order physicalpProductObj = new PhysicalProductOrder("P100");
		
		physicalpProductObj.process_order();
		physicalpProductObj.print_order_summary();
		System.out.println("");
		
		Order digitalProductObj = new DigitalProductOrder("DP10");
		digitalProductObj.process_order();
		digitalProductObj.print_order_summary();
		
		System.out.println("");
		
		Order serviceObj = new ServiceOrder ("SO10");
		serviceObj.process_order();
		serviceObj.print_order_summary();
		
		
		
		
		
		
	}
}
