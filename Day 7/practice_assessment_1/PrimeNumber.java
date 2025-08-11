package practice_assessment_1;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean checkPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		for(int i =2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a number for check number is prime or not: ");
		int number = sc.nextInt();
		
		PrimeNumber prime = new PrimeNumber();
		boolean isPrime = prime.checkPrime(number);
		
		if(isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " not a prime number");
		}
		
		
		
		

	}

}
