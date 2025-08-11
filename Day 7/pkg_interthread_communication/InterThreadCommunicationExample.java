package pkg_interthread_communication;

class SharedData {
	   private int data;
	   private boolean hasData = false;
	   // Producer puts data
	   public synchronized void produce(int value) throws InterruptedException {
	       while (hasData) {
	           wait(); // wait if data is already produced
	       }
	       data = value;
	       hasData = true;
	      System.out.println("Produced: " + data);
	       notify(); // notify consumer
	   }
	 
	  
	 
	 
	// Consumer gets data
	   public synchronized void consume() throws InterruptedException {
	       while (!hasData) {
	           wait(); // wait if no data is available
	       }
	      System.out.println("Consumed: " + data);
	       hasData = false;
	       notify(); // notify producer
	   }
	}
	class Producer extends Thread {
	   SharedData shared;
	  Producer(SharedData shared) {
	       this.shared = shared;
	   }
	   public void run() {
	       int value = 1;
	       try {
	           for (int i = 0; i < 5; i++) {
	              shared.produce(value++);
	              Thread.sleep(500); // simulate time delay
	           }
	       } catch (InterruptedException e) {
	          System.out.println(e);
	       }
	   }
	}
	 
	class Consumer extends Thread {
	   SharedData shared;
	 
	  Consumer(SharedData shared) {
	       this.shared = shared;
	   }
	 
	   public void run() {
	       try {
	           for (int i = 0; i < 5; i++) {
	              shared.consume();
	              Thread.sleep(1000); // simulate processing delay
	           }
	       } catch (InterruptedException e) {
	          System.out.println(e);
	       }
	   }
	}
	 
	public class InterThreadCommunicationExample {
	   public static void main(String[] args) {
	       SharedData shared = new SharedData();
	      Producer p = new Producer(shared);
	       Consumer c = new Consumer(shared);
	       p.start();
	       c.start();
	   }
	}