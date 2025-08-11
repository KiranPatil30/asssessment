package device;

public class SmartAC implements SmartDevice , Adjustable{
	private boolean isAcOn = false;
	private int temperature = 30;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isAcOn = true;
		System.out.println("AC is ON");
		
	}
	
	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		temperature++;
		System.out.println("Temerature increased  ");
		
	}

	@Override
	public void decreaseSetting() {
		// TODO Auto-generated method stub
		temperature--;
		System.out.println("Temeperature decreased ");
		
	}

	

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isAcOn = false;		
		System.out.println("AC is OFF");
	}

}
