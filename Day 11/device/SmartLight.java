package device;

public class SmartLight implements SmartDevice , Adjustable{
	
	private boolean isLightOn = false;
	private int brightness = 5;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isLightOn = true;
		System.out.println("Light is ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isLightOn = false;
		System.out.println("Light is OFF");
		
	}

	@Override
	public void increaseSetting() {
		// TODO Auto-generated method stub
		brightness++;
		System.out.println("Brightness increased");
		
	}

	@Override
	public void decreaseSetting() {
		brightness--;
		System.out.println("Brightness decreaseds");
		
	}
 
}
