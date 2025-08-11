package device;

public class SmartTV implements SmartDevice{
	private boolean isTVOn = false;
	private int currentChannel = 3;
	private final int totalChannel = 30;
	private int volume = 10;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		isTVOn = true;
		 System.out.println("Smart TV is turned ON");
		
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		isTVOn = false;
        System.out.println("Smart TV is turned OFF");

		
	}
	public void nextChannel() {
		if(currentChannel < totalChannel)
			currentChannel++;
		else
		{
			currentChannel = 1;
		}
		System.out.println("Change channel to  go next :"+currentChannel);
	
		
	}

	public void previousChannel() {
		if(currentChannel >1 )
		{
			currentChannel--;
		} else
		{
			currentChannel= totalChannel;
		}
		
		
		
		System.out.println("Change channel to  go previous :"+currentChannel);
		
	}
	
	public void increaseSound() {
		if (volume < 50) {
            volume++;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume MAX 50");
        }
	}
	public void decreseSound() {
		if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to: " + volume);
        } 
	}


	
	


	
	

}
