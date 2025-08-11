package Bank_System;

public class BankTranscation {
	private int acct_balance = 10000;
	
	public synchronized void deposit_amt(int amount) {
		acct_balance += amount;
		System.out.println("Amount Deposited: "+ amount);
		System.out.println("BalanceAmount: " + acct_balance);
	}
	
	public synchronized void withdraw_amt(int amount) {
		if(acct_balance >= amount) {
			acct_balance -= amount;
			System.out.println("Amount withdraw: "+ amount);
			System.out.println("Account Balance Amount: "+acct_balance);
		} else {
			System.out.println("Insufficient Balance in your account"+acct_balance);
		}
	}
	
	public int getBalance() {
		return acct_balance;
	}
	
	public static void main(String[] args) {
		BankTranscation obj = new BankTranscation();
		
		Thread t1 =new Thread(
				()-> {
					for(int i=1;i<5;i++){
						obj.deposit_amt(1000);
					try{
						Thread.sleep(500);
					}catch(InterruptedException ie){
						ie.printStackTrace();	
					}
					}				
				});
		
		Thread t2 = new Thread(
				()->{
					for(int i=1;i<=5;i++){
						obj.withdraw_amt(200);
					}
					
					try {
						Thread.sleep(500);
					}catch(InterruptedException ie){
						ie.printStackTrace();	
					}
				});
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();	
		}
		
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();	
		}
		
		System.out.println("Bank Balance: "+ obj.getBalance());
				
	}
}
