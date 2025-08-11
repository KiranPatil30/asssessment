package pkg_interface;

public class Main {
	public static void main(String args[]) {
		
		Playable playableObj = new AudioPlayer();
		playableObj.play();
		Recordable recordableObj = new AudioPlayer();
		recordableObj.record();
			
		
		Playable playableObj1 =  new VideoPlayer();
		playableObj1.play();
		
		Streamable streamableObj = new VideoPlayer();
		streamableObj.stream();
		
		
			
		Recordable recordableObj1 = new Camera();
		recordableObj1.record();
		
		Streamable streamableObj1 = new Camera();
		streamableObj1.stream();
		
		
	}
}
