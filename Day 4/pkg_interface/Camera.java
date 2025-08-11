package pkg_interface;

public class Camera implements Recordable,Streamable {

	@Override
	public void stream() {
		System.out.println("Camera streaming live video.");
	}

	@Override
	public void record() {
		System.out.println("Camera recording video.");
		
	}
	
}
