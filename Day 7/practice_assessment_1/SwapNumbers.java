package practice_assessment_1;

import java.util.Scanner;

public class SwapNumbers {
	public static void swapValues(int a , int b) {
		a =  a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swaping: "+a +" "+b);
		
	}
	public static void main(String[] args) {		
		SwapNumbers obj = new SwapNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first value: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a second value: ");
		int b = sc.nextInt();
		
		obj.swapValues(a, b);
		
	}

}
