package pkg_exception;

public class ThrowAndThrows {
	public static void checkAge(int age){
		if(age< 18) {
			throw new IllegalArgumentException("Access denied – You must be at least 18 years old.");
		} else
		{
			System.out.println("Yes you are eligible for voting.");
		}
		
		int x = 90;
		if(x < 100) {
			throw new IllegalArgumentException("less then 100");
		} else
		{
			System.out.println("Ok");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(6);
		} 
		catch(Exception e){
			System.out.println(e);
		}
	}
}
