package practice_assessment_1;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestNumber {

	public static int largestNumber(int arr[]) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size  = sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter numbers into the array: ");
		for(int i=0;i<array.length;i++) {
				array[i]  = sc.nextInt();
			}
	
		GreatestNumber obj = new GreatestNumber();
		int ans = obj.largestNumber(array);
	
		System.out.println("Largest Number from array is"+ans);
 }

}
