package main.Java;

public class Box {
	public double areaOfCircle(double radius) {
		final double pi = Math.PI;
		return  pi * radius * radius;
	}
	
	public double areaOfTriangle(int base, int height) {
		return ((0.5) * base * height);
	}
	
	public double areaOfSquare(int side) {
		return side * side;
	}
	
	public int areaOfRectangle(int length , int width) {
		return length * width;
	}
	
	public double simpleInterest(int p, int r, int t) {
		return (p * r * t) / 100;
	}
	
	public double amount(int p , int r, int t) {
		double SI = simpleInterest(p,r,t);
		return  SI + p * Math.pow((1+r/100), t);
	}
}
