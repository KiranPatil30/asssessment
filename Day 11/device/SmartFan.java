package device;

public class SmartFan implements Adjustable, SmartDevice{
	
	private int currentSpeed = 0;
	private boolean isFanOn = false;
	
	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		currentSpeed++;
		System.out.println("Fan speed increases");
	}

	@Override
	public void decreaseSetting() {
		// TODO Auto-generated method stub
		currentSpeed--;
		System.out.println("Fan speed decreases");

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isFanOn = true;
		System.out.println("Fan is ON");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isFanOn = false;
		System.out.println("Fan is OFF");
		
	}

}
