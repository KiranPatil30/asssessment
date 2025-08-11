package pkg_generic_class;

public class Box<T> {
	private T item;
	public void set(T item) {
		this.item = item;
	}
	
	public T get () {
		return item;
	}
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.set(100);
		
		System.out.println("Integer Box Vlaue:"+ intBox.get());
		
		Box<String> stringBox = new Box<>();
		stringBox.set("I am Kiran ");
		
		System.out.println("Integer Box Vlaue:"+ stringBox.get());
		System.out.println("");
		
		Box<Character> chBox = new Box<>();
		chBox.set('K');
		
		System.out.println("Aera of ReactAngle: "+ chBox.get());
		System.out.println("");
	}

}
