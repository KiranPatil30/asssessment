package pkg_multitreading;

public class Multithrading extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - value "+ i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		Multithrading t1 = new Multithrading();
		t1.setName("Thread - 1");
		
		Multithrading t2 = new Multithrading();
		t2.setName("Thread - 2");
		
		t1.start();
		t2.start();
		
		
		
		
	}
}
