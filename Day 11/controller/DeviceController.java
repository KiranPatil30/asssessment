package controller;

import device.SmartAC;
import device.SmartFan;
import device.SmartLight;
import device.SmartTV;

public class DeviceController {
	SmartLight light = new SmartLight();
	SmartFan fan = new SmartFan();
	SmartAC ac = new SmartAC();
	SmartTV tv = new SmartTV();
	
	
	public void controllerLight() {
		System.out.println("Control Light:");

		light.turnOn();
		light.increaseSetting();
		light.decreaseSetting();
		light.turnOff();
	}
	
public void controllerFan() {
	System.out.println("Control Fan:");
	fan.turnOn();
	fan.increaseSetting();
	fan.decreaseSetting();
	fan.turnOff();

	}

public void controllerAC() {
	System.out.println("Control AC:");
	ac.turnOn();
	ac.increaseSetting();
	ac.decreaseSetting();
	ac.turnOff();

	
}

public void controllerTV() {
	System.out.println("Control TV:");
	tv.turnOn();
	tv.nextChannel();
	tv.previousChannel();
	tv.increaseSound();
	tv.decreseSound();
	tv.turnOff();

}
	
	
}
