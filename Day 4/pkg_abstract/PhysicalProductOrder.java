package pkg_abstract;

public class PhysicalProductOrder extends Order {
	
	PhysicalProductOrder(String order_id) {
		super(order_id);
	}

	@Override
	public void process_order() {
		// TODO Auto-generated method stub
		System.out.println("Shipping physical product for order "+ order_id+".");
	}
	
}
