package pkg_exception;

public class ExceptionInCatchBlock {
	
	public static void main(String[] args) {
		try {
			int x = 12/0;
			System.out.println("Division:"+x);
		}
		catch(Exception e) {
			try {
				String str = null;
				System.out.println("LEngth of string:"+ str.length());
			}catch(Exception ee){
				System.out.println("Exception in catch:"+ee);
			}
			System.out.println("Current catch Block:"+e);
		}
//		finally {
//			System.out.println("Finally Block");
//		}
		finally {
			System.out.println("");
		}
	}
}