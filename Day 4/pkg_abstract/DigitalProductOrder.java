package pkg_abstract;

public class DigitalProductOrder extends Order {

	DigitalProductOrder(String order_id) {
		super(order_id);
	}

	@Override
	public void process_order() {
		// TODO Auto-generated method stub
		System.out.println("Sending download link for order " + order_id+".");
		
	}

}
