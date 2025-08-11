package pkg_multitreading;

public class MyRunnable implements Runnable{
	@Override
	public void run() {		
		
		for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
	}
	
	public static void main(String[] args) {
		
		 MyRunnable runnable = new MyRunnable();
		 
		Thread t1 = new Thread(runnable , "Thread 1");
		
		Thread t2 = new Thread(runnable , "Thread 2");
		
		
		t1.start();
		try {
			t1.join(); // stop the execute util thread 1 will not finished.
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		t2.start();
		try {
			t2.join(); // stop the execute util thread 1 will not finished.
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		Thread t3 = new Thread(runnable , "Thread 3");
		t3.start();
		
		
		System.out.println("thread 1 is alive: "+ t1.isAlive());
		
		System.out.println("thread 2 is alive: "+ t2.isAlive());

		
		
		
	}

	

}
