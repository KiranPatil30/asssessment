package main.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodingExample obj = new CodingExample();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number for reverse Table: ");
//		int n = sc.nextInt();
//		obj.reverseTable(n);
//		
//		System.out.print(obj.printAlphabet());
//		
//		obj.printASCII();
////		
////		System.out.println("Enter count: ");
////		int c = sc.nextInt();
////		System.out.println(obj.numberOfCount(c).toString());
////obj.smallestAndLargest();
//		obj.sumOfDivisibleByNine();
//		obj.onesCompliment(10);
//		obj.twosCompliment(5);
//		obj.fibonacci(5);
//		System.out.println(obj.higestFrequencyChar());
//		System.out.println("!"+obj.replaceFirstVowel());
//		obj.countAll();
//	
		CollectionProblem collObj = new CollectionProblem();
		collObj.shuffleArrayList();
		collObj.extractPortionList();
		collObj.replaceSecondElement();
		collObj.cloneOfHashSet();
		collObj.hashSetToTreeSet();
		collObj.viewMapKey();
		
	}

}
