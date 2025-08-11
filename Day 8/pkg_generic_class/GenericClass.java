package pkg_generic_class;

public class GenericClass<T> {
	
	
	private T length;
	private T breadth;
	
	private T radius;
	
	private T side;
	
	
	private T base;
	private T height;
	
	
	private T str;
	
	public GenericClass(){
		length = null;
		breadth = null;
		radius = null;
		side = null;
		base  = null;
		height = null;
		
		
		
	}
	public void set(T length, T breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public T getLength() {
		  return length;
	}
	
	public T getBreadth() {
		  return breadth;
	}
	
	public void setRadius(T radius) {
		this.radius = radius;
	}
	
	public T getRadius() {
		return radius;
	}
	
	public void setSide(T side) {
		this.side = side;
	}
	
	public T getSide() {
		return side;
	}
	
	public void setBaseAndHight(T base, T height) {
		this.base = base;
		this.height = height;
	}
	
	public T getBase() {
		return base;
	}
	public T getHeight() {
		return height;
	}
	
	
	public void setStr(T str) {
		this.str = str;
	}
	
	public T getStr() {
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> areaOfReact = new GenericClass<Integer>();
		areaOfReact.set(20, 20);
		
		int area = areaOfReact.getLength() * areaOfReact.getBreadth();
		System.out.println("Aera of ReactAngle: "+ area);
		
		GenericClass<Double> circleObj = new GenericClass<Double>();
		circleObj.setRadius(2.0);
		
		Double areaOfCircle = Math.PI * circleObj.getRadius() * circleObj.getRadius();
		System.out.println("Aera of Circle: "+areaOfCircle );
		
		
		GenericClass<Float> perimeterOfSquare = new GenericClass<Float>();
		perimeterOfSquare.setSide(2.45f);
		
		Float perimeterSquare =  4 * perimeterOfSquare.getSide();
		System.out.println("Perimeter of Square: "+ perimeterSquare );
		
		
		GenericClass<Double> aeraOfTriangle = new GenericClass<Double>();
		aeraOfTriangle.setBaseAndHight(5.5, 8.3);
		
		double aeraTriangle = ((0.5) * aeraOfTriangle.getBase() * aeraOfTriangle.getHeight());
		System.out.println("Aera of Triangle : "+ aeraTriangle );
		
		GenericClass<String> text = new GenericClass<String>();
		text.setStr("Above the the complete examples of Generic class using	String class");
		
		
		System.out.println(text.getStr());
		
		
		
		
		

	}

}
