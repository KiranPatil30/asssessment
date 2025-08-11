package app;

import controller.DeviceController;

public class SmartHomeDevices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeviceController controller = new DeviceController();
		controller.controllerLight();
		System.out.println("");
		controller.controllerFan();
		System.out.println("");
		controller.controllerAC();
		System.out.println("");
		controller.controllerTV();
	

	}

}
